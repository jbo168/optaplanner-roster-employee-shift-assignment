package com.schedule.demo.repository;

import com.schedule.demo.entity.ShiftChange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftChangeRepository extends JpaRepository<ShiftChange, Long> {
}
