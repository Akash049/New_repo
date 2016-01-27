package com.example.project;

import java.util.Calendar;




import android.os.Bundle;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class Set_Repeated_Alarm extends ActionBarActivity {
	
	DatePicker Date;
	TimePicker Time;
	Button save;
	Button set;
	final static int RQS_1 = 1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.set_alarm);
		Date = (DatePicker)findViewById(R.id.Date_pick);
		Time = (TimePicker)findViewById(R.id.Time_pick);
		save = (Button)findViewById(R.id.save_alarm);	
		set = (Button)findViewById(R.id.set);
		Calendar select = Calendar.getInstance();
		Date.init(select.get(Calendar.YEAR), select.get(Calendar.MONTH), select.get(Calendar.DAY_OF_MONTH), null);
		Time.setCurrentHour(select.get(Calendar.HOUR_OF_DAY));
		Time.setCurrentMinute(select.get(Calendar.MINUTE));
		set.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent ring = new Intent("com.example.project.RINGTONE");
				startActivity(ring);
				
			}
		});
		save.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
Calendar current = Calendar.getInstance();
			    
			    Calendar set = Calendar.getInstance();
			    set.set(Date.getYear(), 
			      Date.getMonth(), 
			      Date.getDayOfMonth(), 
			      Time.getCurrentHour(), 
			      Time.getCurrentMinute(), 
			      00);
			    
			    if(set.compareTo(current) <= 0){
			     //The set Date/Time already passed
			        Toast.makeText(getApplicationContext(), 
			          "Invalid Date/Time - Date in Past", 
			          Toast.LENGTH_LONG).show();
			    }else{
				     setAlarm(set);
				    }				
			}

			private void setAlarm(Calendar targetcal) {
				// TODO Auto-generated method stub
				Toast.makeText(getApplicationContext(), 
						"Alarm is set at " + targetcal.getTime(), 
				          Toast.LENGTH_LONG).show();
				Intent intent = new Intent(getBaseContext(), AlarmReceiver.class);
				  PendingIntent pendingIntent = PendingIntent.getBroadcast(getBaseContext(), RQS_1, intent, 0);
				  AlarmManager alarmManager = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
				  alarmManager.setRepeating(AlarmManager.RTC_WAKEUP, targetcal.getTimeInMillis(), AlarmManager.INTERVAL_FIFTEEN_MINUTES, pendingIntent);
					 
				
			}
		});
			
					
	}


}
