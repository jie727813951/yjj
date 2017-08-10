package com.example.wuye;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class AbcActivity extends Activity {
    private EditText mEtUrlPath;
    private ImageView mIvShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEtUrlPath = (EditText) findViewById(R.id.mEtUrlPath);
        mIvShow = (ImageView) findViewById(R.id.mIvShow);
    }




    /**
     * ����鿴�����ϵ�ͼƬ
     *
     * @param view
     * 
     * 
     * // ������򵥵�����ͼƬ����,��ݴ���ֻ���ڰ�׿2.3��������
     * ��ݴ���������������
     * 1 û�п����߳�ִ����������,���ܻ�ҵ�,����2.3����...
     * 2 û���������߳�Ȼ����handler�л������̸߳���UI
     * 
     */
    public void click(View view) {
        String path = mEtUrlPath.getText().toString().trim();// http://www.baidu.com/aa.png

        System.out.println("ͼƬ�����ڣ���ȡ�������ɻ���");
        // ͨ��http�����ͼƬ��ȡ������
        try {
            // 1.�������ʵ�·���� url ������Դ http ftp rtsp
            URL url = new URL(path);
            // 2.ͨ��·���õ�һ������ http������
            HttpURLConnection conn = (HttpURLConnection) url
                    .openConnection();
            // 3.�жϷ����������Ƿ��ص�״̬��Ϣ��
            // 200 �ɹ� 302 �Ӷ��� 404��Դû�ҵ� 5xx �������ڲ�����
            int code = conn.getResponseCode();
            if (code == 200) {
                // 4.�������ӳɹ��� conn �õ�������
                InputStream is = conn.getInputStream();// png��ͼƬ

                // 5. ImageView����Bitmap,��BitMap��������������

                mIvShow.setImageBitmap(BitmapFactory.decodeStream(is));
            } else {
                // ����ʧ��
                Toast.makeText(this, "����ʧ��", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "�����쳣������ʧ��", Toast.LENGTH_SHORT).show();
        }

    }
}
