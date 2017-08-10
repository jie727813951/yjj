package com.example.Adapter;

import java.util.ArrayList;

import bean.JF;

import com.example.wuye.R;
import com.example.wuye.R.id;
import com.example.wuye.R.layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class JfAdapter extends BaseAdapter{
	
	ArrayList mlist;
	Context mContext;
	

	public JfAdapter(ArrayList mlist, Context mContext) {
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
					R.layout.activity_sfqkmuban,
					null);
			
		}
		
		TextView name = (TextView) arg1.findViewById(R.id.tv_xingming);
		TextView time = (TextView) arg1.findViewById(R.id.sf_time);
		TextView yj = (TextView) arg1.findViewById(R.id.tv_yingjiao);
		TextView sj = (TextView) arg1.findViewById(R.id.tv_shijiao);
		
		JF jf = (JF) mlist.get(arg0);
		
		
		name.setText(jf.getUsername());
		time.setText(jf.getShijian());
		yj.setText(jf.getYj());
		sj.setText(jf.getSj());
		
		return arg1;
	}

}
