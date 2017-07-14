package com.igrs.utils.utils;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends BaseActivity {
    Button btn;
    TextView tv_show;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        context = this;
         tv_show = (TextView) findViewById(R.id.tv_show);
        btn = (Button)findViewById(R.id.finishActivity);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           // Utils.exitApp(SecondActivity.this);
            //  ToastUtils.showToast(SecondActivity.this,"退出");
            //  tv_show.setText(TelephoneUtil.getSpreadtrumTeleInfo(SecondActivity.this).toString());
               // AppUtil.shareToOtherApp(context,"标题","内容","对话框标题");
                tv_show.setText(AppUtil.getPackageInfo(SecondActivity.this).versionCode+"------"+ AppUtil.getPackageInfo(SecondActivity.this).versionName);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

    }
}
