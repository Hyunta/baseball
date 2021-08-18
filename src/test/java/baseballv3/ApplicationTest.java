package baseballv3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;


class ApplicationTest {

    @Test
    void inputToListTest()  {
        Application application = new Application();
        List<Integer> result = application.inputToList("456");
        Assertions.assertThat(result).contains(4,5,6);

    }
}