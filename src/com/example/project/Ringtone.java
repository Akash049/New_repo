package com.example.project;

import android.content.Intent;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;


public class Ringtone extends ActionBarActivity {
	Button annoy;
	Button coo;
	Button cuckoo;
	Button loud;
	Button old_alarm;
	Button old_fashioned;
	Button short_call;
	Button wake_up;
	Button set;
	MediaPlayer play;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ringtone);
		initialize();
		annoy.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				play = MediaPlayer.create(Ringtone.this, R.raw.annoying);
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
							play.release();			
											
						}
					}
					};
					timer.start();
				
			}
		});
		coo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				play = MediaPlayer.create(Ringtone.this, R.raw.coo_coo);
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
							play.release();			
											
						}
					}
					};
					timer.start();
				
			}
		});
		cuckoo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				play = MediaPlayer.create(Ringtone.this, R.raw.cuckoo);
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
							play.release();			
											
						}
					}
					};
					timer.start();
				
			}
		});
		loud.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				play = MediaPlayer.create(Ringtone.this, R.raw.loud);
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
							play.release();			
											
						}
					}
					};
					timer.start();
				
			}
		});
		old_alarm.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				play = MediaPlayer.create(Ringtone.this, R.raw.old_alarm);
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
							play.release();			
											
						}
					}
					};
					timer.start();
				
			}
		});
		old_fashioned.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				play = MediaPlayer.create(Ringtone.this, R.raw.old_fashioned);
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
							play.release();			
											
						}
					}
					};
					timer.start();
				
			}
		});
		short_call.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				play = MediaPlayer.create(Ringtone.this, R.raw.short_call);
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
							play.release();			
											
						}
					}
					};
					timer.start();
				
			}
		});
		wake_up.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				play = MediaPlayer.create(Ringtone.this, R.raw.wake_up);
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
							play.release();			
											
						}
					}
					};
					timer.start();
				
			}
		});
		set.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent set = new Intent("com.example.project.SET_ALARM");
				startActivity(set);
				
				
			}
		});
	}


	private void initialize() {
		// TODO Auto-generated method stub
		annoy = (Button)findViewById(R.id.annoy);
		coo  = (Button)findViewById(R.id.coo);
		cuckoo = (Button)findViewById(R.id.cuckoo);
		loud = (Button)findViewById(R.id.loud);
		old_alarm = (Button)findViewById(R.id.old_alarm);
		old_fashioned = (Button)findViewById(R.id.old_fashioned);
		short_call = (Button)findViewById(R.id.short_call);
		wake_up = (Button)findViewById(R.id.wake_up);
		set = (Button)findViewById(R.id.set);
		
	}


	

}
