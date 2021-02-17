import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTests {
    @Test
    void successTest() {
        assertEquals(1, 1);
    }

    @Test
    void negativeTest() {
        assertEquals(1, 0);

    }
    @Test
    void successWithHamcrestTest() {
        assertThat(true, is(true));

    }

    @Test
    void negativeWithHamcrestTest() {
        assertThat(true, is(false));

    }
    @Test
    @DisplayName("Some positive test")
    void successWithHamcrestAndStepsTest() {
        assertThat(true, is(true));

    }

    @Test
    @DisplayName("Some negative test")
    void negativeWithHamcrestAndStepstest() {
        assertThat(true, is(false));

    }
}

