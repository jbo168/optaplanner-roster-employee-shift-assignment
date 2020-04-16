package com.schedule.demo.domain;

import com.schedule.demo.entity.Employee;
import com.schedule.demo.entity.Shift;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.solution.drools.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

import java.util.List;

/**
 * @author: John Long
 * @create: 19-Mar-2020
 **/
@PlanningSolution
public class Roster {

    private List<Employee> employees;

    private List<Shift> shifts;

    private HardSoftScore score;

    public Roster(){}

    public Roster(List<Employee> employees, List<Shift> shifts) {
        this.employees = employees;
        this.shifts = shifts;
    }

    @ProblemFactCollectionProperty
    @ValueRangeProvider(id = "employee")
    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @PlanningEntityCollectionProperty
    public List<Shift> getShifts() {
        return shifts;
    }

    public void setShifts(List<Shift> shifts) {
        this.shifts = shifts;
    }

    @PlanningScore
    public HardSoftScore getScore() {
        return score;
    }

    public void setScore(HardSoftScore score) {
        this.score = score;
    }
}
