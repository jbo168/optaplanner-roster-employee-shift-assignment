package com.schedule.demo.service;

import com.schedule.demo.domain.Roster;
import com.schedule.demo.entity.Shift;
import com.schedule.demo.repository.EmployeeRepository;
import com.schedule.demo.repository.ShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: John Long
 * @create: 20-Mar-2020
 **/
@Service
public class RosterService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ShiftRepository shiftRepository;


    public void saveNewlyBuiltRoster(Roster solution) {
        List<Shift> shifts = solution.getShifts();

        for (Shift shift: shifts) {
            Long employeeId = shift.getEmployee().getEmployeeId();
            Long shiftId = shift.getShiftId();

            Shift aShift = shiftRepository.getOne(shiftId);

            aShift.setEmployeeId(employeeId);
            shiftRepository.save(aShift);
        }
    }
}