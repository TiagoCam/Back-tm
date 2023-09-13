package com.tiago.model;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Agenda {

    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "CONTA_ORIGEM", length = 6, nullable = false, unique = true)
	private String contaOrigem;
	
	@Column(name = "CONTA_DESTINO", length = 6, nullable = false, unique = true)
	private String contaDestino;
	
	@Column(name = "VALOR", nullable = false, unique = false)
	private Double valor;

     @Column(name = "DATA_REGISTRO", updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataRegistro;
	
	@Column(name = "DATA_TRANSFER", updatable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataTransfer;


      
}
