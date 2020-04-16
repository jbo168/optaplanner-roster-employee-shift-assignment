package com.schedule.demo.repository;

import com.schedule.demo.entity.EmployeeAvailability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeAvailabilityRepository extends JpaRepository<EmployeeAvailability, Long> {
    @Query("select e from EmployeeAvailability e "+
            "where e.deptId = :deptId")
    List<EmployeeAvailability> findAllByDeptId(@Param("deptId") Integer deptID);
}
