package com.schedule.demo.repository;

import com.schedule.demo.entity.Shift;
import com.schedule.demo.utils.Departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ShiftRepository extends JpaRepository<Shift,Long> {

    @Query("select s from Shift s " +
            "where s.associatedDepartment = :departmentName")
    List<Shift> findAllShiftsForDept(@Param("departmentName") Departments deptName);
}
