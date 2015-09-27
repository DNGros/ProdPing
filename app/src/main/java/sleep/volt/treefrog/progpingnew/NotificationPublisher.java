package sleep.volt.treefrog.progpingnew;

import android.app.*;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.*;
import android.support.v4.app.TaskStackBuilder;
import android.util.Log;

public class NotificationPublisher extends BroadcastReceiver {

    public static String NOTIFICATION_ID = "notification-id";
    public static String NOTIFICATION = "notification";
    private static final int MY_NOTIFICATION_ID = 1;
    NotificationManager notificationManager;
    Notification myNotification;
    public void onReceive(Context context, Intent intent) {
        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(MainActivity.curInstance)
                        .setSmallIcon(R.drawable.logo)
                        .setContentTitle("What are you doing right now?")
                        .setContentText("Ping");
        // Creates an explicit intent for an Activity in your app
        Intent resultIntent = new Intent(MainActivity.curInstance, MainActivity.class);

        // The stack builder object will contain an artificial back stack for the
        // started Activity.
        // This ensures that navigating backward from the Activity leads out of
        // your application to the Home screen.
        android.app.TaskStackBuilder stackBuilder = android.app.TaskStackBuilder.create(MainActivity.curInstance);
        // Adds the back stack for the Intent (but not the Intent itself)
        stackBuilder.addParentStack(MainActivity.class);
        // Adds the Intent that starts the Activity to the top of the stack
        stackBuilder.addNextIntent(resultIntent);
        PendingIntent resultPendingIntent =
                stackBuilder.getPendingIntent(
                        0,
                        PendingIntent.FLAG_UPDATE_CURRENT
                );
        mBuilder.setContentIntent(resultPendingIntent);
        NotificationManager mNotificationManager =
                (NotificationManager) MainActivity.curInstance.getSystemService(Context.NOTIFICATION_SERVICE);
        // mId allows you to update the notification later on.
        int mId = 1;
        mNotificationManager.notify(mId, mBuilder.build());



        /*intent = new Intent(Intent.ACTION_MAIN);
        intent.setClass(context, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);

        PendingIntent sender = PendingIntent.getBroadcast(context, 192839, intent, PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_ONE_SHOT);

        NotificationCompat.Builder noti = new NotificationCompat.Builder(this.context)
                .setSmallIcon(R.drawable.logo)
                .setContentTitle("My notification")
                .setContentText("Hello World!")
                .setContentIntent(sender);



        noti.setDefaults(Notification.DEFAULT_SOUND | Notification.DEFAULT_VIBRATE);


        NotificationManager mNotificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManager.notify(181818, noti.build()); */


        /*NotificationManager notificationManager = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);

        Notification notification = intent.getParcelableExtra(NOTIFICATION);
        int id = intent.getIntExtra(NOTIFICATION_ID, 0);
        notification.actions

        notificationManager.notify(id, notification);


        Log.v("RECIEVED", "AWD");*/

        /*Intent intentM = new Intent(this, MainActivity.class);
        startActivity(intentM);*/



    }
}