package com.xutli.cn.xuitls;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button id_toast;
    private Button id_getVerson;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = this;
        id_toast = (Button) findViewById(R.id.id_toast);
        id_toast.setOnClickListener(this);

        id_getVerson = (Button) findViewById(R.id.id_getVerson);
        id_getVerson.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.id_toast:



                break;

            case R.id.id_getVerson:

                break;
        }
    }
}
