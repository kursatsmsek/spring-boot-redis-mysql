package com.kursatdev.springbootredismysql.service;

import com.kursatdev.springbootredismysql.model.Movie;
import com.kursatdev.springbootredismysql.repository.MovieRepository;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieService {

    private final MovieRepository movieRepository;

    private final CacheService cacheService;

    public MovieService(MovieRepository movieRepository, CacheService cacheService) {
        this.movieRepository = movieRepository;
        this.cacheService = cacheService;
    }

    public Movie saveNewMovie(Movie movie) {
        cacheService.clearCache();
        return movieRepository.save(movie);
    }

    @Cacheable(cacheNames = "movies")
    public List<Movie> listMovies() {
        return movieRepository.findAll();
    }

    public Movie getMovieById(Long id) {
        return movieRepository.findById(id).orElseThrow();
    }
}
