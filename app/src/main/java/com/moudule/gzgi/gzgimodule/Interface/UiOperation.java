package com.moudule.gzgi.gzgimodule.Interface;

import android.view.View;

/**
 * Created by Ezreal on 2016/11/29.
 * 邮箱：376994305@qq.com
 *
 */

public  interface UiOperation  extends View.OnClickListener{
    /** 返回一个用于设置界面的布局id */
    int setLayoutId();

    /** 初始化View */
    void initView();

    /** 初始化监听器 */
    void initListener();

    /** 初始化数据，并显示到界面上 */
    void initData();

    /** 单击事件在这个方法中处理 */
    void onClick(View v, int id);
}
