package com.schedule.demo.entity;

import javax.persistence.*;

/**
 * @author: John Long
 * @create: 17-Mar-2020
 **/
@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contractID")
    private Long contractID;

    @Column(name = "contractName")
    private String contractName;

    @Column(name = "maxMinutesPerDay")
    private int maxMinutesPerDay;

    @Column(name = "maxMinutesPerWeek")
    private int getMaxMinutesPerWeek;

    @Column(name = "maxMinutesPerMonth")
    private int getMaxMinutesPerMonth;

    @Column(name = "maxMinutesPerYear")
    private int getMaxMinutesPerYear;

    @Column(name = "associatedDepartment")
    private String associatedDepartment;


    public Contract(){

    }

    public Long getContractID() {
        return contractID;
    }

    public void setContractID(Long contractID) {
        this.contractID = contractID;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String employeeName) {
        this.contractName = employeeName;
    }

    public int getMaxMinutesPerDay() {
        return maxMinutesPerDay;
    }

    public void setMaxMinutesPerDay(int maxMinutesPerDay) {
        this.maxMinutesPerDay = maxMinutesPerDay;
    }

    public int getMaxMinutesPerWeek() {
        return getMaxMinutesPerWeek;
    }

    public void setMaxMinutesPerWeek(int getMaxMinutesPerWeek) {
        this.getMaxMinutesPerWeek = getMaxMinutesPerWeek;
    }

    public int getMaxMinutesPerMonth() {
        return getMaxMinutesPerMonth;
    }

    public void setMaxMinutesPerMonth(int getMaxMinutesPerMonth) {
        this.getMaxMinutesPerMonth = getMaxMinutesPerMonth;
    }

    public int getMaxMinutesPerYear() {
        return getMaxMinutesPerYear;
    }

    public void setMaxMinutesPerYear(int getMaxMinutesPerYear) {
        this.getMaxMinutesPerYear = getMaxMinutesPerYear;
    }

    public String getAssociatedDepartment() {
        return associatedDepartment;
    }

    public void setAssociatedDepartment(String associatedDepartment) {
        this.associatedDepartment = associatedDepartment;
    }
}
