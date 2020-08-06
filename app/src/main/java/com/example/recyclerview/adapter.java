package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapter extends RecyclerView.Adapter<adapter.tanim> {
    Context context;
    List<mesajModel> list;

    public adapter(Context context, List<mesajModel> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public tanim onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout,parent,false);
        return new tanim(view);
    }

    @Override
    public void onBindViewHolder(@NonNull tanim holder, final int position) {
        holder.mesaj.setText(list.get(position).getMesaj());
        holder.kisi.setText(list.get(position).getIsim());
        holder.img.setImageResource(list.get(position).getResimId());
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, list.get(position).getIsim(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class tanim extends RecyclerView.ViewHolder{
        ImageView img;
        TextView kisi;
        TextView mesaj;
        public tanim(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.kResim);
            kisi = itemView.findViewById(R.id.kIsmi);
            mesaj = itemView.findViewById(R.id.kMesaj);
        }
    }
}
