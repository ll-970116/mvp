package com.example.myapplication.Fragment;

import android.os.Bundle;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.Bean.BannerBean;
import com.example.myapplication.Bean.ScoreBean;
import com.example.myapplication.Bean.TitleBean;
import com.example.myapplication.C.C;
import com.example.myapplication.Presenter.ImPresenter;
import com.example.myapplication.R;
import com.example.ulibrary.base.base.BaseFragment;


public class StudentFragment  extends BaseFragment<ImPresenter> implements C.View {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student, container, false);
    }

    @Override
    public int ID() {
        return 0;
    }

    @Override
    protected void initView(View view) {

    }

    @Override
    protected void initData() {

    }

    @Override
    public ImPresenter add() {
        return null;
    }

    @Override
    public void OnSuucess(BannerBean bannerBean) {

    }

    @Override
    public void OnErro1(String err) {

    }

    @Override
    public void OnSuucess(TitleBean titleBean) {

    }

    @Override
    public void OnErro2(String err) {

    }

    @Override
    public void OnSuucess(ScoreBean bannerBean) {

    }

    @Override
    public void OnErro3(String err) {

    }
}