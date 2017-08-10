package com.example.wuye;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Listview_gonggao extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_listview_gonggao);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.listview_gonggao, menu);
		return true;
	}

}
