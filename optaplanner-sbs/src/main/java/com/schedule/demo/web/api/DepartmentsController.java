package com.schedule.demo.web.api;

import com.schedule.demo.entity.Department;
import com.schedule.demo.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author: John Long
 * @create: 22-Mar-2020
 **/
@RestController
@RequestMapping("/api")
public class DepartmentsController {
    @Autowired
    private DepartmentService departmentService;

    public DepartmentsController(DepartmentService departmentService){
        this.departmentService = departmentService;
    }

    @GetMapping("/departments")
    public List<Department> departmentList(){
        return departmentService.getAllDepartments();
    }

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody @NotNull Department department){
        return departmentService.saveDepartment(department);
    }

    @DeleteMapping("/departments/{departmentID}")
    public void deleteDepartement(@PathVariable Long departmentID){
        departmentService.deleteDepartment(departmentID);
    }

}
