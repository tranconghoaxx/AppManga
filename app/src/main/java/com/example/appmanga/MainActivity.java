package com.example.appmanga;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvChuong;
    ArrayList<String>dataStringChuong = new ArrayList<>();
    //    ArrayAdapter adapter;
    CustomAdapterChuong adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setControl();
        setEvent();
    }

    private void setEvent() {
        KhoiTao();
        adapter = new CustomAdapterChuong(this,R.layout.item_chapter,dataStringChuong);
        lvChuong.setAdapter(adapter);
    }

    private void KhoiTao() {
        dataStringChuong.add("adaf");
//        dataStringChuong.add(getResources().getString(R.string.chuong1).toString());
//        dataStringChuong.add(getResources().getString(R.string.chuong2));
//        dataStringChuong.add(getResources().getString(R.string.chuong3));
//        dataStringChuong.add(getResources().getString(R.string.chuong4));
//        dataStringChuong.add(getResources().getString(R.string.chuong5));
//        dataStringChuong.add(getResources().getString(R.string.chuong6));
//        dataStringChuong.add(getResources().getString(R.string.chuong7));
//        dataStringChuong.add(getResources().getString(R.string.chuong8));
//        dataStringChuong.add(getResources().getString(R.string.chuong9));
//        dataStringChuong.add(getResources().getString(R.string.chuong10));
//        dataStringChuong.add(getResources().getString(R.string.chuong11));
//        dataStringChuong.add(getResources().getString(R.string.chuong12));
//        dataStringChuong.add(getResources().getString(R.string.chuong13));
//        dataStringChuong.add(getResources().getString(R.string.chuong14));
    }

    private void setControl() {
        lvChuong = findViewById(R.id.lvChuong);
    }
}
