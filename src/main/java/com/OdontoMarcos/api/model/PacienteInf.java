package com.OdontoMarcos.api.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "paciente_infantil")
public class PacienteInf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomePacienteInf;
    private LocalDate dataNascimentoInf;
    private Integer idadePacienteInf;
    private String sexoPacienteInf;
    private String telefonePacienteInf;
    private String celularPacienteInf;
    private String enderecoPacienteInf;
    private String cepPacienteInf;
    private String ufPacienteInf;
    private String cidadePacienteInf;
    private String emailPacienteInf;
    private LocalDate dataCadastroPacienteInf;

    // Construtor, getters e setters conforme necessário
}
