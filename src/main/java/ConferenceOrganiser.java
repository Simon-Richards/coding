import model.Talk;
import utils.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ConferenceOrganiser {

    private List<Talk> talks;

    public ConferenceOrganiser() {
        talks = new ArrayList<>();
    }


    public List<Talk> createTalks(List<String> talks) {
        for (String talk : talks) {
            int talkLength = StringUtils.getTalkLength(talk);
            this.talks.add(new Talk(talk, talkLength));
        }

        return this.talks;
    }
}
