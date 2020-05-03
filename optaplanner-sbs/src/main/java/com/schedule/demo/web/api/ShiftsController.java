package com.schedule.demo.web.api;

import com.schedule.demo.entity.Shift;
import com.schedule.demo.service.ShiftService;
import com.schedule.demo.utils.Departments;
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

    @GetMapping("/shifts")
    public List<Shift> shiftList(){
        return shiftService.getAllShifts();
    }

    @PostMapping("/shifts/{dept}")
    public List<Shift> shiftsForDept(@PathVariable String dept){
        Departments deptName = Departments.valueOf(dept);
        return shiftService.getAllShiftsForDept(deptName);
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
