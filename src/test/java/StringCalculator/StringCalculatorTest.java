package StringCalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class StringCalculatorTest {

    StringCalculator calculator = new StringCalculator();

    @Test
    public void splitTest() {
        String[] result = calculator.split("10 + 2");
        Assertions.assertThat(result).containsExactly("10","+","2");
    }

}