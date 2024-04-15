package com.application.figures;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PROTECTED)
public abstract class AbstractFigure implements IFigure{

    Color color;

    @Override
    public Color getColor() {
        return color;
    }
}
