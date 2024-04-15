package com.application.figures;

import com.application.figures.impl.Circle;
import com.application.figures.impl.Square;
import com.application.figures.impl.Trapezoid;
import com.application.figures.impl.Triangle;

public class FigureFactory {

    public IFigure createRandomFigure(){
        var figure = (int)(Math.random() * 4);

        return switch (figure){
            case 0 -> new Circle(Color.getRandomColor(), Math.random() * 10);
            case 1 -> new Square(Color.getRandomColor(), Math.random() * 10);
            case 2 -> new Trapezoid(Color.getRandomColor(), Math.random() * 10, Math.random() * 15, Math.random() * 8);
            case 3 -> new Triangle(Color.getRandomColor(), Math.random() * 10, Math.random() * 15);
            default -> throw new IllegalStateException("Unexpected value: " + figure);
        };
    }
}
