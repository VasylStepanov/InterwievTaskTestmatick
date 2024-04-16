package com.application.figures;

import com.application.figures.impl.Square;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestSquare {
    private Square square;

    @BeforeEach
    void setUp(){
        square = new Square(Color.BLUE, 4);
    }

    @AfterAll
    static void printSuccess(){
        System.out.println("All square tests successfully passed!");
    }

    @Test
    @Order(1)
    public void isSquareGetAreaValid(){
        double area = Math.pow(4, 2);
        Assertions.assertEquals(square.getArea(), area);
    }

    @Test
    @Order(2)
    public void isSquareGetColorValid(){
        Assertions.assertEquals(square.getColor(), Color.BLUE);
    }

    @Test
    @Order(3)
    public void setSquareSideInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> square.setSide(-1));
    }

}
