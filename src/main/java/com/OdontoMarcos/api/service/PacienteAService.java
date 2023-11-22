package com.OdontoMarcos.api.service;

import com.OdontoMarcos.api.model.PacienteA;
import com.OdontoMarcos.api.repository.PacienteARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteAService {

    private final PacienteARepository pacienteARepository;

    @Autowired
    public PacienteAService(PacienteARepository pacienteARepository) {
        this.pacienteARepository = pacienteARepository;
    }

    public List<PacienteA> findAllPacientes() {
        return pacienteARepository.findAll();
    }

    public PacienteA findPacienteById(Long id) {
        return pacienteARepository.findById(id).orElse(null);
    }

    public PacienteA savePaciente(PacienteA paciente) {
        return pacienteARepository.save(paciente);
    }

    public void deletePaciente(Long id) {
        pacienteARepository.deleteById(id);
    }

}

