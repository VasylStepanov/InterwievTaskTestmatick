package com.application.figures.impl;

import com.application.figures.AbstractFigure;
import com.application.figures.Color;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Circle extends AbstractFigure {

    double radius;

    public Circle(Color color, double radius) {
        super(color);
        setRadius(radius);
    }

    public void setRadius(double radius) {
        if(radius <= 0)
            throw new IllegalArgumentException("Radius should be more than 0");
        this.radius = radius;
    }

    @Override
    public void paint() {
        System.out.println("Paint circle...");
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString(){
        return String.format("Circle\nradius = %.2f\narea = %.2f\ncolor = %s",
                radius, getArea(), color.toString().toLowerCase());
    }

}
