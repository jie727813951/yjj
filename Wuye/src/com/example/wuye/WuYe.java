package com.example.wuye;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class WuYe extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wu_ye);
	}

	public void tuichu(View v){
		Intent i = new Intent();
		i.setClass(WuYe.this, MainActivity.class);
		startActivity(i);
		finish();
	}

	public void shoufei(View v){
		Intent i = new Intent();
		i.setClass(WuYe.this, ShouFei.class);
		startActivity(i);
	}
	
	public void weixiu(View v){
		Intent i = new Intent();
		i.setClass(WuYe.this,WeiXiu.class);
		startActivity(i);
	}
	
	public void gonggao(View v){
		Intent i = new Intent();
		i.setClass(WuYe.this,GongGao.class);
		startActivity(i);
	}
	public void ggxinxi(View v){
		Intent i = new Intent();
		i.setClass(WuYe.this,GongGao_x.class);
		startActivity(i);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.wu_ye, menu);
		return true;
	}

}
