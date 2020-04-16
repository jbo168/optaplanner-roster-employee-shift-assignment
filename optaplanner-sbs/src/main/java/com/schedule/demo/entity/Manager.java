package com.schedule.demo.entity;

import com.schedule.demo.utils.AccountType;

import javax.persistence.*;

/**
 * @author: John Long
 * @create: 10-Apr-2020
 **/

@Entity
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "managerId")
    private Long managerId;

    @Column(name = "managerName")
    private String managerName;

    @Column(name = "associatedDepartment")
    private String associatedDepartment;

    @Column(name = "accountType", length = 8)
    @Enumerated(EnumType.STRING)
    private AccountType accountType;

    public Manager(){

    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getAssociatedDepartment() {
        return associatedDepartment;
    }

    public void setAssociatedDepartment(String associatedDepartment) {
        this.associatedDepartment = associatedDepartment;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }
}
