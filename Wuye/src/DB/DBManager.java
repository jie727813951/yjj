package DB;

import com.example.wuye.ShouFei;

import bean.BX;
import bean.GG;
import bean.JF;
import bean.SF;
import bean.User;
import android.R.bool;
import android.R.string;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.widget.Toast;

public class DBManager {

	private DBHelper helper;
	private static SQLiteDatabase database;

	public DBManager(Context context) {
		helper = new DBHelper(context);
		// helper.getReadableDatabase();
		database = helper.getWritableDatabase();
	}

	// ��¼
	public boolean login(String account, String password) {

		String sql = "select * from user where account=? and password=?";
		Cursor cursor = database.rawQuery(sql,
				new String[] { account, password });
		if (cursor.moveToFirst() == true) {
			cursor.close();
			return true;
		}
		return false;
	}

	// ע����
	public boolean register(User user) {

		String sql = "insert into user(account,password,username,usertel) values(?,?,?,?)";
		Object obj[] = { user.getAccount(), user.getPassword(),user.getUsername(), user.getUsertel() };
		database.execSQL(sql, obj);
		
		return true;
	}
	//��֤�˺�
	public boolean re(String account) {

		String sql = "select * from user where account=?";
		Cursor cursor = database.rawQuery(sql,
				new String[] { account });
		if (cursor.moveToFirst() == true) {
			cursor.close();
			return true;
		}
		return false;
	}
	//��֤����
	public boolean mima(String password) {

		String sql = "select * from user where password=?";
		Cursor cursor = database.rawQuery(sql,
				new String[] { password });
		if (cursor.moveToFirst() == true) {
			cursor.close();
			return true;
		}
		return false;
	}

	//�շ���Ϣ����
	public boolean shoufei(SF sf) {
		String sql = "insert into shoufei(shijian,shuifei,dianfei,wuyefei,zongfeiyong) values(?,?,?,?,?)";
		Object obj[] = { sf.getShijian(), sf.getShuifei(), sf.getDianfei(),sf.getWuyefei(), sf.getZongfeiyong() };
		database.execSQL(sql, obj);

		return true;

	}
	
	public boolean shoufei(String shijian) {

		String sql = "select * from shoufei where shijian=?";
		Cursor cursor = database.rawQuery(sql,
				new String[] { shijian });
		if (cursor.moveToFirst() == true) {
			cursor.close();
			return true;
		}
		return false;
	}
	
	
	
	//������Ϣ
	public boolean gonggao(GG gg){
		String sql = "insert into gonggao(neirong) values(?)";
		Object obj[] = {gg.getNr()};
		database.execSQL(sql, obj);
		
		return true;
	}
	
	//�ɷ�
	public boolean jiaofei(JF jf){
		String sql = "insert into jiaofei(username,shijian,jiaofei) values(?,?,?)";
		Object obj[] = {jf.getUsername(),jf.getShijian(),jf.getJiaofei()};
		database.execSQL(sql, obj);
		
		return true;
	}

	
	//��������
	public Cursor cxsj(String cx){
		Cursor x;
		x = database.rawQuery(cx,null);
		return x;
	}
	//�޸�����
	public boolean xgsj(String xmm,String name){
		String sql = "update user set password = "+xmm+" where account = "+name;
		database.execSQL(sql);
		return true;
	}
	
	//����
	public boolean baoxiu(BX bx){
		String sql = "insert into baoxiu(username,yuanyin,loudong,usertel) values(?,?,?,?)";
		Object obj[] = {bx.getUsername(),bx.getYuanyin(),bx.getLoudong(),bx.getUsertel()};
		database.execSQL(sql, obj);
		
		return true;
	}
	


	
	
}
