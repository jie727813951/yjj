package com.example.facehappy;

import android.content.Context;
import android.media.MediaPlayer;
import android.provider.MediaStore.Audio.Media;

public class MusicUtil {
	//���캯��
	//����ý�����
	
	public MusicUtil(int id,Context c) {
		MediaPlayer mp = MediaPlayer.create(c, id);
		mp.start();
		
	}
	
}
