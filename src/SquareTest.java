import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SquareTest {
    @Test
    public void TestSquare() {
        double w1 = 1.45;
        Square s1 = new Square(w1);
        assertEquals(s1.computeArea(), w1*w1, 1e-6);

        double w2 = 5;
        Square s2 = new Square(w2);
        assertEquals(s2.computeArea(), w2*w2, 1e-6);

        double w3 = 0;
        Square s3 = new Square(w3);
        assertEquals(s3.computeArea(), 0, 1e-6);
    }

    @Test
    public void TestSquareErr() {
        double w = -2.4;
        Square s = new Square(w);
        assertEquals(s.computeArea(), -1, 1e-6);
    }

    @Test
    public void TestSquareChangeSize() {
        double w = 1.45;
        Square s = new Square(w);
        double w2 = s.getWidth() + 3;
        s.setWidth(w2);
        assertEquals(s.computeArea(), w2*w2, 1e-6);
    }
}
