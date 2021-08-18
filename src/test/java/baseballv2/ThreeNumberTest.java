package baseballv2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ThreeNumberTest {

    @Test
    public void validate() {
        Assertions.assertThat(ValidateTool.validation(9)).isTrue();
        Assertions.assertThat(ValidateTool.validation(0)).isFalse();
        Assertions.assertThat(ValidateTool.validation(-1)).isFalse();
        Assertions.assertThat(ValidateTool.validation(10)).isFalse();
    }

    @Test
    public void three() {

    }
}
