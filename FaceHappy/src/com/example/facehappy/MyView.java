package com.example.facehappy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.View;

public class MyView extends View{

	int[] pic;//����ͼƬid
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

		
	//��д��ͼ����
	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);

		
		//׼��һ��ͼƬ����
//		Bitmap b_face = BitmapFactory.decodeResource(
//				getResources(), //��ȡ��Դ
//				R.drawable.pic_s2_20001);//ͼƬid
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
//				b_face, //Ҫ���ŵĶ���
//				b_face.getWidth()*2, //���ź�Ŀ�
//				b_face.getHeight()*2, //���ź�ĸ�
//				false);//���ź��ͼƬ����
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
//				b1_face, //ͼƬ����
//				(getWidth()-b_face.getWidth()-100)/2,   //����ϻ��ĺ���λ��
//				(getHeight()-b_face.getHeight()-180)/2, 	//����λ��
//				null);  //����
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
	

