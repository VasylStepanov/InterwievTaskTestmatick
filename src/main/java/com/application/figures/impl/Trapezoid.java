package com.application.figures.impl;

import com.application.figures.AbstractFigure;
import com.application.figures.Color;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Trapezoid extends AbstractFigure {

    double baseA, baseB, height;

    public Trapezoid(Color color, double baseA, double baseB, double height) {
        super(color);
        setBaseA(baseA);
        setBaseB(baseB);
        setHeight(height);
    }

    public void setBaseA(double baseA) {
        if(baseA <= 0)
            throw new IllegalArgumentException("Base_a should be more than 0");
        this.baseA = baseA;
    }

    public void setBaseB(double baseB) {
        if(baseB <= 0)
            throw new IllegalArgumentException("Base_b should be more than 0");
        this.baseB = baseB;
    }

    public void setHeight(double height) {
        if(height <= 0)
            throw new IllegalArgumentException("Height should be more than 0");
        this.height = height;
    }

    @Override
    public void paint() {
        System.out.println("Paint trapezoid...");
    }

    @Override
    public double getArea() {
        return height * (baseA + baseB) / 2;
    }

    @Override
    public String toString(){
        return String.format("Trapezoid\nbase_a = %.2f, base_b = %.2f, height = %.2f\narea = %.2f\ncolor = %s",
                baseA, baseB, height, getArea(), color.toString().toLowerCase());
    }
}
