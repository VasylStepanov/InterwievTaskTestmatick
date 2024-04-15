package com.application.figures;

import com.application.figures.impl.Trapezoid;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestTrapezoid {

    private Trapezoid trapezoid;

    @BeforeEach
    void setUp(){
        trapezoid = new Trapezoid(Color.BLUE, 4, 3, 5);
    }

    @AfterAll
    static void printSuccess(){
        System.out.println("All trapezoid tests successfully passed!");
    }

    @Test
    @Order(1)
    public void isTrapezoidGetAreaValid(){
        double area = (double) (5 * (4 + 3)) / 2;
        Assertions.assertEquals(trapezoid.getArea(), area);
    }

    @Test
    @Order(2)
    public void isTrapezoidGetColorValid(){
        Assertions.assertEquals(trapezoid.getColor(), Color.BLUE);
    }

    @Test
    @Order(3)
    public void setTrapezoidBaseAInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> trapezoid.setBaseA(-1));
    }

    @Test
    @Order(4)
    public void setTrapezoidBaseBInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> trapezoid.setBaseB(-1));
    }

    @Test
    @Order(5)
    public void setTrapezoidHeightInvalid(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> trapezoid.setHeight(-1));
    }
}
