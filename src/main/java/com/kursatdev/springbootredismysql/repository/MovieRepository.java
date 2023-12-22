package com.kursatdev.springbootredismysql.repository;

import com.kursatdev.springbootredismysql.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
