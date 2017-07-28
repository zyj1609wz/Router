package com.router;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.bt1).setOnClickListener(this);
        findViewById(R.id.bt2).setOnClickListener(this);
        findViewById(R.id.bt3).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt1:
                router();
                break;
            case R.id.bt2:
                //自定义路由分组，发起路由
                ARouter.getInstance().build("/com/CustomGroupActivity", "customGroup").navigation();
                break;
            case R.id.bt3:
                //加载本地html
                ARouter.getInstance().build("/com/WebActivity").navigation();
                break;
        }
    }

    void router() {
        ARouter.getInstance()
                .build("/com/Activity1")
                .withString("key", "value:123")
                .navigation(this, new NavCallback() {
                    @Override
                    public void onArrival(Postcard postcard) {
                        String group = postcard.getGroup();
                        Log.e("zhao", "分组是: " + group);
                    }
                });
    }

}
