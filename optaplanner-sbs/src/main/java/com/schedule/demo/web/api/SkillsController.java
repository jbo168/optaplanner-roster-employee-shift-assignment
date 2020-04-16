package com.schedule.demo.web.api;

import com.schedule.demo.entity.Skill;
import com.schedule.demo.service.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author: John Long
 * @create: 22-Mar-2020
 **/
@RestController
@RequestMapping("/api")
public class SkillsController {
    @Autowired
    private SkillService skillService;

    public SkillsController(SkillService skillService){
        this.skillService = skillService;
    }

    @RequestMapping("/skills")
    public List<Skill> skillList(){
        return skillService.getAllSkills();
    }

    @PostMapping("/skills")
    public Skill saveSkill(@RequestBody @NotNull Skill skill){
        return skillService.saveSkill(skill);
    }

    @DeleteMapping("/skills/{id}")
    public void deleteSkill(@PathVariable Long skillID){
        skillService.deleteSkill(skillID);
    }
}
