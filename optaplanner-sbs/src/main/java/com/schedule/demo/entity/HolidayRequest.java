package com.schedule.demo.entity;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author: John Long
 * @create: 22-Apr-2020
 **/
@Entity
@Table(name = "holiday_request")
public class HolidayRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "holidayRequestId")
    private Long holidayRequestId;

    @Column(name = "employeeName")
    private String employeeName;

    @Column(name = "fromDate")
    private LocalDate fromDate;

    @Column(name = "toDate")
    private LocalDate toDate;

    @Column(name = "holidayRequestApproval")
    private boolean holidayRequestApproval;

    public HolidayRequest(){}

    public Long getHolidayRequestId() {
        return holidayRequestId;
    }

    public void setHolidayRequestId(Long holidayRequestId) {
        this.holidayRequestId = holidayRequestId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    public boolean isHolidayRequestApproval() {
        return holidayRequestApproval;
    }

    public void setHolidayRequestApproval(boolean holidayRequestApproval) {
        this.holidayRequestApproval = holidayRequestApproval;
    }
}
