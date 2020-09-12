package com.example.aravattan.reubrotraining;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

public class RecyclerActivity extends AppCompatActivity {

    MyAdapter myAdapter;
    String s1[],s2[];
    RecyclerView recyclerView;
    int img[]={R.drawable.apple,R.drawable.ball,R.drawable.cat,R.drawable.dog,R.drawable.elep,R.drawable.fish,R.drawable.glass,R.drawable.hat,R.drawable.ink,R.drawable.jug};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        recyclerView=findViewById(R.id.recycler);

        s1=getResources().getStringArray(R.array.datas);
        s2=getResources().getStringArray(R.array.description);


        MyAdapter myAdapter =new MyAdapter(this,s1,s2,img);

        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }



}
