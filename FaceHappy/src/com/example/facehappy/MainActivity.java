package com.example.facehappy;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.animation.TranslateAnimation;
import android.widget.Button;

public class MainActivity extends Activity {
	
	Button btn_boy;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		btn_boy = (Button) findViewById(R.id.btn_boy);
		//动画效果
		TranslateAnimation ta = new TranslateAnimation(
				-100f, 
				0, 
				0, 
				0);
		//移动以后的不再返回原来位置
		ta.setFillAfter(true);
		ta.setDuration(2000);//单位毫秒
		//绑定动画
		btn_boy.setAnimation(ta);
		
		
	}
	
	public void music(View v) {
		Intent intent = new Intent();
		intent.setClass(MainActivity.this, GameActivity.class);
		switch (v.getId()) {
		case R.id.btn_boy:
		MusicUtil mu = new MusicUtil(R.raw.boy, this);
		intent.putExtra("sex", true);
			startActivity(intent);
			break;
		
		case R.id.btn_girl:
		MusicUtil mn = new MusicUtil(R.raw.girl, this);
		intent.putExtra("sex",false);
			startActivity(intent);
			break;
		}

	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
