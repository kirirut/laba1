package demo.parallel;

import org.junit.Test;
import static org.junit.Assert.*;

public class ComplexTest {

    @Test
    public void testMinusOperation() {
        Complex a = new Complex(5, 3);
        Complex b = new Complex(2, 1);

        Complex result = a.minus(b);

        assertEquals("Real part after subtraction", 3.0, result.getRe(), 0.0001);
        assertEquals("Imaginary part after subtraction", 2.0, result.getIm(), 0.0001);
    }

    @Test
    public void testMinusWithNegativeNumbers() {
        Complex a = new Complex(5, 3);
        Complex b = new Complex(-2, -1);

        Complex result = a.minus(b);

        assertEquals("Real part with negative subtraction", 7.0, result.getRe(), 0.0001);
        assertEquals("Imaginary part with negative subtraction", 4.0, result.getIm(), 0.0001);
    }

    @Test
    public void testDivideOperation() {
        Complex a = new Complex(6, 8);
        Complex b = new Complex(2, 2);

        Complex result = a.divide(b);

        assertEquals("Real part after division", 3.5, result.getRe(), 0.0001);
        assertEquals("Imaginary part after division", 0.5, result.getIm(), 0.0001);
    }

    @Test
    public void testDivideByRealNumber() {
        Complex a = new Complex(10, 15);
        Complex b = new Complex(5, 0);

        Complex result = a.divide(b);

        assertEquals("Real part division by real number", 2.0, result.getRe(), 0.0001);
        assertEquals("Imaginary part division by real number", 3.0, result.getIm(), 0.0001);
    }

    @Test
    public void testDivideByImaginaryNumber() {
        Complex a = new Complex(10, 15);
        Complex b = new Complex(0, 5);

        Complex result = a.divide(b);

        assertEquals("Real part division by imaginary number", 3.0, result.getRe(), 0.0001);
        assertEquals("Imaginary part division by imaginary number", -2.0, result.getIm(), 0.0001);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideByZero() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(0, 0);

        a.divide(b);
    }

    @Test
    public void testMinusIdentity() {
        Complex a = new Complex(5, 3);
        Complex zero = new Complex(0, 0);

        Complex result = a.minus(zero);

        assertEquals("Minus zero should not change real part", 5.0, result.getRe(), 0.0001);
        assertEquals("Minus zero should not change imaginary part", 3.0, result.getIm(), 0.0001);
    }

    @Test
    public void testDivideByOne() {
        Complex a = new Complex(5, 3);
        Complex one = new Complex(1, 0);

        Complex result = a.divide(one);

        assertEquals("Divide by one should not change real part", 5.0, result.getRe(), 0.0001);
        assertEquals("Divide by one should not change imaginary part", 3.0, result.getIm(), 0.0001);
    }
}
