package com.example.wuye;

import java.io.File;
import java.util.ArrayList;

import bean.GG;

import com.example.Adapter.GgAdapter;

import DB.DBManager;
import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v4.widget.SimpleCursorAdapter;
import android.view.Menu;
import android.widget.ListView;

public class GongGao_x extends Activity {

	ArrayList list;
	ListView lv;
	private SQLiteDatabase db;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gong_gao_x);
		 
		lv = (ListView) findViewById(R.id.lv_gonggao);
		DBManager dbManager = new DBManager(GongGao_x.this);
		list = new ArrayList();	
		Cursor cur = dbManager.cxsj("select * from gonggao order by rowid desc");
		   while (cur.moveToNext()) {
			   int nr = cur.getColumnIndex("neirong");
				list.add(new GG("",cur.getString(nr))); 
	        }     
		GgAdapter adapter = new GgAdapter(
				list,
				this);
				lv.setAdapter(adapter);		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.gong_gao_x, menu);
		return true;
	}

}
