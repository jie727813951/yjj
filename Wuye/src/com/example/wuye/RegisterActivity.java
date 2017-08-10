package com.example.wuye;

import com.example.wuye.R;
import com.example.wuye.RegisterActivity;
import bean.User;
import DB.DBManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class RegisterActivity extends Activity {

	EditText account;
	EditText password;
	EditText username;
	EditText usertel;
	Button register;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_register);
		findViews();
	}
	public void zhuce(View v) {
		String acc = account.getText().toString().trim();
		String pass = password.getText().toString().trim();
		String name = username.getText().toString().trim();
		String tel = usertel.getText().toString().trim();
		
		Log.i("TAG",acc+"_"+pass+"_");
		DBManager dbManager = new DBManager(RegisterActivity.this);
		boolean flag=dbManager.re(acc);//���ݿ�ȶ��˺��Ƿ����
		if(flag){
			Toast.makeText(RegisterActivity.this, "�˺��Ѵ���", Toast.LENGTH_LONG).show();
			}else if(acc.equals("")||pass.equals("")||name.equals("")||tel.equals("")){
				Toast.makeText(RegisterActivity.this, "����ȷ��д��Ϣ", Toast.LENGTH_LONG).show();
				return;
			}else{
			User user=new User();
			user.setAccount(acc);
			user.setPassword(pass);
			user.setUsername(name);
			user.setUsertel(tel);
			dbManager.register(user);
			Toast.makeText(RegisterActivity.this, "ע��ɹ�", Toast.LENGTH_LONG).show();
			Intent intent=new Intent();//��ȡ�˺ŷ��͵���¼����
            intent.putExtra("msg",acc);
            intent.setClass(RegisterActivity.this,MainActivity.class);
            startActivityForResult(intent,0);//��ת������������
			}
		
}
	private void findViews() {
		account=(EditText) findViewById(R.id.account_register);
		account.requestFocus();
		password=(EditText) findViewById(R.id.password_register);
		username = (EditText) findViewById(R.id.name_register);
		usertel = (EditText) findViewById(R.id.tel_register);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.register, menu);
		return true;
	}

}
