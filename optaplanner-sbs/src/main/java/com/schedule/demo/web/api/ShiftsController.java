package com.schedule.demo.web.api;

import com.schedule.demo.entity.Shift;
import com.schedule.demo.service.ShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @author: John Long
 * @create: 22-Mar-2020
 **/
@RestController
@RequestMapping("/api")
public class ShiftsController {
    @Autowired
    private ShiftService shiftService;

    public ShiftsController(ShiftService shiftService){
        this.shiftService = shiftService;
    }

    @RequestMapping("/shifts")
    public List<Shift> shiftList(){
        return shiftService.getAllShifts();
    }

    @PostMapping("/shifts")
    public Shift saveShift(@RequestBody @NotNull Shift shift){
        return shiftService.saveShift(shift);
    }

    @DeleteMapping("/shifts/{id}")
    public void deleteShift(@PathVariable Long shiftID){
        shiftService.deleteShift(shiftID);
    }
}
