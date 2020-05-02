package com.schedule.demo.entity;

import com.schedule.demo.utils.Departments;
import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

import javax.persistence.*;
import java.time.LocalTime;

/**
 * @author: John Long
 * @create: 17-Mar-2020
 **/
@PlanningEntity
@Entity
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shiftId")
    private Long shiftId;

    @Column(name = "startTime")
    private LocalTime startTime;

    @Column(name = "endTime")
    private LocalTime endTime;

    @Column(name = "day")
    private String day;

    @Column(name = "requiredSkillLevel")
    private int requiredSkillLevel;

    @Column(name = "shiftAmount")
    private int shiftAmount;

    @Column(name = "employeeId")
    private Long employeeId;

    @Column(name = "associatedDepartment")
    @Enumerated(EnumType.STRING)
    private Departments associatedDepartment;

    @Transient
    @PlanningVariable(valueRangeProviderRefs = "employee")
    private Employee employee;

    public Shift(){

    }

    public Shift(Long deptId, Long spotId, LocalTime startTime,
                 LocalTime endTime, Long employeeId){
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getShiftId() {
        return shiftId;
    }

    public void setShiftId(Long sid) {
        this.shiftId = sid;
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

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
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

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getShiftAmount() {
        return shiftAmount;
    }

    public void setShiftAmount(int shiftAmount) {
        this.shiftAmount = shiftAmount;
    }


}
