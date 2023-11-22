package com.OdontoMarcos.api.controller;

import com.OdontoMarcos.api.model.PacienteA;
import com.OdontoMarcos.api.service.PacienteAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacienteA")
@CrossOrigin(origins = "http://localhost:3000")
public class PacienteAController {

    private final PacienteAService pacienteAService;

    @Autowired
    public PacienteAController(PacienteAService pacienteAService) {
        this.pacienteAService = pacienteAService;
    }

    @GetMapping
    public List<PacienteA> getAllPacientes() {
        return pacienteAService.findAllPacientes();
    }

    @GetMapping("/{id}")
    public PacienteA getPacienteById(@PathVariable Long id) {
        return pacienteAService.findPacienteById(id);
    }

    @PostMapping
    public PacienteA addPaciente(@RequestBody PacienteA paciente) {
        return pacienteAService.savePaciente(paciente);
    }

    @DeleteMapping("/{id}")
    public void deletePaciente(@PathVariable Long id) {
        pacienteAService.deletePaciente(id);
    }

    // Outros métodos conforme necessário
}
