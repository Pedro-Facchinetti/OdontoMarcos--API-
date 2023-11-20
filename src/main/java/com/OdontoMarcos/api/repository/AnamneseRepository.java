package com.OdontoMarcos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.OdontoMarcos.api.model.Anamnese;

public interface AnamneseRepository extends JpaRepository<Anamnese, Long> {
    // Métodos específicos de consulta, se necessário
}

