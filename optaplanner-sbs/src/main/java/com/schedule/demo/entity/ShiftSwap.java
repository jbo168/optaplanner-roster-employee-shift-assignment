package com.schedule.demo.entity;

import javax.persistence.*;
import java.time.LocalTime;

/**
 * @author: John Long
 * @create: 29-Apr-2020
 **/
@Entity
@Table(name = "shift_swap_request")
public class ShiftSwap {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shiftSwapId")
    private Long shiftSwapId;

    @Column(name = "employeeRequestName")
    private String employeeRequestName;

    @Column(name = "currentShiftStartTime")
    private LocalTime currentShiftStartTime;

    @Column(name = "currentShiftEndTime")
    private LocalTime currentShiftEndTime;

    @Column(name = "employeeSwapName")
    private String employeeSwapName;

    @Column(name = "shiftToSwapStartTime")
    private LocalTime shiftToSwapStartTime;

    @Column(name = "shiftToSwapEndTime")
    private LocalTime shiftToSwapEndTime;

    @Column(name = "swapApproved")
    private boolean swapApproved;

    public ShiftSwap(){}

    public Long getShiftSwapId() {
        return shiftSwapId;
    }

    public void setShiftSwapId(Long shiftSwapId) {
        this.shiftSwapId = shiftSwapId;
    }

    public String getEmployeeRequestName() {
        return employeeRequestName;
    }

    public void setEmployeeRequestName(String employeeRequestName) {
        this.employeeRequestName = employeeRequestName;
    }

    public LocalTime getCurrentShiftStartTime() {
        return currentShiftStartTime;
    }

    public void setCurrentShiftStartTime(LocalTime currentShiftStartTime) {
        this.currentShiftStartTime = currentShiftStartTime;
    }

    public LocalTime getCurrentShiftEndTime() {
        return currentShiftEndTime;
    }

    public void setCurrentShiftEndTime(LocalTime currentShiftEndTime) {
        this.currentShiftEndTime = currentShiftEndTime;
    }

    public String getEmployeeSwapName() {
        return employeeSwapName;
    }

    public void setEmployeeSwapName(String employeeSwapName) {
        this.employeeSwapName = employeeSwapName;
    }

    public LocalTime getShiftToSwapStartTime() {
        return shiftToSwapStartTime;
    }

    public void setShiftToSwapStartTime(LocalTime shiftToSwapStartTime) {
        this.shiftToSwapStartTime = shiftToSwapStartTime;
    }

    public LocalTime getShiftToSwapEndTime() {
        return shiftToSwapEndTime;
    }

    public void setShiftToSwapEndTime(LocalTime shiftToSwapEndTime) {
        this.shiftToSwapEndTime = shiftToSwapEndTime;
    }

    public boolean isSwapApproved() {
        return swapApproved;
    }

    public void setSwapApproved(boolean swapApproved) {
        this.swapApproved = swapApproved;
    }
}
