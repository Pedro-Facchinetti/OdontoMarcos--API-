package com.OdontoMarcos.api.service;

import com.OdontoMarcos.api.model.PacienteInf;
import com.OdontoMarcos.api.repository.PacienteInfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteInfService {

    private final PacienteInfRepository pacienteInfRepository;

    @Autowired
    public PacienteInfService(PacienteInfRepository pacienteInfRepository) {
        this.pacienteInfRepository = pacienteInfRepository;
    }

    public List<PacienteInf> findAllPacientes() {
        return pacienteInfRepository.findAll();
    }

    public PacienteInf findPacienteById(Long id) {
        return pacienteInfRepository.findById(id).orElse(null);
    }

    public PacienteInf savePaciente(PacienteInf paciente) {
        return pacienteInfRepository.save(paciente);
    }

    public void deletePaciente(Long id) {
        pacienteInfRepository.deleteById(id);
    }

    // Outros métodos conforme necessário
}
