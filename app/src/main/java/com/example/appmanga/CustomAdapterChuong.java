package com.example.appmanga;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class CustomAdapterChuong extends ArrayAdapter {
    Context context;
    int resource;
    ArrayList<String>dataListChuong;
    public CustomAdapterChuong(Context context, int resource, ArrayList<String>dataListChuong) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
        this.dataListChuong = dataListChuong;
    }

    @Override
    public int getCount() {
        return dataListChuong.size();
    }

    @NonNull
    @Override
    public View getView(int position,View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(resource,null);
        TextView tvChapter = view.findViewById(R.id.tvItemChapter);
        tvChapter.setText(dataListChuong.get(position));
        return view;
//        return super.getView(position, convertView, parent);
    }
}
