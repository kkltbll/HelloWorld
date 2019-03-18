@[TOC](这里写自定义目录标题)实验一  android开发基础

# 创建第一个Android工程并同步GitHub

![在这里插入图片描述](https://img-blog.csdnimg.cn/20190318193643513.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxNTg1ODAx,size_16,color_FFFFFF,t_70)
创建一个helloworld 工程。

# 验证Activity的生命周期
![在这里插入图片描述](https://img-blog.csdnimg.cn/20190318193856258.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3FxXzQxNTg1ODAx,size_16,color_FFFFFF,t_70)
实现功能如上图源代码如下：


package com.example.administrator.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("MainActivityLife","调用oncreate()");
        }

        @Override
        protected void onStart() {
            super.onStart();
            Log.i("MainActivityLife","调用onstart()");
        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.i("MainActivityLife","调用onResume()");
        }

        @Override
        protected void onPause() {
            super.onPause();
            Log.i("MainActivityLife","调用onpause()");
        }

        @Override
        protected void onStop() {
            super.onStop();
            Log.i("MainActivityLife","调用onstop()");
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.i("MainActivityLife","调用onDestroy()");
        }

        @Override
        protected void onRestart() {
            super.onRestart();
            Log.i("MainActivityLife","调用onrestart()");
        }


}

