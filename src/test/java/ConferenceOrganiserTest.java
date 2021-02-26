import model.Talk;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConferenceOrganiserTest {

    List<String> talksListString;
    ConferenceOrganiser conferenceOrganiser;

    @BeforeEach //org.testng.annotations.BeforeMethod
    public void setUpTalks() {
        talksListString = Arrays.asList(
                "Writing Fast Tests Against Enterprise Rails 60min",
                "Overdoing it in Python 45min",
                "Lua for the Masses 30min",
                "Ruby Errors from Mismatched Gem Versions lightning");

        conferenceOrganiser = new ConferenceOrganiser();
    }

    @Test
    void test_getTalksFromInputList() {

        List<Talk> talks = conferenceOrganiser.createTalks(talksListString);

        assertEquals(4, talks.size());

        String expectedTitle = "Writing Fast Tests Against Enterprise Rails 60min";
        int expectedLength = 60;

        assertEquals(expectedTitle, talks.get(0).getTitle());
        assertEquals(expectedLength, talks.get(0).getLength());
    }


}
