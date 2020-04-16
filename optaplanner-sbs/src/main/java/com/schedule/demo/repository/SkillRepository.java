package com.schedule.demo.repository;

import com.schedule.demo.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: John Long
 * @create: 18-Mar-2020
 **/
@Repository
public interface SkillRepository extends JpaRepository<Skill,Long> {

    @Query("select s from Skill s " +
            "where s.associatedDepartment = :departmentName " +
            "order by lower(s.skillName) ")
    List<Skill> findAllByAssociatedDepartment(@Param("departmentName") String departmentName);


    @Query("select s from Skill s "+
            "where s.deptId = :deptId")
    List<Skill> findAllByDeptId(@Param("deptId") Integer deptID);
}
