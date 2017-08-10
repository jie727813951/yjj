package com.example.facehappy;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class SplashActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
		//页面自动跳转
		Thread thread = new Thread(){
			//重写线程类的run方法
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				//实现耗时操作
				//cry...catch...抛出异常
				try {
					Thread.sleep(2000);//毫秒单位
					//页面跳转
					Intent intent = new Intent();
					intent.setClass(
							SplashActivity.this,//当前界面 
							MainActivity.class);//跳转界面
					startActivity(intent);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		thread.start();
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.splash, menu);
		return true;
	}

}
