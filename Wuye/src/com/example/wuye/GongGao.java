package com.example.wuye;

import bean.GG;
import DB.DBManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class GongGao extends Activity {
	EditText neirong;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gong_gao);
		neirong = (EditText) findViewById(R.id.gg_nr);
	}

	public void fabu(View v){
		String nr = neirong.getText().toString().trim();
		DBManager dbManager = new DBManager(GongGao.this);
		if(nr.equals("")){
			Toast.makeText(GongGao.this, "公告信息不能为空", Toast.LENGTH_LONG).show();
		}else{
		GG gg = new GG();
		gg.setNr(nr);
		dbManager.gonggao(gg);
		Toast.makeText(GongGao.this, "发布成功", Toast.LENGTH_LONG).show();
		Intent i = new Intent();
		i.setClass(GongGao.this,WuYe.class);
		startActivity(i);
		finish();
	}
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gong_gao, menu);
		return true;
	}

}
