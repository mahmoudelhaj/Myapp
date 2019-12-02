package com.example.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieVh> {

    Context context ;
    List<Movie> movieList;

    public MovieAdapter(Context context ,  List<Movie> movieList) {
        this.context = context;
        this.movieList = movieList;
    }

    @NonNull
    @Override
    public MovieVh onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =LayoutInflater.from(context).inflate(R.layout.row_movie , parent , false);
        return new MovieVh(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieVh holder, int position) {
        holder.setData(movieList.get(position));
    }

    @Override
    public int getItemCount() {
        return movieList.size();
    }

    class MovieVh extends RecyclerView.ViewHolder{
        TextView  movie_name , actor_name , movie_desc , movie_date;
        public MovieVh(@NonNull View itemView) {
            super(itemView);
            movie_name = itemView.findViewById(R.id.movie_name);
            actor_name = itemView.findViewById(R.id.actor_name);
            movie_desc = itemView.findViewById(R.id.movie_desc);
            movie_date = itemView.findViewById(R.id.movie_date);
        }

        public void setData(Movie movie) {
            movie_name.setText(movie.getName());
            actor_name.setText(movie.getActor());
            movie_desc.setText(movie.getDescription());
            movie_date.setText(movie.getDate());
        }
    }
}
