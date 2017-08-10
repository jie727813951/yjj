package com.example.Adapter;

import java.util.ArrayList;

import bean.GG;

import com.example.wuye.R;
import com.example.wuye.R.id;
import com.example.wuye.R.layout;


import android.content.Context;
import android.database.Cursor;
import android.support.v4.widget.CursorAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class GgAdapter extends BaseAdapter{

	
	ArrayList mlist;
	Context mContext;

	public GgAdapter(ArrayList mlist, Context mContext) {
		super();
		this.mlist = mlist;
		this.mContext = mContext;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mlist.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return mlist.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		
		if(arg1==null){
			arg1 = LayoutInflater.from(mContext).inflate(
					R.layout.activity_listview_gonggao,
					null);
			
		}
		
//		TextView tv1 = (TextView) arg1.findViewById(R.id.tv_gg);
		TextView tv2 = (TextView) arg1.findViewById(R.id.tv_nr);
		GG gg1 = (GG) mlist.get(arg0);
//		tv1.setText(gg1.getGg());
		tv2.setText(gg1.getNr());
		
		return arg1;
	}

}
