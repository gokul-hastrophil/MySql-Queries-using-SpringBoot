package com.example.demo5.service; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo5.model.Queries;
import com.example.demo5.repository.QueryRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional

public class QueryService {

    @Autowired
    QueryRepository queryRepository;

    public List<Queries> getTableDatas() {
        return queryRepository.findAllData();
    }
    
    public List<Queries> getDetail(Boolean activeState, List<String> descriptionList){
        return queryRepository.findData(activeState, descriptionList);
    }

    public List<Queries> getTableData() {
        return queryRepository.findAlldetail();
    }

    public int updateDatas(Boolean activeState, List<Long> idList) {
        return queryRepository.updateData(activeState, idList);
    }


}
