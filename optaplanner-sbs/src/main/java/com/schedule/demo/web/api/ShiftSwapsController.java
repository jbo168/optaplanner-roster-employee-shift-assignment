package com.schedule.demo.web.api;

import com.schedule.demo.entity.ShiftSwap;
import com.schedule.demo.service.ShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author: John Long
 * @create: 11-Apr-2020
 **/
@RestController
@RequestMapping("/api")
public class ShiftSwapsController {
    @Autowired
    private ShiftService shiftService;

    @PostMapping("/shiftSwapRequest")
    public ShiftSwap createNewShiftSwapRequest(@RequestBody ShiftSwap shiftSwap){
        return shiftService.newShiftSwapRequest(shiftSwap);
    }
}
