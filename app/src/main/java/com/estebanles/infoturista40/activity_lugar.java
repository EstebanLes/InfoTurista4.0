package com.estebanles.infoturista40;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

public class activity_lugar extends AppCompatActivity {

    String [] lugar = {"bienvenido","iglesia","lasmaravilla","loselefante","pozones","toromuerto"};
    String [] info = {"bienvenido acura brochero","iglesia transito","lasmaravilla balneario natural","loselefante piedras grandes","pozones","toromuerto"};

    int [] foto ={R.drawable.bienvenido,R.drawable.iglesia,R.drawable.lasmaravillas,R.drawable.loselefantes,R.drawable.pozones,R.drawable.toromuerto};

    RecyclerView rv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugar);
        rv1 = findViewById(R.id.recyclerView);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rv1.setLayoutManager(linearLayoutManager);
        rv1.setAdapter(new AdaptadorLugares());

    }

    private class AdaptadorLugares extends RecyclerView.Adapter<AdaptadorLugares.AdaptadorLugaresHolder>{ //crea cada elemento del recycler
        @NonNull
        @NotNull
        @Override
        public AdaptadorLugaresHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
            return new AdaptadorLugaresHolder(getLayoutInflater().inflate(R.layout.layoutitemlugares, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull @NotNull activity_lugar.AdaptadorLugares.AdaptadorLugaresHolder holder, int position) {
            holder.imprimir(position);
        }

        @Override
        public int getItemCount() {
            return lugar.length;
        }

        private class AdaptadorLugaresHolder extends RecyclerView.ViewHolder {   //imprime cada elemento del recycler

            ImageView img1;
            TextView tv1, tv2;

            public AdaptadorLugaresHolder(@NonNull @NotNull View itemView) {
                super(itemView);
                tv1=itemView.findViewById(R.id.txt_titulo);
                tv2=itemView.findViewById(R.id.txtDescripcion);
                img1=itemView.findViewById(R.id.imgDestino);
            }

            public void imprimir(int position) {
                img1.setImageResource(foto[position]);
                tv1.setText(lugar[position]);
                tv2.setText(info[position]);
            }
        }
    }
}