package com.group.sedavssima.logic;

public class ChannelManager
{
    private String username;
    private String password;
    private int specialAdsPrice;
    private int usualAdsPrice;
    private Channel channel;

    public ChannelManager(String username, String password, Channel channel)
    {
        this.username = username;
        this.password = password;
        this.usualAdsPrice = 10;
        this.specialAdsPrice = 50;
        this.channel = channel;
    }
    public ChannelManager(String username, String password, int usualAdsPrice, int specialAdsPrice, Channel channel)
    {
        this(username, password, channel);
        this.usualAdsPrice = usualAdsPrice;
        this.specialAdsPrice = specialAdsPrice;
    }

    public int getSpecialAdsPrice() {
        return specialAdsPrice;
    }

    public int getUsualAdsPrice() {
        return specialAdsPrice;
    }
    public void addProgram(Time start, Time end, Program program)
    {
        if(channel.timeExists(start, end))
            channel.addProgram(start, end, program);

    }
    public void setUsualAdsPrice(int price)
    {
        usualAdsPrice = price;
    }
    public void setSpecialAdsPrice(int price)
    {
        specialAdsPrice = price;
    }

    protected void setChannel(Channel channel)
    {
        this.channel = channel;
    }
}
