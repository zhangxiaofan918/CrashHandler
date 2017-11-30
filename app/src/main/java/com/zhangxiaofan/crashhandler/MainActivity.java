package com.zhangxiaofan.crashhandler;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private Button mBtnMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CrashHandler handler = CrashHandler.getInstance();
        handler.init(this);

        mBtnMain = (Button) findViewById(R.id.btn_main);
        mBtnMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                throw new RuntimeException(CrashHandler.TAG + "this is error!");
            }
        });
    }
}
