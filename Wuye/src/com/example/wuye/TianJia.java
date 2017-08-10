package com.example.wuye;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TianJia extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tian_jia);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tian_jia, menu);
		return true;
	}

}
