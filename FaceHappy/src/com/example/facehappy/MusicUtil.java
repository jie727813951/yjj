package com.example.facehappy;

import android.content.Context;
import android.media.MediaPlayer;
import android.provider.MediaStore.Audio.Media;

public class MusicUtil {
	//构造函数
	//播放媒体的类
	
	public MusicUtil(int id,Context c) {
		MediaPlayer mp = MediaPlayer.create(c, id);
		mp.start();
		
	}
	
}
