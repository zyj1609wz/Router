package com.router;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by ${zhaoyanjun} on 2017/7/27.
 */

public class AppTest {

    public void sayHello(Context context) {
        Toast.makeText(context, "hello", Toast.LENGTH_SHORT).show();
    }
}
