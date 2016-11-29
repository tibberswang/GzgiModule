package com.moudule.gzgi.gzgimodule.Base;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.moudule.gzgi.gzgimodule.Interface.UiOperation;
import com.moudule.gzgi.gzgimodule.R;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Ezreal on 2016/11/29.
 * 邮箱：376994305@qq.com
 */

public abstract class GBaseActivity extends Activity implements UiOperation{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutId());
        initView();//初始化视图
        initListener();//初始化监听
        initData();//初始化数据
    }
    /**
     * Activity跳转
     * @param activity
     */
    protected void startActivity(Class<?> activity){
        Intent intent=new Intent(getBaseContext(),activity);
        startActivity(intent);
    }
    /**
     * findviewById精简 ，省去强转换
     */
    public  <T> T findView(int id){
        @SuppressWarnings("unchecked")
        T view = (T)super.findViewById(id);
        return view;
    }
}
