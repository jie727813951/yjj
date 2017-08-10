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
     * 点击查看网络上的图片
     *
     * @param view
     * 
     * 
     * // 这是最简单的网络图片加载,这份代码只能在安卓2.3以下运行
     * 这份代码有有以下问题
     * 1 没有开子线程执行网络下载,可能会挂掉,但是2.3不会...
     * 2 没有利用子线程然后在handler切换到主线程更新UI
     * 
     */
    public void click(View view) {
        String path = mEtUrlPath.getText().toString().trim();// http://www.baidu.com/aa.png

        System.out.println("图片不存在，获取数据生成缓存");
        // 通过http请求把图片获取下来。
        try {
            // 1.声明访问的路径， url 网络资源 http ftp rtsp
            URL url = new URL(path);
            // 2.通过路径得到一个连接 http的连接
            HttpURLConnection conn = (HttpURLConnection) url
                    .openConnection();
            // 3.判断服务器给我们返回的状态信息。
            // 200 成功 302 从定向 404资源没找到 5xx 服务器内部错误
            int code = conn.getResponseCode();
            if (code == 200) {
                // 4.利用链接成功的 conn 得到输入流
                InputStream is = conn.getInputStream();// png的图片

                // 5. ImageView设置Bitmap,用BitMap工厂解析输入流

                mIvShow.setImageBitmap(BitmapFactory.decodeStream(is));
            } else {
                // 请求失败
                Toast.makeText(this, "请求失败", Toast.LENGTH_SHORT).show();
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "发生异常，请求失败", Toast.LENGTH_SHORT).show();
        }

    }
}
