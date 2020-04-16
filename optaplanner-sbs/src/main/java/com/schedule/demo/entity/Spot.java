package com.schedule.demo.entity;

import javax.persistence.*;

/**
 * @author: John Long
 * @create: 30-Mar-2020
 **/
@Entity
public class Spot {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "spotId")
    private Long spotId;

    @Column(name = "spotName")
    private String spotName;

    @Column(name = "deptId")
    private Long deptId;

    public Long getSpotId() {
        return spotId;
    }

    public void setSpotId(Long spotId) {
        this.spotId = spotId;
    }

    public String getSpotName() {
        return spotName;
    }

    public void setSpotName(String spotName) {
        this.spotName = spotName;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }
}
