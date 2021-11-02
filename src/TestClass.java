import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestClass {

    @Test
    public void TestRectangle() {
        double w1 = 2.5;
        double h1 = 4.5;
        Rectangle testRec1 = new Rectangle(w1, h1);
        assertEquals(w1*h1, testRec1.computeArea(), 1e-6);

        double w2 = 4.5;
        double h2 = 4.5;
        Rectangle testRec2 = new Rectangle(w2, h2);
        assertEquals(w2*h2, testRec2.computeArea(), 1e-6);
    }

    @Test
    public void TestRectangleZero() {
        double w1 = 0;
        double h1 = 4.5;
        Rectangle testRec1 = new Rectangle(w1, h1);
        assertEquals(w1*h1, testRec1.computeArea(), 1e-6);

        double w2 = 2.1;
        double h2 = 0;
        Rectangle testRec2 = new Rectangle(w2, h2);
        assertEquals(w2*h2, testRec2.computeArea(), 1e-6);
    }


    @Test
    public void TestRectangleErr() {
        double w1 = -1;
        double h1 = 2;
        Rectangle testRec1 = new Rectangle(w1, h1);
        assertEquals(-1, testRec1.computeArea(), 1e-6);

        double w2 = 2.1;
        double h2 = -1;
        Rectangle testRec2 = new Rectangle(w2, h2);
        assertEquals(-1, testRec2.computeArea(), 1e-6);
    }

    @Test
    public void TestRectangleChangeSize() {
        double w1 = 3.5;
        double h1 = 4.5;
        Rectangle testRec1 = new Rectangle(w1, h1);
        assertEquals(w1*h1, testRec1.computeArea(), 1e-6);

        double newH1 = testRec1.getHeight()-1;
        testRec1.setHeight(newH1);
        assertEquals(w1*newH1, testRec1.computeArea(), 1e-6);

        double newW1 = testRec1.getWidth()-1;
        testRec1.setWidth(newW1);
        assertEquals(newW1*newH1, testRec1.computeArea(), 1e-6);
    }


}
