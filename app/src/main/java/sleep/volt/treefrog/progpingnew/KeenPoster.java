package sleep.volt.treefrog.progpingnew;
import android.app.Activity;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import io.keen.client.android.AndroidKeenClientBuilder;
import io.keen.client.java.KeenClient;
import io.keen.client.java.KeenProject;

import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;
import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.MalformedURLException;
import java.io.InputStreamReader;
import java.io.ByteArrayOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by dgros_000 on 9/26/2015.
 * Sends Question up to Keen
 */
public class KeenPoster {
    String user;
    KeenClient client;
    // Change args to whatever you need to make it work
    // Idk, may need to be changed around
    public KeenPoster(String userNameSecret, Activity l) {
       // KeenClient client = new AndroidKeenClientBuilder(this).build();
        // Create a new instance of the client.
         client = new AndroidKeenClientBuilder(l).build();

        // Get the project ID and write key from string resources, then create a project and set
        // it as the default for the client.
        String projectId = "560727a690e4bd7b0d9d9d2c";
        String writeKey = "057082ad2fff5d0e05cc21e0705c8929da231edcae03548b0f7ec097c6ebaa438c98b116cf3f670ae2c2c449b81e23e0e2d266308d6ca69e4c9ee0e43d512f80053d7bc394f792caa5c9a0f3d2d93a207e21386eabbd608e09a55f603d750314b92f2e525030b714c591f54fe6d43d5f";
        KeenProject project = new KeenProject(projectId, writeKey, null);
        client.setDefaultProject(project);
        KeenClient.initialize(client);
       // client.close();

    }
    protected void onPause() {
        // Send all queued events to Keen. Use the asynchronous method to
        // avoid network activity on the main thread.
        KeenClient.client().sendQueuedEventsAsync();

        super.onPause();
    }
    /**
     * Posts a question
     * @return successfully made request
     */
    public boolean postQuestion(Question whatQuestion, QuestionOption answer){
// Create an event to upload to Keen.
        Map<String, Object> event = new HashMap<String, Object>();
        event.put("question", whatQuestion.getName());
        event.put("answer", answer.getName());
       int counter = 0;
        /*while(counter < whatQuestion.getOptions().size())
        {

       if(!whatQuestion.getOptions().get(counter).equals(answer.getName()) )

       {
           event.put("did not choose", whatQuestion.getOptions().get(counter));
       }

       counter++;


        }*/
        // Add it to the "purchases" collection in your Keen Project.
        KeenClient.client().queueEvent("Questions and answers", event);

        return true;
    }









}