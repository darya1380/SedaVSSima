package com.group.sedavssima.logic;

import java.util.Date;

public class Advertisement extends Program
{
    private int price;
    private SpenserCompany company;
    public Advertisement(String name, ProgramTime time, Date date, int price) {
        super(name, time, date);
        this.price = price;
        company = null;
    }

    public Advertisement(String finalName) {
        super(finalName);
    }


    public int getPrice() {
        return price;
    }
    public void setCompany(SpenserCompany company)
    {
        this.company = company;
    }
    public String toString()
    {
        return "";//todo
    }
}
