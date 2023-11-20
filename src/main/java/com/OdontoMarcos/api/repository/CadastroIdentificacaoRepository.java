package com.OdontoMarcos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.OdontoMarcos.api.model.CadastroIdentificacao;

public interface CadastroIdentificacaoRepository extends JpaRepository<CadastroIdentificacao, Long> {
    // Métodos de consulta específicos, se necessário
}

