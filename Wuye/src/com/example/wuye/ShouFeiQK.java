package com.example.wuye;

import java.util.ArrayList;

import bean.JF;
import bean.SF;
import bean.WX;

import com.example.Adapter.JfAdapter;

import DB.DBManager;
import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.view.Menu;
import android.widget.ListView;

public class ShouFeiQK extends Activity {

	ArrayList list;
	ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_shou_fei_qk);
		lv = (ListView) findViewById(R.id.lv_jiaofei);
		
		list = new ArrayList();
		DBManager dbManager = new DBManager(ShouFeiQK.this);
		Cursor cur = dbManager.cxsj("select shoufei.*,jiaofei.* from shoufei,jiaofei where shoufei.shijian = jiaofei.shijian ");
		   while (cur.moveToNext()) {
			   int nr = cur.getColumnIndex("username");
			   int nr2 = cur.getColumnIndex("shijian");
			   int nr3 = cur.getColumnIndex("zongfeiyong");
			   int nr4 = cur.getColumnIndex("jiaofei");
			   list.add(new JF(cur.getString(nr)
					   ,cur.getString(nr2)
					   ,cur.getString(nr3)
					   ,cur.getString(nr4), null, null));
	        }
		JfAdapter adpter = new JfAdapter(
				list,
				this);
		lv.setAdapter(adpter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.shou_fei_qk, menu);
		return true;
	}

}
