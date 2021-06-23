package com.jcleonel.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcleonel.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
