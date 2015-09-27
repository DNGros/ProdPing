package sleep.volt.treefrog.progpingnew;

import android.util.Log;

/**
 * Created by dgros_000 on 9/27/2015.
 */


////NOT USED!!!!
public class PingResponseHandler {
    private static PingResponseHandler ourInstance = new PingResponseHandler();

    public static PingResponseHandler getInstance() {
        return ourInstance;
    }
    public boolean respond(Question q, QuestionOption answer){
        Log.v("got", q.getName() + " responded " + answer.getName());
        /*KeenPoster poster = new KeenPoster("useruser");
        poster.postQuestion(q, answer);*/
        return true;
    }

    private PingResponseHandler() {

    }
}
