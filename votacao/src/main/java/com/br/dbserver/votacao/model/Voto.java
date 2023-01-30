package com.br.dbserver.votacao.model;

import java.time.LocalDateTime;
import java.util.Date;

import com.br.dbserver.votacao.dto.DadosVoto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "voto")
@Entity(name = "Voto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Voto {
	
	public Voto(@Valid DadosVoto dados, Pauta pauta) {
		this.tipoVoto = dados.tipoVoto(); 
		this.pauta = pauta;
		this.usuarioId = dados.usuarioId();
		this.dataRegistroVoto = LocalDateTime.now();
	}
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private LocalDateTime dataRegistroVoto;
	private TipoVoto tipoVoto;

	@Column(name="usuario_id", nullable = false)
	private Long usuarioId;
	
	@ManyToOne
    @JoinColumn(name="pauta_id", nullable=false)
	private Pauta pauta;
	
	
	

}
