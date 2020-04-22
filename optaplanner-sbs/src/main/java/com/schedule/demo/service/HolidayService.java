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
}
