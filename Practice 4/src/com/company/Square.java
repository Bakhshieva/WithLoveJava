package com.company;

public class Square extends Rectangle
{
    public Square(double side, String color, boolean filled)
    {
        this.width=side;
        this.length=side;
        this.filled=false;
        this.color="blue";
    }
    public  Square(double side)
    {
        this.width=side;
        this.length=side;
    }
    public Square()
    {
        width=1;
        length=1;
    }
    public  double getSide()
    {
        return width;
    }
    public void setSide(double side)
    {
        width=side;
        length=side;
    }
    public void setWidth(double side)
    {
        setSide(side);
    }
    public void setLength(double side)
    {
        setSide(side);
    }
    public String toString()
    {
        return "Square with side=" + getSide() +
                ", area=" + getArea() +
                ", color=" + getColor() +
                ", is filled=" + isFilled() +
                ", perimeter=" + getPerimeter();
    }
}
