package com.application.figures;

import com.application.figures.impl.Circle;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestCircle {
    private Circle circle;

    @BeforeEach
    void setUp(){
        circle = new Circle(Color.BLUE, 4);
    }

    @AfterAll
    static void printSuccess(){
        System.out.println("All circle tests successfully passed!");
    }

    @Test
    @Order(1)
    public void isCircleGetAreaValid(){
        double area = Math.PI * Math.pow(4, 2);
        Assertions.assertEquals(circle.getArea(), area);
    }

    @Test
    @Order(2)
    public void isCircleGetColorValid(){
        Assertions.assertEquals(circle.getColor(), Color.BLUE);
    }

    @Test
    @Order(3)
    public void setCircleRadiusInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> circle.setRadius(-1));
    }

}
