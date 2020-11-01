package com.group.sedavssima.logic;

import java.util.HashSet;
import java.util.Set;

public class GeneralManager extends ChannelManager
{
    private Set<ChannelManager> channelManagers;
    private Set<Channel> channels;
    private Set<SpenserCompany> spenserSet;
    private Set<Program> programs;
    private GeneralManager(String username, String password) {
        super(username, password, new Channel("I'M Manager!"));
        channelManagers = new HashSet<>();
        channels = new HashSet<>();
        spenserSet = new HashSet<>();
        programs = new HashSet<>();
    }
    private static GeneralManager managerInstance = null;
    public static GeneralManager getInstance(String name, String password)
    {
        if(managerInstance == null)
        {
            managerInstance = new GeneralManager(name, password);
        }
        return managerInstance;

    }
    public static GeneralManager getInstance()
    {
        return managerInstance;
    }
    public void addChannel(Channel channel, ChannelManager channelManager)
    {
        channel.setManager(channelManager);
        channelManager.setChannel(channel);

        channels.add(channel);
        channelManagers.add(channelManager);
    }

    public void addSpenser(SpenserCompany s)
    {
        spenserSet.add(s);
    }

    public boolean existProgram(Program program)
    {
        return programs.contains(program);
    }
}
