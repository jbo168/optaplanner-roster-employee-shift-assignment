package com.schedule.demo.web.api;

import com.schedule.demo.domain.Roster;
import com.schedule.demo.entity.Employee;
import com.schedule.demo.entity.Shift;
import com.schedule.demo.service.EmployeeService;
import com.schedule.demo.service.RosterService;
import com.schedule.demo.service.ShiftService;
import com.schedule.demo.utils.Departments;
import org.optaplanner.core.api.solver.SolverJob;
import org.optaplanner.core.api.solver.SolverManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/**
 * SchedulingController
 */
@RestController
@RequestMapping("/api")
public class RostersController {

    @Autowired
    private SolverManager<Roster, UUID> solverManager;
    @Autowired
    private RosterService rosterService;
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private ShiftService shiftService;

    @PostMapping("/solve")
    public Roster solve(@RequestBody Roster problem) {
        UUID problemId = UUID.randomUUID();
        // Submit the problem to start solving
        SolverJob<Roster, UUID> solverJob = solverManager.solve(problemId, problem);
        Roster solution;
        try {
            // Wait until the solving ends
            solution = solverJob.getFinalBestSolution();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException("Solving failed.", e);
        }

        //        rosterService.saveNewlyBuiltRoster(solution);
        return solution;
    }

    @PostMapping("/roster/{dept}")
    public Roster getSavedRosterForDept(@PathVariable String dept) {
        Departments deptName = Departments.valueOf(dept);
        List<Employee> employeesInDept = employeeService.getEmployeesForDept(deptName);
        List<Shift> shiftsInDept  = shiftService.getAllShiftsForDept(deptName);
        Roster savedRoster = new Roster(employeesInDept, shiftsInDept);
        return savedRoster;
    }

}

