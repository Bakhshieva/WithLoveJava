package com.company;

public final class Dish implements Item
{
    private final double cost;  //Immutable
    private final String name,description; //Immutable

    public Dish(String name, String description)throws Exception
    {
        this.name=name;
        this.description=description;
        this.cost=0;
        throw new Exception ("java.lang.IllegalArgumentException ");
    }
    public Dish(String name, String description,double cost) throws Exception
    {
        this.name=name;
        this.description=description;
        this.cost=cost;
        if (name.equals("") || description.equals("")|| cost == 0)
            throw new Exception ("java.lang.IllegalArgumentException ");
    }
    public double getCost()
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
