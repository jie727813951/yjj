package com.example.facehappy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

public class MyView extends View{

	int[] pic;//保存图片id
	Bitmap[] bitmap;
	public MyView(Context context, boolean sex) {
		super(context);
		// TODO Auto-generated constructor stub
		if(sex){
			pic = MyRes.boy;
			
		}else{
			pic = MyRes.girl;
			}	
	bitmap =new Bitmap(pic.length);
	for (int i = 0; i < pic.length; i++) {
		Bitmap bitmap = BitmapFactory.decodeResource(getResources(), pic[i]);
		
	}
	}

		
	//重写画图方法
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);

		
		//准备一个图片对象
//		Bitmap b_face = BitmapFactory.decodeResource(
//				getResources(), //获取资源
//				R.drawable.pic_s2_20001);//图片id
//		Bitmap b_hair = BitmapFactory.decodeResource(
//				getResources(), 
//				R.drawable.pic_rs1_40);
//		Bitmap b_meimao = BitmapFactory.decodeResource(
//				getResources(), 
//				R.drawable.pic_s3_1);
//		Bitmap b_eye = BitmapFactory.decodeResource(
//				getResources(), 
//				R.drawable.pic_s4_2);
//		Bitmap b_zui = BitmapFactory.decodeResource(
//				getResources(), 
//				R.drawable.pic_s5_18);
//		Bitmap b_yf = BitmapFactory.decodeResource(
//				getResources(), 
//				R.drawable.pic_s8_30072);
//		
//		Bitmap b1_face = Bitmap.createScaledBitmap(
//				b_face, //要缩放的对象
//				b_face.getWidth()*2, //缩放后的宽
//				b_face.getHeight()*2, //缩放后的高
//				false);//缩放后的图片质量
//		
//		Bitmap b1_hair = Bitmap.createScaledBitmap(
//				b_hair,
//				b_hair.getWidth()*2, 
//				b_hair.getHeight()*2, 
//				false);
//		Bitmap b1_yf = Bitmap.createScaledBitmap(
//				b_yf,
//				b_yf.getWidth()*2, 
//				b_yf.getHeight()*2, 
//				false);
//		
//		canvas.drawBitmap(
//				b1_face, //图片对象
//				(getWidth()-b_face.getWidth()-100)/2,   //面板上画的横向位置
//				(getHeight()-b_face.getHeight()-180)/2, 	//纵向位置
//				null);  //画笔
//	
//		canvas.drawBitmap(
//				b1_hair, 
//				(getWidth()-b_face.getWidth()-100)/2, 
//				(getHeight()-b_face.getHeight()-180)/2, 
//				null);  
//		canvas.drawBitmap(
//				b_meimao, 
//				(getWidth()-b_face.getWidth()+25)/2, 
//				(getHeight()-b_face.getHeight()-80)/2, 
//				null);  
//		canvas.drawBitmap(
//				b_eye, 
//				(getWidth()-b_face.getWidth()+20)/2, 
//				(getHeight()-b_face.getHeight()-50)/2, 
//				null); 
//		canvas.drawBitmap(
//				b_zui, 
//				(getWidth()-b_face.getWidth()+20)/2, 
//				(getHeight()-b_face.getHeight()+40)/2, 
//				null); 
//		canvas.drawBitmap(
//				b1_yf, 
//				(getWidth()-b_face.getWidth()-100)/2, 
//				(getHeight()-b_face.getHeight()-70)/2, 
//				null); 
	}
	
}
	

