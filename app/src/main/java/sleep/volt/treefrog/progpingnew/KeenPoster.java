package sleep.volt.treefrog.progpingnew;
import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

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
        String projectId = "560724bc46f9a7306e40299e";
        String writeKey = "38b4fa2e812dd3c0d93296a16e75cb873efcd98613db7af48da17039d204df6e0943c8dec31cfab4ae982cf869b0d45c261530748c6256eb93ea3a79f01cf68c5e37cd6681203faf6f14a58114821cb81cda772d270fdb92881aab2a67603c6dd39da79cef970324e91dcaba6d80a6a5";
        KeenProject project = new KeenProject(projectId, writeKey, null);
        client.setDefaultProject(project);
        KeenClient.initialize(client);
       // client.close();

    }
    protected void handlePause() {
        // Send all queued events to Keen. Use the asynchronous method to
        // avoid network activity on the main thread.
        KeenClient.client().sendQueuedEventsAsync();
        Log.v("pause do", "actual send");
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
        Log.v("keen", "about to quie");
        // Add it to the "purchases" collection in your Keen Project.
        KeenClient.client().queueEvent("Questions and answers", event);
        KeenClient.client().sendQueuedEventsAsync();





        return true;
    }









}