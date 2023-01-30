package com.br.dbserver.votacao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.dbserver.votacao.model.Pauta;

@Repository
public interface PautaRepository  extends JpaRepository<Pauta, Long> {

}
