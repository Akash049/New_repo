package com.example.project;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class Front extends ActionBarActivity {
	MediaPlayer play;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.front);
		play = MediaPlayer.create(Front.this, R.raw.sound);
		play.start();
		
		Thread timer = new Thread(){
		public void run()
		{
			try{
				sleep(2500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			finally
			{
				Intent myintent = new Intent("com.example.project.CLOCK");
				startActivity(myintent);			
								
			}
		}
		};
		timer.start();
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		play.release();
		finish();
	}
	

}
