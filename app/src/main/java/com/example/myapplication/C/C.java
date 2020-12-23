package com.example.myapplication.C;


import com.example.myapplication.Bean.BannerBean;
import com.example.myapplication.Bean.ScoreBean;
import com.example.myapplication.Bean.TitleBean;
import com.example.ulibrary.base.BaseView;
import com.example.ulibrary.base.Utils.Net.CallBack;
import com.example.ulibrary.base.base.BaseMode;

public interface C {
    public interface Mode extends BaseMode, com.example.ulibrary.base.BaseMode {
        <I> void Next1(String Banurl, CallBack<I> callBack);
        <I> void Next2(String TITLEurl, CallBack<I> callBack);
        <I> void Next3(String Scoreurl, CallBack<I> callBack);
    }

    public interface Presenter{
        void p1();
        void p2();
        void p3();
    }

    public interface View extends BaseView, com.example.ulibrary.base.base.BaseView {
        void OnSuucess(BannerBean bannerBean);
        void OnErro1(String err);
        void OnSuucess(TitleBean titleBean);
        void OnErro2(String err);
        void OnSuucess(ScoreBean bannerBean);
        void OnErro3(String err);
    }
}
