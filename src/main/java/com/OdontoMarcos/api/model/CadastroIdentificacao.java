package com.OdontoMarcos.api.model;

import lombok.Data;

import java.time.LocalDate;

import com.OdontoMarcos.api.enums.Sexo;
import com.OdontoMarcos.api.enums.StatusPaciente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "cadastro_identificacao")
public class CadastroIdentificacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private LocalDate dataAtual;

    @Column(nullable = false)
    private LocalDate dataNascimento;

    @Column(nullable = false)
    private Integer idade;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Column(nullable = false)
    private Integer telefone;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private Integer celular;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private String uf;

    @Column(nullable = false)
    private Integer cep;

    @Column(nullable = false)
    private String email;

    @Enumerated(EnumType.STRING)
    private StatusPaciente statusPaciente;
}