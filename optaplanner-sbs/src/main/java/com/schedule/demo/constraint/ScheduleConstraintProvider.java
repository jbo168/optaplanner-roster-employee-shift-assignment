package com.schedule.demo.constraint;

import com.schedule.demo.entity.Shift;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.api.score.stream.Constraint;
import org.optaplanner.core.api.score.stream.ConstraintFactory;

import static org.optaplanner.core.api.score.stream.ConstraintCollectors.sum;


/**
 * @author: John Long
 * @create: 13-Apr-2020
 **/

public class ScheduleConstraintProvider implements org.optaplanner.core.api.score.stream.ConstraintProvider {
    @Override
    public Constraint[] defineConstraints(ConstraintFactory constraintFactory) {
        return new Constraint[]{
                requiredSkillLevelOfEmployeesForShifts(constraintFactory),
                maximumNumberOfAllowableShiftsForEmployees(constraintFactory)
        };
    }

    private Constraint maximumNumberOfAllowableShiftsForEmployees(ConstraintFactory constraintFactory) {
        return constraintFactory.from(Shift.class)
                .groupBy(Shift::getEmployee, sum(Shift::getShiftAmount))
                .filter((employee, shiftAmount) -> shiftAmount > employee.getWeeklyShiftAllowance())
                .penalize("Weekly Shift Allowance for each Employee"
                        ,HardSoftScore.ONE_HARD
                        ,(employee, shiftAmount) -> shiftAmount - employee.getWeeklyShiftAllowance());
    }

    private Constraint requiredSkillLevelOfEmployeesForShifts(ConstraintFactory constraintFactory) {
        return constraintFactory.from(Shift.class)
                .groupBy(Shift::getEmployee, sum(Shift::getRequiredSkillLevel))
                .filter((employee, requiredSkillLevel) -> requiredSkillLevel > employee.getSkillLevel())
                .penalize("Required Skill Level for a Shift",
                HardSoftScore.ONE_HARD,
                (employee, requiredSkillLevel) -> requiredSkillLevel - employee.getSkillLevel());
    }


}
