package com.schedule.demo.entity;

import javax.persistence.*;

/**
 * @author: John Long
 * @create: 17-Mar-2020
 **/
@Entity
public class Skill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "skillID")
    private Long skillID;

    @Column(name = "skillName")
    private String skillName;

    @Column(name = "associatedDepartment")
    private String associatedDepartment;

    @Column(name = "deptId")
    private Long deptId;

    public Skill(){

    }

    public Long getSkillID() {
        return skillID;
    }

    public void setSkillID(Long skillID) {
        this.skillID = skillID;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getAssociatedDepartment() {
        return associatedDepartment;
    }

    public void setAssociatedDepartment(String associatedDepartment) {
        this.associatedDepartment = associatedDepartment;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }
}
