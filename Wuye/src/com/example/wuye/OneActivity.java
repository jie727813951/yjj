package com.example.wuye;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class OneActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_one);
	}
	
	public void zhuxiao(View v){
		Intent i = new Intent();
		i.setClass(OneActivity.this,MainActivity.class);
		startActivity(i);
		finish();
	}

	public void jiaofei(View v){
		Intent i = new Intent();
		i.setClass(OneActivity.this,JiaoFei.class);
		startActivity(i);
	}
	
	public void baoxiu(View v){
		Intent i = new Intent();
		i.setClass(OneActivity.this,BaoXiu.class);
		startActivity(i);
	}
	public void ggxinxi(View v){
		Intent i = new Intent();
		i.setClass(OneActivity.this,GongGao_x.class);
		startActivity(i);
	}
	public void gaimima(View v){
		Intent i = new Intent();
		i.setClass(OneActivity.this,XiuGaimima.class);
		startActivity(i);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.one, menu);
		return true;
	}

}
