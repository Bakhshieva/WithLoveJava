package com.company;

public class MenuItem
{
    private int cost;
    private String name, description;

    public MenuItem( String name,String description, int cost)
    {
        this.name=name;
        this.description=description;
        this.cost=cost;
    }

    public int getCost()
    {
        return cost;
    }
    public String getName()
    {
        return name;
    }
    public String getDescription()
    {
        return description;
    }
}