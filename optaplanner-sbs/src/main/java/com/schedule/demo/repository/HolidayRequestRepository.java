package com.schedule.demo.repository;

import com.schedule.demo.entity.HolidayRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HolidayRequestRepository extends JpaRepository<HolidayRequest,Long> {
}
