package com.OdontoMarcos.api.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "orcamento")
public class Orcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Radiografia
    private Boolean dente1;
    private Boolean dente2;
    private Boolean dente3;
    private Boolean dente4;
    private Boolean dente5;
    private Boolean dente6;
    private Boolean dente7;
    private Boolean dente8;
    private Boolean dente9;
    private Boolean dente10;
    private Boolean dente11;
    private Boolean dente12;
    private Boolean dente13;
    private Boolean dente14;
    private Boolean dente15;
    private Boolean dente16;
    private Boolean dente17;
    private Boolean dente18;
    private Boolean dente19;
    private Boolean dente20;
    private Boolean dente21;
    private Boolean dente22;
    private Boolean dente23;
    private Boolean dente24;
    private Boolean dente25;
    private Boolean dente26;
    private Boolean dente27;
    private Boolean dente28;
    private Boolean dente29;
    private Boolean dente30;
    private Boolean dente31;
    private Boolean dente32;

    private LocalDate dataPagamento;
    private String descricaoServicos;
    private String formaDePagamento;
    private Integer horarioAtendimento;
    private String pacienteName;
    private Boolean segunda;
    private Boolean terca;
    private Boolean quarta;
    private Boolean quinta;
    private Boolean sexta;
    private Boolean sabado;
    private Integer validadeOrcamento;
    private Float valorProcedimento;
    private String situacaoPagamento;

    // Construtor, getters e setters conforme necessário
}