package com.example.myapplication.Adapter;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.Bean.ScoreBean;
import com.example.myapplication.R;


import java.util.ArrayList;


public class MyAdapterColl extends RecyclerView.Adapter<MyAdapterColl.ViewHolder> {
    Context context;
    ArrayList<ScoreBean.StudenlistDTO> list;

    public MyAdapterColl(Context context, ArrayList<ScoreBean.StudenlistDTO> list) {
        this.context = context;
        this.list = list;
    }

    public MyAdapterColl(FragmentActivity activity, ArrayList<ScoreBean.StudenlistDTO> list) {

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.l_item, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ScoreBean.StudenlistDTO studenlistDTO = list.get(position);
        holder.imageView1.setText(Html.fromHtml("<h1>姓名："+studenlistDTO.getName()+"</h1>"));
        holder.imageView2.setText(studenlistDTO.getSkill()+"");
        holder.imageView3.setText(studenlistDTO.getTheory()+"");
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView imageView1;
        TextView imageView2;
        TextView imageView3;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView1=itemView.findViewById(R.id.tv_name);
            imageView2=itemView.findViewById(R.id.tv_ll);
            imageView3=itemView.findViewById(R.id.tv_jn);
        }
    }
}
