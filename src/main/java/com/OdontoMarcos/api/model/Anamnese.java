package com.OdontoMarcos.api.model;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class Anamnese {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String motivoConsulta;
    private Integer peso;
    private Float altura;
    private String tipoSanguineo;

    // Antecedentes do paciente
    private String anemia;
    private String cardiopatias;
    private String hemorragia;
    private String hemofilia;
    private String aids;
    private String gastrite;
    private String enferVenerea;
    private String depressao;
    private String convulsao;
    private String diabetes;
    private String herpes;
    private String hepatite;
    private String desmaios;
    private String febreReumatica;
    private String tosse;
    private String asma;
    private String bronquite;
    private String rinite;
    private String sinusite;
    private String tuberculose;
    private String dorArtMandibula;
    private String pressaoAlta;
    private String tensao;
    private String artrite;
    private String reumatismo;
    private String cirroseEpatica;
    private String meningite;
    private String sensibilidadeAlergica;
    private String anestesico;
    private String analgesico;
    private String antInflamatorio;
    private String antibiotico;
    private String ulcera;
    private String outrasDoencas;

    // Medicamentos e tratamentos
    private String tomandoMedicamento;
    private String qualMedicamento;
    private String fazendoTratamento;
    private String qualTratamento;
    private String fezRadioterapiaQuimioterapia;

    // Hábitos e condições
    private String gengivaSangra;
    private String rangeDente;
    private String dormeBocaAberta;
    private String ronca;
    private String gravida;
    private Integer mesesGravidez;

    // Higiene bucal
    private String ulitmoTratamento;
    private String antesCafe;
    private String depoisCafe;
    private String depoisAlmoco;
    private String depoisJanta;
    private String antesDormir;
    private String escovaDente;
    private String tipoDePasta;
    private String usaFluor;
    private String fioDental;
}
