package com.schedule.demo.web.api;

import com.schedule.demo.entity.ShiftSwap;
import com.schedule.demo.service.ShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author: John Long
 * @create: 11-Apr-2020
 **/
@RestController
@RequestMapping("/api")
public class ShiftSwapsController {
    @Autowired
    private ShiftService shiftService;

    @GetMapping("/shiftSwaps")
    public List<ShiftSwap> getShiftSwaps() {
        return shiftService.getAllShiftSwapRequests();
    }

    @PostMapping("/shiftSwapRequest")
    public ShiftSwap createNewShiftSwapRequest(@RequestBody ShiftSwap shiftSwap){
        return shiftService.newShiftSwapRequest(shiftSwap);
    }

    @PostMapping("/shiftSwapRequest/{requestId}/{approval}")
    public String approveOrDeclineShiftSwapRequest(@PathVariable Long requestId, @PathVariable boolean approval) {
        if (approval) {
            shiftService.approveShiftSwapRequest(requestId);
            return "approved";
        }else{
            shiftService.declineShiftSwapRequest(requestId);
            return "declined";
        }

    }
}
