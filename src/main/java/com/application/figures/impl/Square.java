package com.application.figures.impl;

import com.application.figures.AbstractFigure;
import com.application.figures.Color;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Square extends AbstractFigure {

    double side;

    public Square(Color color, double side) {
        super(color);
        setSide(side);
    }

    public void setSide(double side) {
        if(side <= 0)
            throw new IllegalArgumentException("Side should be more than 0");
        this.side = side;
    }

    @Override
    public void paint() {
        System.out.println("Paint square...");
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String toString(){
        return String.format("Square\nside = %.2f\narea = %.2f\ncolor = %s",
                side, getArea(), color.toString().toLowerCase());
    }
}
