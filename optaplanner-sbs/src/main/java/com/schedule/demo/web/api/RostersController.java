package com.schedule.demo.web.api;

import com.schedule.demo.domain.Roster;
import com.schedule.demo.service.RosterService;
import org.optaplanner.core.api.solver.SolverJob;
import org.optaplanner.core.api.solver.SolverManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}