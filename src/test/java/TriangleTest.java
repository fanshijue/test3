import static org.junit.Assert.assertEquals;
import org.junit.Test;


public class TriangleTest {

    Triangle t = new Triangle();

    @Test()
    public void equilateralTest(){
        assertEquals(t.equilateral(3, 3, 3), true);
        assertEquals(t.equilateral(3, 3, 4), false);
    }

    @Test()
    public void isoscelesTest() {
        assertEquals(t.isosceles(3, 6, 6), true);
        assertEquals(t.isosceles(3, 4, 5), false);
    }

    @Test()
    public void scaleneTest() {
        assertEquals(t.scalene(3, 3, 2), true);
        assertEquals(t.scalene(3, 3, 3), false);
    }

    @Test(expected = ArithmeticException.class)
    public void isTriangle() {
        t.testTriangle(1, 2, 3);
    }

}
