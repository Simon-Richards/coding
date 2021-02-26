package utils;

public class StringUtils {

    public static int getTalkLength(String input) {
        String result = "";
        String[] splitInput = input.split("\\s+");

        String time = splitInput[splitInput.length - 1];

        if (time.equals("lightning")) return 5;

        String[] splitTime = time.split("m");
        int talkLength = Integer.valueOf(splitTime[0]);

        return talkLength;

    }
}