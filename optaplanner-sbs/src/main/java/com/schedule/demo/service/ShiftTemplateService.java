package com.schedule.demo.service;

import com.schedule.demo.repository.ShiftTemplateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: John Long
 * @create: 11-Apr-2020
 **/
@Service
public class ShiftTemplateService {
    @Autowired
    ShiftTemplateRepository shiftTemplateRepository;
}
