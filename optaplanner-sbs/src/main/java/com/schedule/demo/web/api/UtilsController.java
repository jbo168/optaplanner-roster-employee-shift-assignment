package com.schedule.demo.web.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: John Long
 * @create: 25-Mar-2020
 **/
@RestController
@RequestMapping("/api")
public class UtilsController {

    @GetMapping("/daysOfWeek")
    public List<String> daysOfWeekList(){
        List<String> daysOfWeek = new ArrayList<>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
        return daysOfWeek;
    }

}
