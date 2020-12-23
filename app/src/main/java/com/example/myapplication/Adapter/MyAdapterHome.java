package com.example.myapplication.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.myapplication.Bean.TitleBean;
import com.example.myapplication.R;

import java.util.ArrayList;

public class MyAdapterHome extends RecyclerView.Adapter<MyAdapterHome.VIewHolder> {
    Context context;
    ArrayList<TitleBean.NewsDTO> list;

    public MyAdapterHome(Context context, ArrayList<TitleBean.NewsDTO> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public VIewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View root = LayoutInflater.from(context).inflate(R.layout.rl_item, parent, false);
        return new VIewHolder(root);
    }

    @Override
    public void onBindViewHolder(@NonNull VIewHolder holder, int position) {
        TitleBean.NewsDTO newsDTO = list.get(position);
        holder.textView.setText(newsDTO.getContent());
        Glide.with(context).load(newsDTO.getImageUrl()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class VIewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;
        public VIewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image1);
            textView=itemView.findViewById(R.id.titleView1);
        }
    }
}
