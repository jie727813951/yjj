package DB;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

	//数据库名字
	private static final String DB_NAME = "mydb.db";
	//数据库版本
	private static final int VERSION = 1;
	public DBHelper(Context context) {
		super(context, DB_NAME, null, VERSION);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		//建表语句执行
		String sql="create table user(account varchar(20) primary key ,password varchar(20),username varchar(20),usertel varchar(20))";
		String sqlsf = "create table shoufei(shijian varchar(20) primary key,shuifei varchar(20),dianfei varchar(20),wuyefei varchar(20),zongfeiyong varchar(20))";
		String sqlgg = "create table gonggao(_id integer primary key autoincrement,neirong varchar(300))";
		String sqljf = "create table jiaofei(username primary key,shijian varchar(20),jiaofei varchar(20))";
		String sqlbx = "create table baoxiu(username primary key,yuanyin varchar(20),loudong varchar(20),usertel varchar(20))";
		db.execSQL(sql);
		db.execSQL(sqlsf);
		db.execSQL(sqlgg);
		db.execSQL(sqljf);
		db.execSQL(sqlbx);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVERSION, int newVERSION) {
		// TODO Auto-generated method stub

	}

}
