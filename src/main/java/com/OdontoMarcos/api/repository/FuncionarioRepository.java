package com.OdontoMarcos.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.OdontoMarcos.api.model.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}