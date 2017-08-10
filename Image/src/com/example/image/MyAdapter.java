package com.example.image;

import com.example.image.R.layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

public class MyAdapter extends BaseAdapter{
	String[] mStr;
	Context mContext;
	
	public MyAdapter(String[] mStr, Context mContext) {
		super();
		this.mStr = mStr;
		this.mContext = mContext;
	}
	//返回数组长度
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mStr.length;
	}
	//返回数组元素
	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return mStr[arg0];
	}
//返回数组下标
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
					R.layout.gridview_item, 
					null);
		}
		Button btn = (Button) arg1.findViewById(R.id.btn1);
		btn.setText(mStr[arg0]);
		return arg1;
	}
	
	

}
