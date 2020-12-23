package com.example.myapplication.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.Adapter.MyAdapterHome;
import com.example.myapplication.Bean.BannerBean;
import com.example.myapplication.Bean.ScoreBean;
import com.example.myapplication.Bean.TitleBean;
import com.example.myapplication.C.C;
import com.example.myapplication.Presenter.ImPresenter;
import com.example.myapplication.R;
import com.example.ulibrary.base.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;


public class AnewFragment extends BaseFragment<ImPresenter> implements C.View {


    // TODO: Rename and change types of parameters

    private RecyclerView recyclerview;
    private ArrayList<TitleBean.NewsDTO> list;
    private MyAdapterHome myAdapterHome;


    @Override
    public int ID() {
        return R.layout.fragment_anew;
    }

    @Override
    protected void initView(View view) {
        recyclerview = view.findViewById(R.id.recyclerview);
        recyclerview.setLayoutManager(new LinearLayoutManager(getActivity()));
        list = new ArrayList<>();
        myAdapterHome = new MyAdapterHome(getActivity(),list);
        recyclerview.setAdapter(myAdapterHome);
    }

    @Override
    protected void initData() {
        presenter.p2();
    }

    @Override
    public ImPresenter add() {
        return new ImPresenter();
    }

    @Override
    public void OnSuucess(BannerBean bannerBean) {

    }

    @Override
    public void OnErro1(String err) {

    }

    @Override
    public void OnSuucess(TitleBean titleBean) {
        List<TitleBean.NewsDTO> news = titleBean.getNews();
        list.addAll(news);
        myAdapterHome.notifyDataSetChanged();
    }

    @Override
    public void OnErro2(String err) {
        Log.e("TAG", "OnErro2: "+err);
    }

    @Override
    public void OnSuucess(ScoreBean bannerBean) {

    }

    @Override
    public void OnErro3(String err) {

    }
}