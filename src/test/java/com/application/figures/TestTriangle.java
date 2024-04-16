package com.application.figures;

import com.application.figures.impl.Square;
import com.application.figures.impl.Triangle;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestTriangle {

    private Triangle triangle;

    @BeforeEach
    void setUp(){
        triangle = new Triangle(Color.BLUE, 5, 4);
    }

    @AfterAll
    static void printSuccess(){
        System.out.println("All triangle tests successfully passed!");
    }

    @Test
    @Order(1)
    public void isTriangleGetAreaValid(){
        double area = (double) (5 * 4) / 2;
        Assertions.assertEquals(triangle.getArea(), area);
    }

    @Test
    @Order(2)
    public void isTriangleGetColorValid(){
        Assertions.assertEquals(triangle.getColor(), Color.BLUE);
    }

    @Test
    @Order(3)
    public void setTriangleBaseInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> triangle.setBase(-1));
    }

    @Test
    @Order(4)
    public void setTriangleHeightInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> triangle.setHeight(-1));
    }

}
