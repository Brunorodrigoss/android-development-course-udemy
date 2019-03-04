package com.brunorodrigo.recyclerview.activity;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.brunorodrigo.recyclerview.R;
import com.brunorodrigo.recyclerview.RecyclerItemClickListener;
import com.brunorodrigo.recyclerview.adapter.AdapterMovies;
import com.brunorodrigo.recyclerview.model.Movies;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Movies> moviesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        // List's Movies
        this.createMovies();

        // Setup adapter
        AdapterMovies adapterMovies = new AdapterMovies(moviesList);

        // Setup RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setAdapter(adapterMovies);

        // Click event
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {

                            @Override
                            public void onItemClick(View view, int position) {
                                Movies movie = moviesList.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Pressed item: "+movie.getTitleMovie(),
                                        Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Movies movie = moviesList.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        "Long click: "+movie.getTitleMovie(),
                                        Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                            }
                        }
                )
        );
    }

    public void createMovies(){
        Movies movies = new Movies("The Umbrella Academy ","2019","Adventure");
        this.moviesList.add(movies);

        movies = new Movies("The Punisher", "2017", "Action");
        this.moviesList.add(movies);

        movies = new Movies("Black Mirror", "2011", "Sci-fi");
        this.moviesList.add(movies);

        movies = new Movies("The Walking Dead", "2010", "Drama");
        this.moviesList.add(movies);

        movies = new Movies("The Possession of Hannah Grace", "2018", "Horror");
        this.moviesList.add(movies);

        movies = new Movies(" Call Me by Your Name", "2017", "Romance");
        this.moviesList.add(movies);

        movies = new Movies("True Detective", "2014", "Mystery");
        this.moviesList.add(movies);

        movies = new Movies("Family Guy", "1999", "Animation");
        this.moviesList.add(movies);

        movies = new Movies("Stranger Things", "2016", "Fantasy");
        this.moviesList.add(movies);

        movies = new Movies("What Men Want", "2016", "Comedy");
        this.moviesList.add(movies);




    }
}
