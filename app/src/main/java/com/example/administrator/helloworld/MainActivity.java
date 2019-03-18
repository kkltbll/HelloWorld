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
