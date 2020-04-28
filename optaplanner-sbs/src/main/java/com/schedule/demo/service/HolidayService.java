package com.schedule.demo.service;

import com.schedule.demo.entity.HolidayRequest;
import com.schedule.demo.repository.HolidayRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: John Long
 * @create: 22-Apr-2020
 **/
@Service
public class HolidayService {
    @Autowired
    HolidayRequestRepository holidayRequestRepository;

    public List<HolidayRequest> getAllHolidayRequests(){
        return holidayRequestRepository.findAll();
    }

    public HolidayRequest newHolidayRequest(HolidayRequest holidayRequest) {
        return holidayRequestRepository.save(holidayRequest);
    }

    public void approveHolidayRequest(Long requestId) {
//        HolidayRequest holidayRequest  = holidayRequestRepository.findById(requestId)
//                .orElseThrow(() -> new EntityNotFoundException("No entity found with id " + requestId));

        HolidayRequest holidayRequest = holidayRequestRepository.getOne(requestId);
        holidayRequest.setHolidayRequestApproval(true);
        holidayRequestRepository.save(holidayRequest);
    }

    public void declineHolidayRequest(Long requestId) {
        HolidayRequest holidayRequest = holidayRequestRepository.getOne(requestId);
        holidayRequest.setHolidayRequestApproval(false);
        holidayRequestRepository.save(holidayRequest);
    }
}
