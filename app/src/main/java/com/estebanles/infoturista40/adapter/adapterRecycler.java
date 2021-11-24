package com.estebanles.infoturista40.adapter;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.estebanles.infoturista40.R;

public class adapterRecycler extends RecyclerView.Adapter<adapterRecycler.RecyclerHolder> {

    @NonNull
    @Override
    public RecyclerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class RecyclerHolder extends RecyclerView.ViewHolder {
        private ImageView imgDestino;
        private TextView txtTitulo;
        private TextView txtDestino;

        public RecyclerHolder(@NonNull View itemView) {
            super(itemView);
            imgDestino=itemView.findViewById(R.id.imgDestino);
            txtTitulo=itemView.findViewById(R.id.txtTitulo);
            txtDestino=itemView.findViewById(R.id.txtDescripcion);
        }
    }
}