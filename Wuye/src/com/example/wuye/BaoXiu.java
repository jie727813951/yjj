package com.example.wuye;

import bean.BX;
import DB.DBManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class BaoXiu extends Activity {

	EditText yuanyin;
	EditText name;
	EditText loudong;
	EditText tel;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_bao_xiu);
		yuanyin = (EditText) findViewById(R.id.yuanyin);
		yuanyin.requestFocus();
		name = (EditText) findViewById(R.id.name);
		loudong = (EditText) findViewById(R.id.loudong);
		tel = (EditText) findViewById(R.id.tel);
	}
	public void queren_bx(View v){
		String yy = yuanyin.getText().toString().trim();
		String xm = name.getText().toString().trim();
		String ld = loudong.getText().toString().trim();
		String dh = tel.getText().toString().trim();
		
		if(yy.equals("")||xm.equals("")||ld.equals("")||dh.equals("")){
			Toast.makeText(BaoXiu.this, "请填写空白处", Toast.LENGTH_LONG).show();
		}else{
		DBManager dbManager = new DBManager(BaoXiu.this);
		BX bx = new BX();
		bx.setUsername(xm);
		bx.setYuanyin(yy);
		bx.setLoudong(ld);
		bx.setUsertel(dh);
		dbManager.baoxiu(bx);
		Toast.makeText(BaoXiu.this, "提交成功", Toast.LENGTH_LONG).show();
		Intent i = new Intent();
		i.setClass(BaoXiu.this,OneActivity.class);
		startActivity(i);
		finish();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.bao_xiu, menu);
		return true;
	}

}
