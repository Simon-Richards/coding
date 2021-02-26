import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ApplicationTest {
    private ByteArrayOutputStream outContent;
    private final PrintStream originalOut = System.out;

    @BeforeEach //org.testng.annotations.BeforeMethod
    public void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach //org.testng.annotations.AfterMethod
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test //org.testng.annotations.Test
    public void printsInputLines() {
        new Application().run(Arrays.asList("Line 1", "Line 2", "Line 3"));

        String expected = "Line 1" + System.lineSeparator()
            + "Line 2" + System.lineSeparator()
            + "Line 3" + System.lineSeparator();
        assertEquals(expected, outContent.toString());
    }
}