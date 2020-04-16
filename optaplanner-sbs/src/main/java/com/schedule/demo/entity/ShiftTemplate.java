package com.schedule.demo.entity;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author: John Long
 * @create: 05-Apr-2020
 **/
@Entity
@Table(name = "shift_template")
public class ShiftTemplate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shiftTemplateId")
    private Long shiftTemplateId;

//    @Column(name = "startTime")
//    private LocalTime startTime;
//
//    @Column(name = "endTime")
//    private LocalTime endTime;

    @Column(name = "startDate")
    private LocalDate startDate;

    @Column(name = "endDate")
    private LocalDate endDate;

    @Column(name = "shiftId")
    private Long shiftId;

    @Column(name = "spotId")
    private Long spotId;

    @Column(name = "employeeId")
    private Long employeeId;

    @Column(name = "deptId")
    private Long deptId;

    public ShiftTemplate(){}

//    public ShiftTemplate(Long deptId, Long spotId,
//                         LocalTime startTime, LocalTime endTime,
//                         Long employeeId) {
//        this.deptId  = deptId;
//        this.spotId = spotId;
//        this.employeeId = employeeId;
//        this.startTime = startTime;
//        this.endTime = endTime;
//    }

    public Shift createShiftOnDate(LocalDate startDate){
//        LocalDateTime startDateTime = startDate.atTime(getStartTime());
//
//        LocalDate endDate = startDate;
//        LocalDateTime endDateTime = endDate.atTime(getEndTime());
//
//        LocalDateTime startTime = startDate.atTime(getStartTime());
//        LocalDateTime endTime  = startDate.atTime(getEndTime());
//
//        Shift shift = new Shift(getDeptId(), getSpotId(), startTime, endTime, getEmployeeId());
//        shift.setEmployeeId(employeeId);
//        return shift;

        return null;
    }

    public Long getShiftTemplateId() {
        return shiftTemplateId;
    }

    public void setShiftTemplateId(Long shiftID) {
        this.shiftTemplateId = shiftID;
    }

//    public LocalTime getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime(LocalTime startTime) {
//        this.startTime = startTime;
//    }
//
//    public LocalTime getEndTime() {
//        return endTime;
//    }
//
//    public void setEndTime(LocalTime endTime) {
//        this.endTime = endTime;
//    }

    public Long getSpotId() {
        return spotId;
    }

    public void setSpotId(Long spotId) {
        this.spotId = spotId;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }


    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Long getShiftId() {
        return shiftId;
    }

    public void setShiftId(Long shiftId) {
        this.shiftId = shiftId;
    }
}
