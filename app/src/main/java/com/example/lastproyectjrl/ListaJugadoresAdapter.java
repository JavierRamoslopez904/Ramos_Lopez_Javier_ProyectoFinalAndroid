package com.example.lastproyectjrl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListaJugadoresAdapter extends RecyclerView.Adapter<ListaJugadoresAdapter.JugadoresViewHolder> {

    ArrayList<DatosJugadores> listajugadores;

    public ListaJugadoresAdapter(ArrayList<DatosJugadores> listajugadores){
        this.listajugadores = listajugadores;
    }



    @NonNull
    @Override
    public JugadoresViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lista_item_jugadores,null,false);
        return new JugadoresViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JugadoresViewHolder holder, int position) {
        holder.viewIdentificadorr.setText(listajugadores.get(position).getIdentificador());
        holder.viewNombree.setText(listajugadores.get(position).getNombre());
        holder.viewCiudad.setText(listajugadores.get(position).getCiudad());
        holder.viewEdadd.setText(listajugadores.get(position).getEdad());

    }

    @Override
    public int getItemCount() {
        return listajugadores.size();
    }

    public class JugadoresViewHolder extends RecyclerView.ViewHolder {

        TextView viewIdentificadorr, viewNombree, viewEdadd, viewCiudad;

        public JugadoresViewHolder(@NonNull View itemView) {
            super(itemView);

            viewIdentificadorr = itemView.findViewById(R.id.viewIdentificadorr);
            viewNombree = itemView.findViewById(R.id.viewNombree);
            viewEdadd= itemView.findViewById(R.id.viewEdadd);
            viewCiudad = itemView.findViewById(R.id.viewCiudad);
        }
    }
}
