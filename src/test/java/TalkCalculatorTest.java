import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TalkCalculatorTest {

    String[] demoStrings = {"one", "two", "three"};
    TalkCalculator talkCalculator;

    @BeforeEach //org.testng.annotations.BeforeMethod
    public void setUpCalculator() {
        talkCalculator = new TalkCalculator();
    }

    @Test
    void test_returnMorningSessionFromTalkList() {

    }


}
