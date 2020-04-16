package com.schedule.demo.repository;

import com.schedule.demo.entity.Spot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SpotRepository extends JpaRepository<Spot, Long> {
    @Query("select s from Spot s "+
            "where s.deptId = :deptId")
    List<Spot> findAllByDeptId(@Param("deptId") Integer deptID);
}
