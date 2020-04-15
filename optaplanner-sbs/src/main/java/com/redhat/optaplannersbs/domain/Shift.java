package com.redhat.optaplannersbs.domain;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

import java.time.LocalTime;

/**
 * @author: John Long
 * @create: 17-Mar-2020
 **/
@PlanningEntity
public class Shift {
    private int sid;

    private LocalTime startTime;

    private LocalTime endTime;

    private int requiredSkillLevel;
    
    @PlanningVariable(valueRangeProviderRefs = "employee")
    private Employee employee;

    public Shift(){

    }

    public Shift(Long deptId, Long spotId, LocalTime startTime,
                 LocalTime endTime, Long employeeId){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }


    // planning variable getter and setter

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getRequiredSkillLevel() {
        return requiredSkillLevel;
    }

    public void setRequiredSkillLevel(int requiredSkillLevel) {
        this.requiredSkillLevel = requiredSkillLevel;
    }
}
