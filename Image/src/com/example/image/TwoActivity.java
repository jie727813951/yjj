package com.example.image;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TwoActivity extends Activity {
	
	String[] zm = {"A","B","C","D","E","F","G",
			"H","I","J","K","L","M","N","O","P",
			"Q","R","S","T","W","X","Y","Z"};
	GridView gv_zimu;
	ImageView iv_icon;
	int level=0;
	int[] btnId ={
			R.id.bt_btn1,R.id.bt_btn2,
			R.id.bt_btn3,R.id.bt_btn4		
	};
	Button[] btn = new Button[btnId.length];
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_two);
		gv_zimu = (GridView) findViewById(R.id.gv_zimu);
		iv_icon = (ImageView) findViewById(R.id.iv_icon);
		
		for (int i = 0; i < btnId.length; i++) {
			btn[i]=(Button) findViewById(btnId[i]);
		}
		iv_icon.setImageResource(MyRes.iconid[level]);
		
		MyAdapter adapter = new MyAdapter(zm, this);
		gv_zimu.setAdapter(adapter);
		Toast t = new Toast(this);
		t.cancel();

	}

	
	public void dainji(View v) {
		Button btn_zm = (Button)v;
		String str_zm = btn_zm.getText().toString();
		for (int i = 0; i < btn.length; i++) {
			String s = btn[i].getText().toString();
			if(s.equals("")){
				btn[i].setText(str_zm);
				break;
			}
		}
		String s0 = btn[0].getText().toString();
		String s1 = btn[1].getText().toString();
		String s2 = btn[2].getText().toString();
		String s3 = btn[3].getText().toString();
		if(!s1.equals("")&&!s2.equals("")&&!s3.equals("")&&!s0.equals("")){
			String result = s0+s1+s2+s3;
			if(result.equals(MyRes.asw_yw[level])){
				createDialog();
//				Toast.makeText(this, "回答正确", 0).show();
			}else{
				Toast.makeText(this, "回答错误", 0).show();
			}
		}
	}
		
		public void createDialog() {
			final Dialog dialog = new Dialog(this,R.style.MyDailogTheme);
			View view = LayoutInflater.from(this).inflate(R.layout.tankuang, null);
			dialog.setContentView(view);
			dialog.show();
			Button btn = (Button) view.findViewById(R.id.btn_next);
			TextView tv = (TextView) view.findViewById(R.id.tv_wb);
			tv.setText(MyRes.asw_zw[level]);
			btn.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
							// TODO Auto-generated method stub
						
							dialog.dismiss();
							level++;
							iv_icon.setImageResource(MyRes.iconid[level]);
							clean();
						}
			});
		}
		public void clean() {
//			Button[] btn1 = new Button[btnId.length];
			// TODO Auto-generated method stub
			for (int i = 0; i < btn.length; i++) {
				btn[i]=(Button) findViewById(btnId[i]);
				btn[i].setText("");
			}
		}
		public void quxiao(View v) {
			Button b = (Button)v;
			b.setText("");
		}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.two, menu);
		return true;
	}


}
