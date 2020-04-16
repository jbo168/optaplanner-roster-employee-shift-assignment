package com.schedule.demo.repository;

import com.schedule.demo.entity.Shift;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ShiftRepository extends JpaRepository<Shift,Long> {

//    @Query("select s from Shift s " +
//            "where s.associatedDepartment = :departmentName " +
//            "order by lower(s.startDateTime) ")
//    List<Shift> findAllByAssociatedDepartment(@Param("departmentName") String departmentName);
//
//    @Query(value = "select spotId from Shift s " +
//            "where s.shiftID = :shiftId", nativeQuery = true)
//    Long findSpotId(@Param("shiftId") Long shiftId);


//    @Query("select distinct sa from Shift sa" +
//            " where sa.associatedDepartment = :associatedDepartment" +
//            " and sa.employee IN :employeeSet" +
//            " and sa.endDateTime >= :startDateTime" +
//            " and sa.startDateTime < :endDateTime" +
//            " order by sa.startDateTime, s.name, e.name")
//    List<Shift> filterWithEmployees(@Param("tenantId") Integer tenantId,
//                                    @Param("employeeSet") Set<Employee> employeeSet,
//                                    @Param("startTime") LocalTime startDateTime,
//                                    @Param("endTime") LocalTime endDateTime);
}
