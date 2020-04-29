package com.schedule.demo.service;

import com.schedule.demo.entity.Shift;
import com.schedule.demo.entity.ShiftChangeRequest;
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

    @Transactional
    public List<ShiftChangeRequest> getAllShiftChangeRequests(){
        return shiftChangeRepository.findAll();
    }

    public void approveShiftChangeRequest(Long requestId) {
        ShiftChangeRequest shiftChangeRequest = shiftChangeRepository.getOne(requestId);
        shiftChangeRequest.setShiftChangeApproved(true);
        shiftChangeRepository.save(shiftChangeRequest);
    }

    public void declineShiftChangeRequest(Long requestId) {
        ShiftChangeRequest shiftChangeRequest = shiftChangeRepository.getOne(requestId);
        shiftChangeRequest.setShiftChangeApproved(false);
        shiftChangeRepository.save(shiftChangeRequest);
    }

    public ShiftChangeRequest newShiftChangeRequest(ShiftChangeRequest shiftChangeRequest) {
        return shiftChangeRepository.save(shiftChangeRequest);
    }
}
