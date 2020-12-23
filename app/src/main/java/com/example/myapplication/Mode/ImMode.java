package com.example.myapplication.Mode;


import com.example.myapplication.C.C;
import com.example.ulibrary.base.Utils.Net.CallBack;
import com.example.ulibrary.base.Utils.Net.RetrofitUtils;

public class ImMode implements C.Mode{
    C.Presenter presenter;

    public ImMode(C.Presenter presenter) {
        this.presenter = presenter;
    }


    @Override
    public <I> void Next1(String Banurl, CallBack<I> callBack) {
        RetrofitUtils.getRetrofitUtils().get(Banurl,callBack);
    }

    @Override
    public <I> void Next2(String TITLEurl, CallBack<I> callBack) {
        RetrofitUtils.getRetrofitUtils().get(TITLEurl,callBack);
    }

    @Override
    public <I> void Next3(String Scoreurl, CallBack<I> callBack) {
        RetrofitUtils.getRetrofitUtils().get(Scoreurl,callBack);
    }
}
