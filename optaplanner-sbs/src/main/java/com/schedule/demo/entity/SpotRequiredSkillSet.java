package com.schedule.demo.entity;

import javax.persistence.*;

/**
 * @author: John Long
 * @create: 30-Mar-2020
 **/
@Entity
@Table(name = "spot_required_skill_set")
public class SpotRequiredSkillSet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "spotRequiredSkillSetId")
    private Long spotRequiredSkillSetId;

    @Column(name = "spotId")
    private Long spotId;

    @Column(name = "skillId")
    private Long skillId;

    public Long getSpotRequiredSkillSetId() {
        return spotRequiredSkillSetId;
    }

    public void setSpotRequiredSkillSetId(Long spotRequiredSkillSetId) {
        this.spotRequiredSkillSetId = spotRequiredSkillSetId;
    }

    public Long getSpotId() {
        return spotId;
    }

    public void setSpotId(Long spotId) {
        this.spotId = spotId;
    }

    public Long getSkillId() {
        return skillId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }
}
