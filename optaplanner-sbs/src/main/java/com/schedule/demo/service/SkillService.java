package com.schedule.demo.service;

import com.schedule.demo.entity.Skill;
import com.schedule.demo.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: John Long
 * @create: 18-Mar-2020
 **/
@Service
public class SkillService {
    @Autowired
    private SkillRepository skillRepository;

    public List<Skill> getAllSkills() {
        return skillRepository.findAll();
    }

    public Skill saveSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    public void deleteSkill(Long skillID) {
        skillRepository.deleteById(skillID);
    }
}
