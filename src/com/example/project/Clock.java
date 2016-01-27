package com.example.project;


import android.support.v7.app.ActionBarActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Clock extends ActionBarActivity {
	Button Single_Alarm;
	Button Repeated_Alarm;
	Button View_Calendar;
	Button View_Ringtone;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.clock);
		Single_Alarm = (Button)findViewById(R.id.Single_Alarm);
		Repeated_Alarm = (Button)findViewById(R.id.Repeated_Alarm);
		View_Calendar = (Button)findViewById(R.id.View_Calendar);
		View_Ringtone = (Button)findViewById(R.id.View_Ringtone);
		
Single_Alarm.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent single_alarm = new Intent("com.example.project.SET_ALARM");
				startActivity(single_alarm);
			}
		});
Repeated_Alarm.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent repeated_alarm = new Intent("com.example.project.SET_REPEATED_ALARM");
		startActivity(repeated_alarm);
		
	}
});

View_Ringtone.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent ring = new Intent("com.example.project.RINGTONE");
		startActivity(ring);
		
	}
});
View_Calendar.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent cal = new Intent("com.example.project.CALENDAR");
		startActivity(cal);
		
	}
});

	}
	

}
