package com.OdontoMarcos.api.model;

import lombok.Data;

import jakarta.persistence.*;

import com.OdontoMarcos.api.enums.Cor;
import com.OdontoMarcos.api.enums.SimNao;
import com.OdontoMarcos.api.enums.TipoAnamnese;
import com.OdontoMarcos.api.enums.TipoParto;
import com.OdontoMarcos.api.enums.TipoSanguineo;

@Data
@Entity
public class Anamnese {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TipoAnamnese tipoAnamnese;

    @Column(nullable = false)
    private String motivoConsulta;

    @Column(nullable = false)
    private Integer peso;

    @Column(nullable = false)
    private Float altura;

    @Enumerated(EnumType.STRING)
    private Cor cor;

    @Enumerated(EnumType.STRING)
    private TipoSanguineo tipoSanguineo;

    @Enumerated(EnumType.STRING)
    private SimNao anemia;

    @Enumerated(EnumType.STRING)
    private SimNao cardiopatias;

    @Enumerated(EnumType.STRING)
    private SimNao hemorragia;

    @Enumerated(EnumType.STRING)
    private SimNao hemofilia;

    @Enumerated(EnumType.STRING)
    private SimNao aids;

    @Enumerated(EnumType.STRING)
    private SimNao gastrite;

    private String problemasGestacao;

    @Enumerated(EnumType.STRING)
    private SimNao convulsao;

    @Enumerated(EnumType.STRING)
    private SimNao depressao;

    @Enumerated(EnumType.STRING)
    private SimNao diabetes;

    @Enumerated(EnumType.STRING)
    private SimNao hepatite;

    @Enumerated(EnumType.STRING)
    private SimNao herpes;

    @Enumerated(EnumType.STRING)
    private SimNao desmaiosTonturas;

    @Enumerated(EnumType.STRING)
    private TipoParto parto;

    @Enumerated(EnumType.STRING)
    private SimNao tosseFrequente;
}