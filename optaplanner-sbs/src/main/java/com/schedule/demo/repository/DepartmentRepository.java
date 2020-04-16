package com.schedule.demo.repository;

import com.schedule.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    @Query(value = "SELECT * FROM department", nativeQuery = true)
    List<Department> findAllDepartments();

    @Query(value = "SELECT * FROM department where departmentName = :associatedDepartment", nativeQuery = true)
    Optional<Department> findByDepartmentName(@Param("associatedDepartment") String associatedDepartment);
}
