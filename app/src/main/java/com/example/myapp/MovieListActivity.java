package com.example.myapp;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MovieListActivity extends AppCompatActivity {

    RecyclerView moviesList_rv;
    MovieAdapter movieAdapter;

    List<Movie> movieList  = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_list);

        movieList.add(new Movie("Yevadu ","Ram Charan","Is the best indian movie","11/05/2016"));//
        movieList.add(new Movie("Rian ","Allu Arjun","For the romantic and love","07/10/2017"));//
        movieList.add(new Movie("Multa ","Rehana","For the Action","14/09/2017"));//
        movieList.add(new Movie("Yevadu ","Ram Charan","Is the best indian movie","11/05/2016"));//
        movieList.add(new Movie("Rian ","Allu Arjun","For the romantic and love","07/10/2017"));//
        movieList.add(new Movie("Multa ","Rehana","For the Action","14/09/2017"));//
        movieList.add(new Movie("Yevadu ","Ram Charan","Is the best indian movie","11/05/2016"));//
        movieList.add(new Movie("Rian ","Allu Arjun","For the romantic and love","07/10/2017"));//
        movieList.add(new Movie("Multa ","Rehana","For the Action","14/09/2017"));//
        movieList.add(new Movie("Yevadu ","Ram Charan","Is the best indian movie","11/05/2016"));//
        movieList.add(new Movie("Rian ","Allu Arjun","For the romantic and love","07/10/2017"));//
        movieList.add(new Movie("Multa ","Rehana","For the Action","14/09/2017"));//

        moviesList_rv = findViewById(R.id.moviesList_rv);
        moviesList_rv.setLayoutManager(new LinearLayoutManager(this));
        movieAdapter = new MovieAdapter(this ,movieList);
        moviesList_rv.setAdapter(movieAdapter);
    }
}
