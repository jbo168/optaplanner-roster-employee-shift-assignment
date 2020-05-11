package com.schedule.demo.web.api;

import com.schedule.demo.entity.Employee;
import com.schedule.demo.service.DepartmentService;
import com.schedule.demo.service.EmployeeService;
import com.schedule.demo.utils.Departments;
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

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employeesForDept")
    public List<Employee> employeeListForDept(@RequestParam String dept) {
        Departments deptName = Departments.valueOf(dept);
        return employeeService.getEmployeesForDept(deptName);
    }

    @DeleteMapping("/employees/{employeeID}")
    public void delete(@PathVariable int employeeID) {
        employeeService.deleteEmployee(employeeID);
    }
}
