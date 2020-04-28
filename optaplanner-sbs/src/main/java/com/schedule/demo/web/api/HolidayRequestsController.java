package com.schedule.demo.web.api;

import com.schedule.demo.entity.HolidayRequest;
import com.schedule.demo.service.HolidayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: John Long
 * @create: 11-Apr-2020
 **/
@RestController
@RequestMapping("/api")
public class HolidayRequestsController {
    @Autowired
    private HolidayService holidayService;

    @GetMapping("/holidayRequests")
    public List<HolidayRequest> getHolidayRequests() {
        return holidayService.getAllHolidayRequests();
    }

    @PostMapping("/holidayRequest")
    public HolidayRequest createNewHolidayRequest(@RequestBody HolidayRequest holidayRequest) {
        return holidayService.newHolidayRequest(holidayRequest);
    }

    @PostMapping("/holidayRequest/{requestId}/{approval}")
    public void approveOrDeclineHolidayRequest(@PathVariable Long requestId, @PathVariable boolean approval) {
        if (approval) {
            holidayService.approveHolidayRequest(requestId);
        }else{
            holidayService.declineHolidayRequest(requestId);
        }
    }
}
