package com.br.dbserver.votacao.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.dbserver.votacao.model.Voto;

public interface VotoRepository   extends JpaRepository<Voto, Long> {

	ArrayList<Voto> findByPautaId(long idPauta);


}
