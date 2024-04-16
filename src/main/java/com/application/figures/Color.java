package com.application.figures;

public enum Color {
    RED, GREEN, BLUE, WHITE, BLACK;

    public static Color getRandomColor(){
        var color = (int)(Math.random() * (Color.values().length));
        return switch (color){
            case 0 -> RED;
            case 1 -> GREEN;
            case 2 -> BLUE;
            case 3 -> WHITE;
            case 4 -> BLACK;
            default -> throw new IllegalStateException("Unexpected value: " + color);
        };
    }
}
