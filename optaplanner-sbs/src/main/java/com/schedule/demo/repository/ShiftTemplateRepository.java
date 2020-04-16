package com.schedule.demo.repository;

import com.schedule.demo.entity.ShiftTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ShiftTemplateRepository extends JpaRepository<ShiftTemplate, Long> {

    @Query(value = "SELECT st FROM ShiftTemplate st " +
            "WHERE st.employeeId = :employeeId " +
            "AND st.startDate BETWEEN :startDate AND :endDate " +
            "AND st.endDate BETWEEN :startDate AND :endDate", nativeQuery = true)
    List<ShiftTemplate> getShiftsForEmployee(@Param("employeeId") Long employeeId,
                                             @Param("startDate") LocalDate startDate,
                                             @Param("endDate") LocalDate endDate);
}
