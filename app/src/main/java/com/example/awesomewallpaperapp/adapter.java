package com.example.awesomewallpaperapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class adapter  extends RecyclerView.Adapter<adapter.MyViewHolder> {

    ArrayList<Model> modelList;
    Context context;


    public adapter(ArrayList<Model> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @NotNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
       View view= LayoutInflater.from(context).inflate(R.layout.photo,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull adapter.MyViewHolder holder, int position) {
        Glide.with(context).load(modelList.get(position).getImagelink()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        public MyViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.layoutImageViewId);
        }
    }
}
