package com.group.sedavssima.logic;

import java.util.Date;

public class Series extends Program
{
    private ProgramTime repeatTime;
    public Series(String name, ProgramTime time, Date date, ProgramTime repeatTime)
    {
        super(name, time, date);
        this.repeatTime = repeatTime;
    }

}
