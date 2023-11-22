package com.OdontoMarcos.api.repository;

import com.OdontoMarcos.api.model.PacienteA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteARepository extends JpaRepository<PacienteA, Long> {
    // Métodos específicos para busca no banco, se necessário
}
