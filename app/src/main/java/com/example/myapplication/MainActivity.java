package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.myapplication.Bean.BannerBean;
import com.example.myapplication.Bean.ScoreBean;
import com.example.myapplication.Bean.TitleBean;
import com.example.myapplication.C.C;
import com.example.myapplication.Fragment.AnewFragment;
import com.example.myapplication.Fragment.StudentFragment;
import com.example.myapplication.Presenter.ImPresenter;
import com.example.ulibrary.base.base.BaseActivity;
import com.google.android.material.tabs.TabLayout;
import com.youth.banner.Banner;
import com.youth.banner.loader.ImageLoader;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity<ImPresenter> implements C.View {


    private Banner baner;
    private TabLayout tablayout;
    private ViewPager viewpager;

    @Override
    protected int ID() {
        return R.layout.activity_main;
    }

    @Override
    protected void InitView() {
        baner = findViewById(R.id.banner);
        tablayout = findViewById(R.id.tablayout);
        viewpager = findViewById(R.id.viewpager);
        ArrayList<Fragment> list = new ArrayList<>();
        list.add(new AnewFragment());
        list.add(new StudentFragment());
        viewpager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @NonNull
            @Override
            public Fragment getItem(int position) {
                return list.get(position);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });

        tablayout.setupWithViewPager(viewpager);
        tablayout.getTabAt(0).setText("详情");
        tablayout.getTabAt(1).setText("成绩");

    }

    @Override
    protected void InitData() {
        presenter.p1();
    }

    @Override
    public ImPresenter add() {
        return new ImPresenter();
    }

    @Override
    public void OnSuucess(BannerBean bannerBean) {
        List<BannerBean.BannerlistDTO> bannerlist = bannerBean.getBannerlist();
        baner.setImages(bannerlist)
                .setImageLoader(new ImageLoader() {
                    @Override
                    public void displayImage(Context context, Object path, ImageView imageView) {
                        BannerBean.BannerlistDTO f = (BannerBean.BannerlistDTO) path;
                        Glide.with(MainActivity.this).load(f.getImageurl()).into(imageView);
                    }
                }).start();
    }

    @Override
    public void OnErro1(String err) {
        Log.e("TAG", "Banner:OnErro1: "+err );
    }

    @Override
    public void OnSuucess(TitleBean titleBean) {

    }

    @Override
    public void OnErro2(String err) {
        Log.e("TAG", "Tile:OnErro2: "+err );
    }

    @Override
    public void OnSuucess(ScoreBean bannerBean) {

    }

    @Override
    public void OnErro3(String err) {
        Log.e("TAG", "Score:OnErro2: "+err );
    }
}