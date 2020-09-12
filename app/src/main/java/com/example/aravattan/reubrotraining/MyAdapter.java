package com.example.aravattan.reubrotraining;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    String data1[],data2[];
    int images[];
    Context context;

    public MyAdapter(Context ct,String s1[],String s2[],int image[]){


        context=ct;
        data1=s1;
        data2=s2;
        images=image;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        LayoutInflater inflater=LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent , false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int i) {
        holder.mytext1.setText(data1[i]);
        holder.mytext2.setText(data2[i]);
        holder.myimage.setImageResource(images[i]);



    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        
        TextView mytext1,mytext2;
        ImageView myimage;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mytext1=itemView.findViewById(R.id.textView);
            mytext2=itemView.findViewById(R.id.textView3);
            myimage=itemView.findViewById(R.id.imageView);
        }
    }
}
