package com.group.sedavssima.logic;

import java.util.Date;

public class RaceAndEntertainment extends Program
{
    private Executor executor;
    private ProgramTime repeatTime;
    public RaceAndEntertainment(String name, ProgramTime time, Date date, Executor executor, ProgramTime repeatTime)
    {
        super(name, time, date);
        this.executor = executor;
        this.repeatTime = repeatTime;
    }
}
