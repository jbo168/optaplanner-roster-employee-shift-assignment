package com.schedule.demo.entity;

import javax.persistence.*;
import java.time.LocalTime;

/**
 * @author: John Long
 * @create: 21-Apr-2020
 **/
@Entity
@Table(name = "shift_change")
public class ShiftChange {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shiftChangeId")
    private Long shiftChangeId;

    @Column(name = "employeeName")
    private String employeeName;

    @Column(name = "currentShiftStartTime")
    private LocalTime currentShiftStartTime;

    @Column(name = "currentShiftEndTime")
    private LocalTime currentShiftEndTime;

    @Column(name = "currentShiftDay")
    private String currentShiftDay;

    @Column(name = "shiftChangeStartTime")
    private LocalTime shiftChangeStartTime;

    @Column(name = "shiftChangeEndTime")
    private LocalTime shiftChangeEndTime;

    @Column(name = "shiftChangeDay")
    private String shiftChangeDay;

    @Column(name = "shiftChangeApproved")
    private boolean shiftChangeApproved;


    public ShiftChange(){}

    public Long getShiftChangeId() {
        return shiftChangeId;
    }

    public void setShiftChangeId(Long shiftChangeId) {
        this.shiftChangeId = shiftChangeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
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

    public String getCurrentShiftDay() {
        return currentShiftDay;
    }

    public void setCurrentShiftDay(String currentShiftDay) {
        this.currentShiftDay = currentShiftDay;
    }

    public LocalTime getShiftChangeStartTime() {
        return shiftChangeStartTime;
    }

    public void setShiftChangeStartTime(LocalTime shiftSwapStartTime) {
        this.shiftChangeStartTime = shiftSwapStartTime;
    }

    public LocalTime getShiftChangeEndTime() {
        return shiftChangeEndTime;
    }

    public void setShiftChangeEndTime(LocalTime shiftSwapEndTime) {
        this.shiftChangeEndTime = shiftSwapEndTime;
    }

    public String getShiftChangeDay() {
        return shiftChangeDay;
    }

    public void setShiftChangeDay(String swapShiftDay) {
        this.shiftChangeDay = swapShiftDay;
    }

    public boolean isShiftChangeApproved() {
        return shiftChangeApproved;
    }

    public void setShiftChangeApproved(boolean shiftChangeApproved) {
        this.shiftChangeApproved = shiftChangeApproved;
    }
}
