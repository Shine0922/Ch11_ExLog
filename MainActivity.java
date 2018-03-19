package com.example.win7.exlog;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    //  定義一個名稱是 myLog 的標籤
    private  String TAG = "myLog";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnFinish = (Button)findViewById(R.id.btnFinish);

        btnFinish.setOnClickListener(myLisntener);
        Log.d(TAG,"onCreate()");
    }

    @Override
    protected void onStart()
    {
    super.onStart();
    Log.d(TAG,"onStart()");
    }

    @Override
    protected void onResume ()
    {
    super.onResume();
    Log.d(TAG,"onResume()");
    }

    @Override
    protected void onRestart ()
    {
        super.onRestart();
        Log.d(TAG,"onRestart()");
    }

    @Override
    protected void onPause ()
    {
        super.onPause();
        Log.d(TAG,"onPause()");
    }

    @Override
    protected void onStop ()
    {
        super.onStop();
        Log.d(TAG,"onStop()");
    }

    @Override
    protected void onDestroy ()
    {
        super.onDestroy();
        Log.d(TAG,"onDestroy()");
    }

    private Button.OnClickListener myLisntener = new Button.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            finish();
        }
    };
}
