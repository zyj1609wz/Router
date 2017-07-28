package com.router.service;

import android.content.Context;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * Created by ${zhaoyanjun} on 2017/7/28.
 */

public interface IService extends IProvider {
    void sayHello(Context context );
}
