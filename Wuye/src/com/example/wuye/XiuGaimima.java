package com.example.wuye;

import bean.User;
import DB.DBManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class XiuGaimima extends Activity {

	EditText zhanghao;
	EditText xinmima;
	EditText jiumima;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_xiu_gaimima);
		zhanghao = (EditText) findViewById(R.id.zhanghao);
		xinmima = (EditText) findViewById(R.id.xinmima);
		jiumima = (EditText) findViewById(R.id.jiumima);
		zhanghao.requestFocus();
	}

	public void xiugai(View v){
		String acc = zhanghao.getText().toString().trim();
		String xmm = xinmima.getText().toString().trim();
		String jmm = jiumima.getText().toString().trim();
		DBManager dbManager = new DBManager(XiuGaimima.this);
		boolean flag=dbManager.re(acc);
		if(flag){
			boolean pass = dbManager.mima(jmm);
			if(pass){
			dbManager.xgsj(xmm, acc);
			Toast.makeText(this, "–ﬁ∏ƒ≥…π¶", 0).show();
			Intent i = new Intent();
			i.setClass(XiuGaimima.this,MainActivity.class);
			startActivity(i);
			finish();
			}else{
				Toast.makeText(XiuGaimima.this, "æ…√‹¬Î¥ÌŒÛ", 0).show();
			}
		}else{
			Toast.makeText(XiuGaimima.this, "’À∫≈≤ª¥Ê‘⁄", 0).show();
		}
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.xiu_gaimima, menu);
		return true;
	}

}
