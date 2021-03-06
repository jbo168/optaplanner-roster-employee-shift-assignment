package com.schedule.demo.repository;

import com.schedule.demo.entity.Employee;
import com.schedule.demo.utils.Departments;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    @Query(value = "SELECT * FROM employee", nativeQuery = true)
    List<Employee> findAllEmployees();

    @Query("select e from Employee e " +
            "where e.associatedDepartment = :departmentName")
    List<Employee> findAllEmployeesForDept(@Param("departmentName") Departments departmentName);

//    @Query("select e from Employee e " +
//            "where e.associatedDepartment = :departmentName " +
//            "order by lower(e.employeeName) ")
//    List<Employee> findAllByAssociatedDepartment(@Param("departmentName") String departmentName);
//
//    @Query("select e from Employee e "+
//            "where e.deptId = :deptId")
//    List<Employee> findAllByDeptId(@Param("deptId") Integer deptID);


//    @Query(value = "SELECT * FROM employee", nativeQuery = true)
//    List<Employee> findAllEmployees();
}
