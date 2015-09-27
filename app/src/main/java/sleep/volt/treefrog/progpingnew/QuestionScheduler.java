package sleep.volt.treefrog.progpingnew;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.util.Log;

import java.util.ArrayList;

/**
 * Created by dgros_000 on 9/26/2015.
 */
public class QuestionScheduler {
    ArrayList<FollowUp> followUps;
    public void planFollowUp(FollowUp f){
        scheduleNotification(getNotification("10 second delay"), 10000);
    }
    private void scheduleNotification(Notification notification, int delay) {
        Log.v("Schedule not", "made not in " + delay);
        //NotificiationPublisher.class
        Intent notificationIntent = new Intent(MainActivity.curInstance, NotificationPublisher.class);
        notificationIntent.putExtra(NotificationPublisher.NOTIFICATION_ID, 1);
        notificationIntent.putExtra(NotificationPublisher.NOTIFICATION, notification);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(MainActivity.curInstance, 0, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT);

        long futureInMillis = SystemClock.elapsedRealtime() + delay;
        AlarmManager alarmManager = (AlarmManager) MainActivity.curInstance.getSystemService(Context.ALARM_SERVICE);
        alarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, futureInMillis, pendingIntent);
    }
    private Notification getNotification(String content) {
        Notification.Builder builder = new Notification.Builder(MainActivity.curInstance);
        builder.setContentTitle("Scheduled Notification");
        builder.setContentText(content);
        builder.setSmallIcon(R.drawable.ic_launcher);
        return builder.build();
    }
}
