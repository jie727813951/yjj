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
		//ҳ���Զ���ת
		Thread thread = new Thread(){
			//��д�߳����run����
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
				//ʵ�ֺ�ʱ����
				//cry...catch...�׳��쳣
				try {
					Thread.sleep(2000);//���뵥λ
					//ҳ����ת
					Intent intent = new Intent();
					intent.setClass(
							SplashActivity.this,//��ǰ���� 
							MainActivity.class);//��ת����
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
