package com.example.wuye;

import java.util.ArrayList;

import bean.GG;
import bean.WX;

import com.example.Adapter.WxAdapter;


import DB.DBManager;
import android.os.Bundle;
import android.app.Activity;
import android.database.Cursor;
import android.view.Menu;
import android.widget.ListView;

public class WeiXiu extends Activity {

	ArrayList list;
	ListView lv;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wei_xiu);
		lv = (ListView) findViewById(R.id.lv_wx);
		list = new ArrayList();
		DBManager dbManager = new DBManager(WeiXiu.this);
		Cursor cur = dbManager.cxsj("select * from baoxiu order by rowid desc");
		   while (cur.moveToNext()) {
			   int nr = cur.getColumnIndex("yuanyin");
			   int nr2 = cur.getColumnIndex("username");
			   int nr3 = cur.getColumnIndex("usertel");
			   int nr4 = cur.getColumnIndex("loudong");
			   list.add(new WX(cur.getString(nr)
					   ,cur.getString(nr2)
					   ,cur.getString(nr3)
					   ,cur.getString(nr4)));
	        }  
		
		WxAdapter adapter = new WxAdapter(
				list,
				this);
		lv.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.wei_xiu, menu);
		return true;
	}

}
