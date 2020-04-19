package com.schedule.demo.entity;

/**
 * @author: John Long
 * @create: 18-Apr-2020
 **/
//@Entity
public class ShiftDayTemplate {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "shiftDayTemplateId")
    private Long shiftDayTemplateId;

    private String dayOfWeek;

    private int shiftId;

    public ShiftDayTemplate(){}
}
