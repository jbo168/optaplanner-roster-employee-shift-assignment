package com.schedule.demo.repository;

import com.schedule.demo.entity.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SectionRepository extends JpaRepository<Section, Long> {
    @Query("select s from Section s "+
            "where s.deptId = :deptId")
    List<Section> findAllByDeptId(@Param("deptId") Integer deptID);
}
