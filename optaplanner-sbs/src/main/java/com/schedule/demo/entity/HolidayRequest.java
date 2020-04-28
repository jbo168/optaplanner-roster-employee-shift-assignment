package com.schedule.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

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

    @Column(name = "dateFrom")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateFrom;

    @Column(name = "dateTo")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate dateTo;

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

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate fromDate) {
        this.dateFrom = fromDate;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate toDate) {
        this.dateTo = toDate;
    }

    public boolean isHolidayRequestApproval() {
        return holidayRequestApproval;
    }

    public void setHolidayRequestApproval(boolean holidayRequestApproval) {
        this.holidayRequestApproval = holidayRequestApproval;
    }
}
