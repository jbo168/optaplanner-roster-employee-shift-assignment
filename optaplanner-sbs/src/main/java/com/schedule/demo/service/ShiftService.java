package com.schedule.demo.service;

import com.schedule.demo.entity.Shift;
import com.schedule.demo.entity.ShiftChange;
import com.schedule.demo.repository.ShiftChangeRepository;
import com.schedule.demo.repository.ShiftRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @author: John Long
 * @create: 18-Mar-2020
 **/
@Service
public class ShiftService {
    @Autowired
    private ShiftRepository shiftRepository;
    @Autowired
    private ShiftChangeRepository shiftChangeRepository;

    @Transactional
    public List<Shift> getAllShifts(){
        return shiftRepository.findAll();
    }

    public Shift saveShift(Shift shift) {
        return shiftRepository.save(shift);
    }

    public void deleteShift(Long shiftID) {
        shiftRepository.deleteById(shiftID);
    }

    public List<ShiftChange> getAllShiftChangeRequests(){
        return shiftChangeRepository.findAll();
    }
}
