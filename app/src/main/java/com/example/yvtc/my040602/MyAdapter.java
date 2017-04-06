package com.example.yvtc.my040602;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by YVTC on 2017/4/6.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    String data[];
    Context context;
    public MyAdapter(Context context,String[] data){
        this.data = data;
        this.context = context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_text_view,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv.setText(data[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    static  class ViewHolder extends  RecyclerView.ViewHolder{
        TextView tv;
        public ViewHolder(View itemView){
            super(itemView);
            tv= (TextView)itemView.findViewById(R.id.textView);
        }
    }
}
