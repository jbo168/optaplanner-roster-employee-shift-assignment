package com.schedule.demo.web.api;

import com.schedule.demo.utils.DaysOfWeek;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * @author: John Long
 * @create: 25-Mar-2020
 **/
@RestController
@RequestMapping("/api")
public class UtilsController {

    @GetMapping("/daysOfWeek")
    public List<DaysOfWeek> daysOfWeekList(){
        return Arrays.asList(DaysOfWeek.values());
    }
}
