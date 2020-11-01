package com.group.sedavssima.logic;

import java.util.HashSet;
import java.util.Set;

public class SpenserCompany
{
    private int money;
    private String name;
    private Set<Advertisement> ads;
    public SpenserCompany(String name)
    {
        this.name = name;
    }
    public SpenserCompany(String name,int money)
    {
        this(name);
        this.money = money;
        this.ads = new HashSet<>();
    }
    public void chargeAccount(int money)
    {
        this.money += money;
    }
    public void purchaseAds(Advertisement ads)
    {
        if(!(ads.getPrice() > money))
        {
            this.ads.add(ads);
            this.money -= ads.getPrice();
        }

    }
}
