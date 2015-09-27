package sleep.volt.treefrog.progpingnew;

import io.keen.client.android.AndroidKeenClientBuilder;
import io.keen.client.java.KeenClient;

/**
 * Created by dgros_000 on 9/26/2015.
 * Sends Question up to Keen
 */
public class KeenPoster {
    String user;
    // Change args to whatever you need to make it work
    // Idk, may need to be changed around
    public KeenPoster(String userNameSecret) {
       // KeenClient client = new AndroidKeenClientBuilder(this).build();
       // client.close();
    }

    /**
     * Posts a question
     * @return successfully made request
     */
    public boolean postQuestion(Question whatQuestion, QuestionOption answer){

        return true;
    }

}
