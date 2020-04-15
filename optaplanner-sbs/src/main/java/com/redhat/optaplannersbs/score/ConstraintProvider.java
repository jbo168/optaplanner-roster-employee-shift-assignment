package com.redhat.optaplannersbs.score;

import com.redhat.optaplannersbs.domain.Shift;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.api.score.stream.Constraint;
import org.optaplanner.core.api.score.stream.ConstraintFactory;
import static org.optaplanner.core.api.score.stream.ConstraintCollectors.sum;


/**
 * @author: John Long
 * @create: 13-Apr-2020
 **/

public class ConstraintProvider implements org.optaplanner.core.api.score.stream.ConstraintProvider {
    @Override
    public Constraint[] defineConstraints(ConstraintFactory constraintFactory) {
        return new Constraint[]{
                requiredSkillLevelOfEmployeesForShifts(constraintFactory)
        };
    }

    private Constraint requiredSkillLevelOfEmployeesForShifts(ConstraintFactory constraintFactory) {
        return constraintFactory.from(Shift.class)
                .groupBy(Shift::getEmployee, sum(Shift::getRequiredSkillLevel))
                .filter((employee, requiredSkillLevel) -> requiredSkillLevel > employee.getSkillLevel())
                .penalize("requiredSkillLevelForShifts",
                HardSoftScore.ONE_HARD,
                (employee, requiredSkillLevel) -> requiredSkillLevel - employee.getSkillLevel());
    }
}
