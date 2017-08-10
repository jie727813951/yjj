package com.example.wuye;

import bean.JF;
import bean.WX;
import DB.DBManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class JiaoFei extends Activity {

	TextView time;
	TextView shuifei;
	TextView dianfei;
	TextView wuyefei;
	TextView zongfeiyong;
	EditText jiaofei;
	EditText jiaofeiname;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jiao_fei);
		
		time = (TextView) findViewById(R.id.time_j);
		jiaofei = (EditText) findViewById(R.id.jiaofei);
		jiaofeiname = (EditText) findViewById(R.id.jiaofeiname);
		shuifei = (TextView) findViewById(R.id.sf_j);
		dianfei = (TextView) findViewById(R.id.df_j);
		wuyefei = (TextView) findViewById(R.id.wyf_j);
		zongfeiyong = (TextView) findViewById(R.id.zfy_j);
		DBManager dbManager = new DBManager(JiaoFei.this);
		
		Cursor cur = dbManager.cxsj("select * from shoufei ");
		   while (cur.moveToNext()) {
			   int sj = cur.getColumnIndex("shijian");
			   int sf = cur.getColumnIndex("shuifei");
			   int df = cur.getColumnIndex("dianfei");
			   int wyf = cur.getColumnIndex("wuyefei");
			   int zfy = cur.getColumnIndex("zongfeiyong");
			    time.setText(cur.getString(sj));
			   	shuifei.setText(cur.getString(sf));
			   	dianfei.setText(cur.getString(df));
			   	wuyefei.setText(cur.getString(wyf));
			   	zongfeiyong.setText(cur.getString(zfy));
			   	
	        }
	}
	public void jiaofei(View v){
		String shijian = time.getText().toString().trim();
		String jiaof = jiaofei.getText().toString().trim();
		String jfn = jiaofeiname.getText().toString().trim();

		DBManager dbManager = new DBManager(JiaoFei.this);
		
		JF jf = new JF();
		jf.setUsername(jfn);
		jf.setShijian(shijian);
		jf.setJiaofei(jiaof);
		dbManager.jiaofei(jf);
		Toast.makeText(JiaoFei.this, "提交成功", Toast.LENGTH_LONG).show();
		jiaofei.setText("");
		jiaofeiname.setText("");
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.jiao_fei, menu);
		return true;
	}

}
