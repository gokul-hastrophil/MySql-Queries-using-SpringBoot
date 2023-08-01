package com.example.demo5.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo5.model.Queries;

public interface QueryRepository extends JpaRepository<Queries, Long> {

    @Query("select q from Queries q")
    List<Queries> findAllData();
    
    @Query("select q from Queries q where q.active=false")
    List<Queries> findAlldetail();

    @Query("select q from Queries q where q.active=:activeState and q.description in :descriptionList")
    List<Queries> findData(@Param("activeState") Boolean activeState, @Param("descriptionList") List<String> descriptionList);
    


    @Modifying
    @Query("update Queries q set q.active = ?1 where q.id in ?2")
    int updateData(Boolean activeState, List<Long> idList);


}
