package com.jcleonel.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcleonel.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}
