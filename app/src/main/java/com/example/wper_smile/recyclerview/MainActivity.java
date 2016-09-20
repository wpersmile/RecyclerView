package com.example.wper_smile.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recycler=(RecyclerView)findViewById(R.id.recycle);
        /*用数组建立虚拟数据*/
        List<String> list=new ArrayList<>();
        for (int i=0;i<100;i++)
        {
            list.add(String.format(Locale.CANADA,"第%d条数据",i));
        }
        adapter = new MyAdapter(this,list);
        recycler.setAdapter(adapter);
    }
}
