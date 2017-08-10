package com.example.wuye;


import com.example.wuye.MainActivity;
import com.example.wuye.R;
import com.example.wuye.RegisterActivity;
import DB.DBManager;
import DB.DBManager;
import android.R.layout;
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
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	EditText account;
	EditText password;
	Button login,register;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViews();
		String s=getIntent().getStringExtra("msg");
	        account.setText(s);
	        
//	        account.setOnFocusChangeListener(new View.OnFocusChangeListener() {
//                @Override
//                public void onFocusChange(View view, boolean hasFocus) {
//                    
//                    if (hasFocus) {
//                        
//                        account.setText("");
//                    }
//                }
//            });
	}
	private void findViews() {
		account = (EditText) findViewById(R.id.account);
		password = (EditText) findViewById(R.id.password);
		account.requestFocus();
		login = (Button) findViewById(R.id.login);
		register = (Button) findViewById(R.id.register);
		
		login.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				String acc=account.getText().toString();
				String pass=password.getText().toString();
				Log.i("TAG",acc+"_"+pass);
				
				DBManager dbManager = new DBManager(MainActivity.this);
				boolean flag=dbManager.login(acc, pass);
				
				if(flag){
					Log.i("TAG","µÇÂ¼³É¹¦");
					if(acc.equals("admin")&&pass.equals("admin")){
						Toast.makeText(MainActivity.this, "µÇÂ½³É¹¦", 0).show();
						Intent i = new Intent();
						i.setClass(MainActivity.this,WuYe.class);
						startActivity(i);
						finish();
					}else{
						Toast.makeText(MainActivity.this, "µÇÂ½³É¹¦", 0).show();
						Intent i = new Intent();
						i.setClass(MainActivity.this,OneActivity.class);
						startActivity(i);
						finish();
					}
				}else if(acc.equals("")||pass.equals("")){
					Toast.makeText(MainActivity.this, "ÇëÊäÈëÕËºÅºÍÃÜÂë", 0).show();
				}else{
					Log.i("TAG","µÇÂ¼Ê§°Ü");
					Toast.makeText(MainActivity.this, "µÇÂ¼Ê§°Ü", 0).show();
				}
			}
		});
		
		register.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent();
				i.setClass(MainActivity.this, RegisterActivity.class);
				startActivity(i);
			}
		});
	
	}
	

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
