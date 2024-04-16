package com.application.figures.impl;

import com.application.figures.AbstractFigure;
import com.application.figures.Color;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Triangle extends AbstractFigure {

    double base, height;

    public Triangle(Color color, double base, double height) {
        super(color);
        setBase(base);
        setHeight(height);
    }

    public void setBase(double base) {
        if(base <= 0)
            throw new IllegalArgumentException("Base should be more than 0");
        this.base = base;
    }

    public void setHeight(double height) {
        if(height <= 0)
            throw new IllegalArgumentException("Height should be more than 0");
        this.height = height;
    }

    @Override
    public void paint() {
        System.out.println("Paint triangle...");
    }

    @Override
    public double getArea() {
        return base * height / 2;
    }

    @Override
    public String toString(){
        return String.format("Triangle\nbase = %.2f, height = %.2f\narea = %.2f\ncolor = %s",
                base, height, getArea(), color.toString().toLowerCase());
    }
}
