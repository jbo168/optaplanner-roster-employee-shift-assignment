package com.schedule.demo.web.api;

import com.schedule.demo.entity.Employee;
import com.schedule.demo.service.DepartmentService;
import com.schedule.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: John Long
 * @create: 22-Mar-2020
 **/
@RestController
@RequestMapping("/api")
public class EmployeesController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DepartmentService departmentService;

    public EmployeesController(EmployeeService employeeService, DepartmentService departmentService){
        this.employeeService = employeeService;
        this.departmentService = departmentService;
    }

    @GetMapping("/employees")
    public List<Employee> employeeList() {
        return employeeService.getAllEmployees();
    }

//    @PostMapping("/employees")
//    public Employee saveEmployee(@RequestBody @NotNull Employee employee){
////        System.out.println(employee.getEmployeeName());
////        System.out.println(employee.getAssociatedDepartment());
////
////        Optional<Department> department = departmentService.getDepartmentName(employee.getAssociatedDepartment());
////
////        if (department.isPresent()){
////            return employeeService.saveEmployee(employee);
////        }
////        Employee employee1 = new Employee();
////        employee1.setEmployeeName(employee.getEmployeeName());
////        employee1.setAssociatedDepartment(employee.getAssociatedDepartment());
////        employee1.setEmployeeID(12L);
//
////        return employeeService.saveEmployee(employee1);
//    }

    @DeleteMapping("/employees/{employeeID}")
    public void delete(@PathVariable int employeeID) {
        employeeService.deleteEmployee(employeeID);
    }
}
