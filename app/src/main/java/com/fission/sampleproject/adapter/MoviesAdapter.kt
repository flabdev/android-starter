package com.fission.sampleproject.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fission.sampleproject.databinding.MoviesAdapterBinding
import com.fission.sampleproject.model.Movie

class MoviesAdapter : RecyclerView.Adapter<MainViewHolder>() {

    private var movies = ArrayList<Movie>()

    @SuppressLint("NotifyDataSetChanged")
    fun setMovieList(movies: List<Movie>) {
        this.movies = movies as ArrayList<Movie>
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MoviesAdapterBinding.inflate(inflater, parent, false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val movie = movies[position]
        holder.binding.name.text = movie.name
    }

    override fun getItemCount(): Int {
        return movies.size
    }
}

class MainViewHolder(val binding: MoviesAdapterBinding) : RecyclerView.ViewHolder(binding.root)
