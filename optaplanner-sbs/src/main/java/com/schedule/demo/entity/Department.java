package com.schedule.demo.entity;

import javax.persistence.*;

/**
 * @author: John Long
 * @create: 17-Mar-2020
 **/
@Entity
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "departmentID")
    private Long departmentID;

    @Column(name = "departmentName")
    private String departmentName;

    public Department(){

    }

    public Long getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Long departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
