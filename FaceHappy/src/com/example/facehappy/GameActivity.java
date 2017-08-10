package com.example.facehappy;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.LinearLayout;

public class GameActivity extends Activity {
	LinearLayout ll_myview;
	boolean sex;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		//获取intent传递的值
		boolean sex = getIntent().getBooleanExtra("sex", true);
		
		
		ll_myview = (LinearLayout) findViewById(R.id.ll_myview);
		MyView mv = new MyView(this, sex);
		ll_myview.addView(mv);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.game, menu);
		return true;
	}

}
