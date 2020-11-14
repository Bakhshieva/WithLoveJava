package com.company;

public class Rectangle extends Shape
{
    protected double width;
    protected double length;
    public Rectangle(double width, double length, String color, boolean filled)
    {
        this.filled=false;
        this.color="blue";
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length)
    {
        this.filled=false;
        this.color="blue";
        this.width=width;
        this.length=length;
    }
    public Rectangle()
    {
        width=1;
        length=1;
    }
    public double getWidth()
    {
        return width;
    }
    public void setWidth(double width)
    {
        this.width=width;
    }
    public double getLength()
    {
        return length;
    }
    public void setLength(double length)
    {
        this.length=length;
    }
    public double getArea()
    {
        return width * length;
    }
    public double getPerimeter()
    {
        return (width+length)*2;
    }
    public String toString()
    {
        return "Rectangle with width=" + width +
                ", length=" + length +
                ", area=" + getArea() +
                ", color=" + getColor() +
                ", is filled=" + isFilled() +
                ", perimeter=" + getPerimeter();
    }
}
