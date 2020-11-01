package com.group.sedavssima.logic;

import java.util.Date;

public class Program
{
    private final String name;
    private final ProgramTime time;
    private final Date date;
    private double score;
    private int peopleWhoRate;

    public Program(String name, ProgramTime time, Date date) {
        this.name = name;
        this.time = time;
        this.date = date;
        this.score = 5;
        this.peopleWhoRate = 0;
    }
    public Program(String name)
    {
        this.name = name;
        this.time = new ProgramTime(new Time(0,0), new Time(0, 1));
        this.date = new Date();
    }
    @Override
    public boolean equals(Object o)
    {
        return o instanceof Program && ((Program) o).name.equals(name);
    }

    public boolean rate(int score)
    {
        this.peopleWhoRate++;
        this.score = ((peopleWhoRate - 1)* this.score + score)/peopleWhoRate;
        return true;
    }
}
