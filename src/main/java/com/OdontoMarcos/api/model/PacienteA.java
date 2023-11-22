package com.OdontoMarcos.api.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "paciente_adulto")
public class PacienteA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private LocalDate dataNascimento;
    private Integer idade;
    private String sexo;
    private String telefone;
    private String celular;
    private String endereco;
    private String cep;
    private String uf;
    private String cidade;
    private String email;
    private LocalDate dataCadastro;

    // Construtor, getters e setters conforme necessário
}
