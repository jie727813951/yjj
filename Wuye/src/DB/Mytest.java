package DB;

import android.app.DownloadManager.Query;
import android.test.AndroidTestCase;

public class Mytest extends AndroidTestCase {

	public void initTable(){
		DBHelper dbHelper = new DBHelper(getContext());
		dbHelper.getReadableDatabase();
	}
	
	public void insert(){
		String sql = "insert into person(name,address,age) values(?,?,?) ";
		Object[] bindArgs = {"张三","北京",33};
		DBManager manager = new DBManager(getContext());
		
	}
	public void update(){
		String sql = "update person set name = ?,address = ?,age = ? where pid = ?";
		Object[] bindArgs = {"李四","湖南",32,1};
		DBManager manager = new DBManager(getContext());
		
	}
	
	public void qurey(){
		String sql = "select * from person ";
		DBManager manager = new DBManager(getContext());
	
		
	}
	
	
	
	
}
