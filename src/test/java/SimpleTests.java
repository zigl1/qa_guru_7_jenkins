import org.junit.jupiter.api.Test;

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
}

