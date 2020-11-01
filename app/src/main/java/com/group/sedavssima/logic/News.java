package com.group.sedavssima.logic;

import java.util.Date;

public class News extends Program {
    private Executor executor;
    public News(String name, ProgramTime time, Date date, Executor executor)
    {
        super(name, time, date);
        this.executor = executor;
    }

}
