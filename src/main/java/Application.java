import java.util.Arrays;
import java.util.List;

public class Application {

    public static void main(String... args) {
        List<String> input = Arrays.asList("Line 1", "Line 2", "Line 3");
        new Application().run(input);
    }

    public void run(List<String> inputLines) {


        //System.out.println(new TalkCalculator().getNumberOfTalks(inputLines));
    }
}
