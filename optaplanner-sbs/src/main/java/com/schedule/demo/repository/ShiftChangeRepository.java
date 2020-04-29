package com.schedule.demo.repository;

import com.schedule.demo.entity.ShiftChangeRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShiftChangeRepository extends JpaRepository<ShiftChangeRequest, Long> {

//    @Query(value = "SELECT * FROM shift_change", nativeQuery = true)
//    List<ShiftChangeRequest> getAllShiftChanges();

}
