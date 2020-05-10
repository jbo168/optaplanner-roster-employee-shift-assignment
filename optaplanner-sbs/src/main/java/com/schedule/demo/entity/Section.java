package com.schedule.demo.entity;

import javax.persistence.*;

/**
 * @author: John Long
 * @create: 30-Mar-2020
 **/
@Entity
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sectionId")
    private Long sectionId;

    @Column(name = "sectionName")
    private String sectionName;

    @Column(name = "deptId")
    private Long deptId;

    public Long getSectionId() {
        return sectionId;
    }

    public void setSectionId(Long sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }
}
