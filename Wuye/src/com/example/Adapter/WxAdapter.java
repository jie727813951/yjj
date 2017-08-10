package com.example.Adapter;

import java.util.ArrayList;

import bean.WX;

import com.example.wuye.R;
import com.example.wuye.R.id;
import com.example.wuye.R.layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class WxAdapter extends BaseAdapter{
	
	ArrayList mlist;
	Context mContext;
	

	public WxAdapter(ArrayList mlist, Context mContext) {
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
						R.layout.activity_list_view_weixiu, 
						null);
				
			}
		
			TextView tv1 = (TextView) arg1.findViewById(R.id.tv_yuanyin);
			TextView tv2 = (TextView) arg1.findViewById(R.id.tv_xingming);
			TextView tv3 = (TextView) arg1.findViewById(R.id.tv_dianhua);
			TextView tv4 = (TextView) arg1.findViewById(R.id.tv_loudong);
			WX wx = (WX) mlist.get(arg0);
			tv1.setText(wx.getYy());
			tv2.setText(wx.getXm());
			tv3.setText(wx.getDh());
			tv4.setText(wx.getLd());
		return arg1;
	}

}
