package com.router.service;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by ${zhaoyanjun} on 2017/7/28.
 */

@Route(path = "/service/hello", name = "测试服务")
public class MyService implements IService {

    @Override
    public void sayHello( Context context ) {
        Toast.makeText(  context , "hello", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void init(Context context) {

    }
}
