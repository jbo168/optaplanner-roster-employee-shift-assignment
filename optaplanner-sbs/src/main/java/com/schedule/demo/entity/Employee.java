package com.schedule.demo.entity;

import com.schedule.demo.utils.Departments;
import com.schedule.demo.utils.EmployeeType;

import javax.persistence.*;

/**
 * @author: John Long
 * @create: 17-Mar-2020
 **/
    @Entity
    public class Employee {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "employeeId")
        private Long employeeId;

        @Column(name = "employeeName")
        private String employeeName;

        @Column(name = "skillLevel")
        private int skillLevel;

        @Column(name = "employeeType")
        @Enumerated(EnumType.STRING)
        private EmployeeType employeeType;

        @Column(name = "associatedDepartment")
        @Enumerated(EnumType.STRING)
        private Departments associatedDepartment;

        @Column(name = "sectionId")
        private Long sectionId;

        @Column(name = "weeklyShiftAllowance")
        private int weeklyShiftAllowance;

    public Employee(){

    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long eid) {
        this.employeeId = eid;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    public Departments getAssociatedDepartment() {
        return associatedDepartment;
    }

    public void setAssociatedDepartment(Departments associatedDepartment) {
        this.associatedDepartment = associatedDepartment;
    }

    public Long getSectionId() {
        return sectionId;
    }

    public void setSectionId(Long sectionId) {
        this.sectionId = sectionId;
    }

    // constraint getters and setters
    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }

    public int getWeeklyShiftAllowance() {
        return weeklyShiftAllowance;
    }

    public void setWeeklyShiftAllowance(int weeklyShiftAllowance) {
        this.weeklyShiftAllowance = weeklyShiftAllowance;
    }
}
