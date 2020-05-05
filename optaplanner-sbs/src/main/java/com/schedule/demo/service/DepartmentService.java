package com.schedule.demo.service;

import com.schedule.demo.entity.Department;
import com.schedule.demo.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author: John Long
 * @create: 18-Mar-2020
 **/
@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    public List<Department> getAllDepartments(){
        return departmentRepository.findAllDepartments();
    }

    @Transactional
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Transactional
    public void deleteDepartment(Long deptID) {
        departmentRepository.deleteById(deptID);
    }
}
