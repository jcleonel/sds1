package com.jcleonel.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcleonel.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
