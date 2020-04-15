package com.redhat.optaplannersbs.domain;

/**
 * @author: John Long
 * @create: 17-Mar-2020
 **/

public class Employee {
    private int eid;

    private String name;

    private int skillLevel;

    public Employee(){

    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // constraint getters and setters
    public int getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(int skillLevel) {
        this.skillLevel = skillLevel;
    }


}
