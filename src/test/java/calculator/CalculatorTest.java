package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void addTest() {
        int result = calculator.Calculate(1, "+", 2);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void subtractTest() {
        int result = calculator.Calculate(10, "-", 5);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void multiplyTest() {
        int result = calculator.Calculate(2, "*", 2);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void divideTest() {
        int result = calculator.Calculate(6, "/", 2);
        assertThat(result).isEqualTo(3);
    }

    @Test
    void calculateStrings() {
        int result = calculator.CalculateStrings(new String[]{"1", "+", "2", "+", "3"});
        assertThat(result).isEqualTo(6);
    }
}