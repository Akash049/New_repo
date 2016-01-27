package com.example.project;


import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;

public class AlarmReceiver extends BroadcastReceiver{
	 
	 private static final int MY_NOTIFICATION_ID=1;
	 NotificationManager Set_Alarm;
	 Notification StartNotification;

	 @Override
	 public void onReceive(Context context, Intent intent) {
	  Toast.makeText(context, "Alarm Set", Toast.LENGTH_LONG).show();

	     Intent intent1 = new Intent(context, StartAlarm.class);
	     PendingIntent pendingIntent = PendingIntent.getActivity(
	            context, 
	            0, 
	            intent1, 
	            Intent.FLAG_ACTIVITY_NEW_TASK);
	     
	     StartNotification = new NotificationCompat.Builder(context)
	        .setContentText("Wake Up Alarm")
	        .setWhen(System.currentTimeMillis())
	        .setContentIntent(pendingIntent)
	        .setDefaults(Notification.DEFAULT_VIBRATE )
	        .setAutoCancel(true)
	        .setSmallIcon(R.drawable.alarm)
	        .build();
	     StartNotification.sound = Uri.parse("android.resource://"
	             + context.getPackageName() + "/" + R.raw.annoying);
	     
	     Set_Alarm = 
	       (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);
	     Set_Alarm.notify(MY_NOTIFICATION_ID, StartNotification);
	 }

	}


