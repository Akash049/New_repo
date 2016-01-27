package com.example.project;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.Toast;

public class StartAlarm extends ActionBarActivity {
	
	
		@Override
		 protected void onCreate(Bundle savedInstanceState) {
		  // TODO Auto-generated method stub
		  super.onCreate(savedInstanceState);
		  ImageView image = new ImageView(this);
		  image.setImageDrawable(getResources().getDrawable(R.drawable.icom));
		  setContentView(image);
		  Toast.makeText(getApplicationContext(), 
		    "Wake Up Alarm ", 
		    Toast.LENGTH_LONG).show();
		 }

}
