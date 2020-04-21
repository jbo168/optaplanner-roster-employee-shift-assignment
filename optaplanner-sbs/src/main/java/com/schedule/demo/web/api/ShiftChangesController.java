package com.schedule.demo.web.api;

import com.schedule.demo.entity.ShiftChange;
import com.schedule.demo.entity.ShiftTemplate;
import com.schedule.demo.repository.ShiftTemplateRepository;
import com.schedule.demo.service.ShiftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

/**
 * @author: John Long
 * @create: 11-Apr-2020
 **/
@RestController
@RequestMapping("/api")
public class ShiftChangesController {
    @Autowired
    private ShiftTemplateRepository shiftTemplateRepository;
    @Autowired
    private ShiftService shiftService;


    @GetMapping("/shiftTemplate/{employeeId}")
    public List<ShiftTemplate> shiftListForEmployee(@RequestBody Long employeeId) {
        LocalDate startDate = LocalDate.of(2020, 04, 13);
        LocalDate endDate = LocalDate.of(2020, 04, 17);
        return shiftTemplateRepository.getShiftsForEmployee(employeeId, startDate, endDate);
    }

    @GetMapping("/shiftChanges")
    public List<ShiftChange> shiftChangeRequestList(){
        return shiftService.getAllShiftChangeRequests();
    }

    @PostMapping("/shiftChange/{approval}")
    public boolean approveShiftChangeRequest(@PathVariable String approval){
        return true;
    }
}
