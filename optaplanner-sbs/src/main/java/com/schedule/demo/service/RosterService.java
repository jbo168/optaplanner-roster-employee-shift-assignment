package com.schedule.demo.service;

import org.springframework.stereotype.Service;

/**
 * @author: John Long
 * @create: 20-Mar-2020
 **/
@Service
public class RosterService {

//    private SkillRepository skillRepository;
//    private EmployeeRepository employeeRepository;
//    private ShiftRepository shiftRepository;
//    private SpotRepository spotRepository;
//    private EmployeeAvailabilityRepository employeeAvailabilityRepository;
//
////    private ScheduleSolverManager scheduleSolverManager;
////    private ConstraintUtils constraintUtils;
//
//    public RosterService(SkillRepository skillRepository,
//                         EmployeeRepository employeeRepository,
//                         EmployeeAvailabilityRepository employeeAvailabilityRepository,
//                         SpotRepository spotRepository,
//                         ShiftRepository shiftRepository,
////                         ScheduleSolverManager scheduleSolverManager,
//                         ConstraintUtils constraintUtils){
//        this.skillRepository = skillRepository;
//        this.employeeRepository = employeeRepository;
//        this.employeeAvailabilityRepository = employeeAvailabilityRepository;
//        this.spotRepository = spotRepository;
//        this.shiftRepository = shiftRepository;
//
////        this.scheduleSolverManager = scheduleSolverManager;
//        this.constraintUtils = constraintUtils;
//    }
//
//    public void updateShiftsOfRoster(Roster newRoster) {
//    }
//
//    public Roster buildRoster(Integer deptID) {
//        List<Skill> skillList = skillRepository.findAllByDeptId(deptID);
//        List<Spot> spotList = spotRepository.findAllByDeptId(deptID);
//        List<Employee> employeeList = employeeRepository.findAllByDeptId(deptID);
//
////        List<EmployeeAvailability> employeeAvailabilityList  = employeeAvailabilityRepository.findAllByDeptId(deptID)
////                .stream()
////                .map(ea -> ea);
//        return  null;
//    }
}
