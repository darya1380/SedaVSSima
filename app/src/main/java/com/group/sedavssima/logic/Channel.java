package com.group.sedavssima.logic;

public class Channel
{
    private final String name;
    private ChannelManager channelManager;
    private TimeTable timeTable;
    private int usualAdsPrice;
    private int specialAdsPrice;

    public Channel(String name) {
        this.name = name;
        this.timeTable = new TimeTable();
        this.channelManager = GeneralManager.getInstance();
        this.specialAdsPrice = channelManager.getSpecialAdsPrice();
        this.usualAdsPrice = channelManager.getUsualAdsPrice();
    }
    public Channel(String name, ChannelManager manager)
    {
        this(name);
        this.channelManager = manager;
    }

    /**
     * this function adds time to time table if channel has this time empty
     * @param startTime = time the program starts
     * @param endTime = time thw program ends
     * @return = true if timeTable has empty time
     */
    public boolean timeExists(Time startTime, Time endTime)
    {
        //todo
        return false;

    }

    public void addProgram(Time start, Time end, Program program)
    {
        //todo
    }

    public void setManager(ChannelManager channelManager)
    {
        this.channelManager = channelManager;
    }
}
