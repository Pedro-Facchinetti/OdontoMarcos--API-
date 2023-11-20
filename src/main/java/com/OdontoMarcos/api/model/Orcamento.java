package com.OdontoMarcos.api.model;

import java.sql.Time;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "orcamento")
public class Orcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String diasDeTratamento;

    private Time horarios;

    @Column(nullable = false)
    private Integer validoPorQuantosDias;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private String servicosAExecutar;

    @Column(nullable = false)
    private Float valorTotal;

    @Column(nullable = false)
    private LocalDate dataAtualOrcamento;

    @Column(nullable = false)
    private String planoDePagamentos;
}

