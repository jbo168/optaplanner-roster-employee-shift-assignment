package com.schedule.demo.repository;

import com.schedule.demo.entity.ShiftSwap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftSwapRepository extends JpaRepository<ShiftSwap, Long> {
}
