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
}

