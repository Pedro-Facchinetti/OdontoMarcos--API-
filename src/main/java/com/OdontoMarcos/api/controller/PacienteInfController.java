package com.OdontoMarcos.api.controller;

import com.OdontoMarcos.api.model.PacienteInf;
import com.OdontoMarcos.api.service.PacienteInfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacienteInf")
@CrossOrigin(origins = "http://localhost:3000")
public class PacienteInfController {

    private final PacienteInfService pacienteInfService;

    @Autowired
    public PacienteInfController(PacienteInfService pacienteInfService) {
        this.pacienteInfService = pacienteInfService;
    }

    @GetMapping
    public List<PacienteInf> getAllPacientes() {
        return pacienteInfService.findAllPacientes();
    }

    @GetMapping("/{id}")
    public PacienteInf getPacienteById(@PathVariable Long id) {
        return pacienteInfService.findPacienteById(id);
    }

    @PostMapping
    public PacienteInf addPaciente(@RequestBody PacienteInf paciente) {
        return pacienteInfService.savePaciente(paciente);
    }

    @DeleteMapping("/{id}")
    public void deletePaciente(@PathVariable Long id) {
        pacienteInfService.deletePaciente(id);
    }

    // Outros métodos conforme necessário
}
