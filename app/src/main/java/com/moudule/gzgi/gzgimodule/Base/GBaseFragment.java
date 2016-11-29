package com.moudule.gzgi.gzgimodule.Base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.ViewUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.moudule.gzgi.gzgimodule.Interface.UiOperation;

/**
 * Created by Ezreal on 2016/11/29.
 * 邮箱：376994305@qq.com
 */

public abstract class GBaseFragment extends Fragment implements UiOperation {
    public View rootView;
    public View getRootView() {
        return rootView;
    }
    private Context mContext;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext=getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {
        if (rootView == null) {
            rootView = inflater.inflate(setLayoutId(), null);
            initView();
        } else {
            // remove parent
            ViewGroup parent = (ViewGroup) rootView.getParent();
            if (parent != null) {
                parent.removeView(rootView);
            }
        }
        initView();
        initListener();
        return rootView;
    }





}
