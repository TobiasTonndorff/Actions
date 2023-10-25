import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class actionTest {

    @Test
    @DisplayName("demo test")
    void test(){
        int expected = 1;
        int result = 1 + 0;
        assertEquals(expected, result);
    }
}
