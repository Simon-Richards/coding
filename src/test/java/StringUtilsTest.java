import org.junit.jupiter.api.Test;
import utils.StringUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilsTest {
    @Test
    void test_whenTalkIs30MinsLengthExtract30MinsInt() {
        String input = "one two three 30mins";
        int expectedOutput = 30;

        assertEquals(expectedOutput, StringUtils.getTalkLength(input));
    }

    @Test
    void test_whenTalkisLightningLengthReturn5Mins() {
        String input = "one two three lightning";
        int expectedOutput = 5;

        assertEquals(expectedOutput, StringUtils.getTalkLength(input));
    }
}
