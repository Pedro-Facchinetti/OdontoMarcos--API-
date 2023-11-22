package com.OdontoMarcos.api.repository;

import com.OdontoMarcos.api.model.PacienteInf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteInfRepository extends JpaRepository<PacienteInf, Long> {
    // Métodos adicionais de pesquisa, se necessário
}
