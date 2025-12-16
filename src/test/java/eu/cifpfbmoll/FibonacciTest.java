package eu.cifpfbmoll;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FibonacciTest {

    private final Fibonacci fibonacci = new Fibonacci();

    @Test
    void fibonacciOfZeroIsZero() {
        assertEquals(0, fibonacci.calculate(0));
    }

    @Test
    void fibonacciOfOneIsOne() {
        assertEquals(1, fibonacci.calculate(1));
    }

    @Test
    void fibonacciOfFiveIsFive() {
        assertEquals(5, fibonacci.calculate(5));
    }

    @Test
    void fibonacciOfEightIsTwentyOne() {
        assertEquals(21, fibonacci.calculate(8));
    }

    @Test
    void negativeNumberThrowsException() {
        assertThrows(
                IllegalArgumentException.class,
                () -> fibonacci.calculate(-1)
        );
    }
}
