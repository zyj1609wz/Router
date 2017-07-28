package com.router.service;

import android.content.Context;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by ${zhaoyanjun} on 2017/7/28.
 */

@Route(path = "/service/hello2", name = "测试服务2")
public class MyService2 implements IService {

    @Override
    public void sayHello( Context context ) {
        Toast.makeText(  context , "hello2", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void init(Context context) {

    }
}
