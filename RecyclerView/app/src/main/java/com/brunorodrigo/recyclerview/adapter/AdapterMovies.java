package com.brunorodrigo.recyclerview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.brunorodrigo.recyclerview.R;
import com.brunorodrigo.recyclerview.model.Movies;

import java.util.List;

/**
 * Created by bruno.soares on 3/4/19.
 */
public class AdapterMovies extends RecyclerView.Adapter<AdapterMovies.MyViewHolder> {

    private List<Movies> moviesList;

    public AdapterMovies(List<Movies> list) {
        this.moviesList = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View listItem = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.adapter_list, viewGroup, false);

        return new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Movies movie = moviesList.get(i);

        myViewHolder.title.setText(movie.getTitleMovie());
        myViewHolder.genre.setText(movie.getGenre());
        myViewHolder.year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView year;
        TextView genre;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.textViewTitle);
            year = itemView.findViewById(R.id.textViewYear);
            genre = itemView.findViewById(R.id.textViewGenre);
        }
    }
}
