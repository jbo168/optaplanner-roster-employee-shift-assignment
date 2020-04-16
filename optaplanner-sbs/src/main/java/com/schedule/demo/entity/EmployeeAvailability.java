package com.schedule.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.schedule.demo.utils.EmployeeAvailabilityStatus;

import javax.persistence.*;
import javax.validation.constraints.AssertTrue;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author: John Long
 * @create: 01-Apr-2020
 **/
@Entity
@Table(name = "employee_availability")
public class EmployeeAvailability {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employeeAvailabilityId")
    private Long employeeAvailabilityId;

    @Column(name = "startDateTime")
    private LocalDateTime startDateTime;

    @Column(name = "endDateTime")
    private LocalDateTime endDateTime;

    @Column(name = "deptId")
    private Long deptId;

    @Column(name = "employeeId")
    private Long employeeId;

    @Transient
    private EmployeeAvailabilityStatus employeeAvailabilityStatus;

    public EmployeeAvailability() {
    }

    public EmployeeAvailability(Long deptId, Long employeeId,
                                LocalDateTime startDateTime,
                                LocalDateTime endDateTime,
                                EmployeeAvailabilityStatus employeeAvailabilityStatus) {
        this.deptId = deptId;
        this.employeeId = employeeId;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }

//    public EmployeeAvailability(Long deptId, Long employeeId,
//                                LocalDateTime startDateTime,
//                                LocalDateTime endDateTime,
//                                EmployeeAvailabilityStatus employeeAvailabilityStatus) {
//        this.deptId = deptId;
//        this.employeeId = employeeId;
//        this.startDateTime = startDateTime;
//        this.endDateTime = endDateTime;
//    }

    @AssertTrue
    @JsonIgnore
    public boolean isValid() {
        return getDuration().getSeconds() / (60 * 60) < 28;
    }

    @JsonIgnore
    public Duration getDuration() {
        return Duration.between(startDateTime, endDateTime);
    }

    @Override
    public String toString() {
        return employeeId + ":" + startDateTime + "-" + endDateTime;
    }

    public Long getEmployeeAvailabilityId() {
        return employeeAvailabilityId;
    }

    public void setEmployeeAvailabilityId(Long employeeAvailabilityId) {
        this.employeeAvailabilityId = employeeAvailabilityId;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public EmployeeAvailabilityStatus getEmployeeAvailabilityStatus() {
        return employeeAvailabilityStatus;
    }

    public void setEmployeeAvailabilityStatus(EmployeeAvailabilityStatus employeeAvailabilityStatus) {
        this.employeeAvailabilityStatus = employeeAvailabilityStatus;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public EmployeeAvailability inDate(LocalDate startDate, LocalDate endDate){
//        return new EmployeeAvailability()
        return null;
    }
}
