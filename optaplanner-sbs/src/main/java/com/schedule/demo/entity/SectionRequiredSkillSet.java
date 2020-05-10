package com.schedule.demo.entity;

import javax.persistence.*;

/**
 * @author: John Long
 * @create: 30-Mar-2020
 **/
@Entity
@Table(name = "section_required_skill_set")
public class SectionRequiredSkillSet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sectionRequiredSkillSetId")
    private Long sectionRequiredSkillSetId;

    @Column(name = "sectionId")
    private Long sectionId;

    @Column(name = "skillId")
    private Long skillId;

    public Long getSectionRequiredSkillSetId() {
        return sectionRequiredSkillSetId;
    }

    public void setSectionRequiredSkillSetId(Long sectionRequiredSkillSetId) {
        this.sectionRequiredSkillSetId = sectionRequiredSkillSetId;
    }

    public Long getSectionId() {
        return sectionId;
    }

    public void setSectionId(Long sectionId) {
        this.sectionId = sectionId;
    }

    public Long getSkillId() {
        return skillId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }
}
