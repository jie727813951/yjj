package com.example.wuye;


import bean.SF;
import DB.DBManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ShouFei extends Activity {

	EditText time;
	EditText sf1;
	EditText df;
	EditText wyf;
	EditText zfy;
	Button queren_s;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shou_fei);
		time = (EditText) findViewById(R.id.time_s);
		sf1 = (EditText) findViewById(R.id.sf_s);
		df = (EditText) findViewById(R.id.df_s);
		wyf = (EditText) findViewById(R.id.wyf_s);
		zfy = (EditText) findViewById(R.id.zfy_s);
		queren_s = (Button) findViewById(R.id.queren_s);
		

	    }
	public void queren_s(View v){
		String shijian = time.getText().toString().trim();
		String shuifei = sf1.getText().toString().trim();
		String dianfei = df.getText().toString().trim();
		String wuyefei = wyf.getText().toString().trim();
		String zongfeiyong = zfy.getText().toString().trim();
		
		DBManager dbManager = new DBManager(ShouFei.this);
		
		boolean flag=dbManager.shoufei(shijian);
		if(flag){
			Toast.makeText(ShouFei.this, "请填写正确的时间", Toast.LENGTH_LONG).show();
		}
		else if(shijian.equals("")||shuifei.equals("")||dianfei.equals("")
				||wuyefei.equals("")||zongfeiyong.equals("")){
			Toast.makeText(ShouFei.this, "信息不能为空", Toast.LENGTH_LONG).show();
		}else{
		SF sf = new SF();
		sf.setShijian(shijian);
		sf.setShuifei(shuifei);
		sf.setDianfei(dianfei);
		sf.setWuyefei(wuyefei);
		sf.setZongfeiyong(zongfeiyong);
		dbManager.shoufei(sf);
		Toast.makeText(ShouFei.this, "提交成功", Toast.LENGTH_LONG).show();
		}
		time.setText("");
		sf1.setText("");
		df.setText("");
		wyf.setText("");
		zfy.setText("");
	}
	
	
	
	public void shoufei(View v){
		Intent i = new Intent();
		i.setClass(ShouFei.this, ShouFeiQK.class);
		startActivity(i);
		
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.shou_fei, menu);
		return true;
	}

}
