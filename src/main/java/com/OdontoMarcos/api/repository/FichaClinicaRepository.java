package com.OdontoMarcos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.OdontoMarcos.api.model.FichaClinica;

public interface FichaClinicaRepository extends JpaRepository<FichaClinica, Long> {
}

