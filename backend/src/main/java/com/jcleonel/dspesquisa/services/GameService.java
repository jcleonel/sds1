package com.jcleonel.dspesquisa.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jcleonel.dspesquisa.dto.GameDTO;
import com.jcleonel.dspesquisa.entities.Game;
import com.jcleonel.dspesquisa.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public List<GameDTO> findAll() {
		List<Game> list = gameRepository.findAll();

		return list.stream().map(x -> new GameDTO(x)).collect(Collectors.toList());

	}

}
