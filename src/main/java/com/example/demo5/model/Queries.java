package com.example.demo5.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "table1") 

public class Queries {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Integer age;
    @Column(name = "active")
    private Boolean active;
    @Column(name = "phonenumber")
    private Long phonenumber = (long) (Math.random()*Math.pow(10,10));
    @Column(name = "description")
    private String description;
    @Column(name = "salary")
    private Double salary = Math.random()*100000;


    public Queries() {
    }


    public Queries(Long id, String name, Integer age, Boolean active, Long phonenumber, String description,
            Double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.active = active;
        this.phonenumber = phonenumber;
        this.description = description;
        this.salary = salary;
    }


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }


    public Boolean getActive() {
        return active;
    }


    public void setActive(Boolean active) {
        this.active = active;
    }


    public Long getPhonenumber() {
        return phonenumber;
    }


    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }


    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }


    public Double getSalary() {
        return salary;
    }


    public void setSalary(Double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Query [id=" + id + ", name=" + name + ", age=" + age + ", active=" + active + ", phonenumber="
                + phonenumber + ", description=" + description + ", salary=" + salary + "]";
    }

    

    

    


    
}
