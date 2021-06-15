package com.example.dz3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterBook extends RecyclerView.Adapter<AdapterBook.HolderBook> {
    LayoutInflater layoutInflater;
    List<Model> list;

    public AdapterBook(List<Model> list, Context context) {
        this.list = list;
        this.layoutInflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public AdapterBook.HolderBook onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_holder,parent,false);
        return new HolderBook(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  AdapterBook.HolderBook holder, int position) {
       holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class HolderBook extends RecyclerView.ViewHolder {
        TextView txtTitle, txtDescription;
        ImageView image1;

        public HolderBook(@NonNull  View itemView) {
            super(itemView);
            txtTitle = itemView.findViewById(R.id.txt_as);
            txtDescription = itemView.findViewById(R.id.txt_description);
            image1 = itemView.findViewById(R.id.image_view);
        }

        public void bind(Model s) {
            txtTitle.setText(s.getTitle());
            txtDescription.setText(s.getDescripton());
            image1.setImageResource(s.getImageModel());

        }
    }
}
