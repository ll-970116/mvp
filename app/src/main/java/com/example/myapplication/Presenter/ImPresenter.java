package com.example.myapplication.Presenter;


import com.example.myapplication.Bean.BannerBean;
import com.example.myapplication.Bean.ScoreBean;
import com.example.myapplication.Bean.TitleBean;
import com.example.myapplication.C.C;
import com.example.myapplication.Mode.ImMode;
import com.example.ulibrary.base.Utils.Net.CallBack;
import com.example.ulibrary.base.Utils.Net.UulCon;
import com.example.ulibrary.base.base.BasePresenter;

public class ImPresenter  extends BasePresenter<C.View,C.Mode> implements C.Presenter {

    @Override
    public C.Mode setImode() {
        return new ImMode(this);
    }

    @Override
    public void p1() {
        imode.Next1(UulCon.BannUrl, new CallBack<BannerBean>() {
            @Override
            public void OnSuucess(BannerBean bannerBean) {
                iview.OnSuucess(bannerBean);
            }

            @Override
            public void OnErro(String err) {
                iview.OnErro1(err);
            }
        });
    }

    @Override
    public void p2() {
        imode.Next1(UulCon.TitlUrl, new CallBack<TitleBean>() {
            @Override
            public void OnSuucess(TitleBean bannerBean) {
                iview.OnSuucess(bannerBean);
            }

            @Override
            public void OnErro(String err) {
                iview.OnErro1(err);
            }
        });
    }

    @Override
    public void p3() {
        imode.Next1(UulCon.ScoreUrl, new CallBack<ScoreBean>() {
            @Override
            public void OnSuucess(ScoreBean bannerBean) {
                iview.OnSuucess(bannerBean);
            }

            @Override
            public void OnErro(String err) {
                iview.OnErro1(err);
            }
        });
    }
}
