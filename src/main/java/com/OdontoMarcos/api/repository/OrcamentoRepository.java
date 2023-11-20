package com.OdontoMarcos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.OdontoMarcos.api.model.Orcamento;

public interface OrcamentoRepository extends JpaRepository<Orcamento, Long> {
}