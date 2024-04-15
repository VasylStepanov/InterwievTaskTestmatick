package com.application;


import com.application.figures.FigureFactory;
import com.application.figures.IFigure;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final FigureFactory figureFactory = new FigureFactory();

    public static void main(String[] args) {
        int amount = (int)(Math.random() * 5 + 5);

        List<IFigure> figures = new ArrayList<>(amount);

        for(int i = 0; i < amount; ++i)
            figures.add(figureFactory.createRandomFigure());

        figures.forEach(System.out::println);
    }
}
