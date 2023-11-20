package com.OdontoMarcos.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.OdontoMarcos.api.model.FichaClinica;
import com.OdontoMarcos.api.service.FichaClinicaService;

import java.util.List;

@RestController
@RequestMapping("/fichasclinicas")
public class FichaClinicaController {

    private final FichaClinicaService service;

    @Autowired
    public FichaClinicaController(FichaClinicaService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<FichaClinica> createFichaClinica(@RequestBody FichaClinica fichaClinica) {
        return ResponseEntity.ok(service.saveFichaClinica(fichaClinica));
    }

    @GetMapping
    public ResponseEntity<List<FichaClinica>> getAllFichas() {
        return ResponseEntity.ok(service.findAllFichas());
    }

    @GetMapping("/{id}")
    public ResponseEntity<FichaClinica> getFichaById(@PathVariable Long id) {
        return service.findFichaById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<FichaClinica> updateFicha(@PathVariable Long id, @RequestBody FichaClinica fichaDetails) {
        return service.findFichaById(id)
                .map(fichaStored -> {
                    // Atualizar propriedades de fichaStored com base em fichaDetails
                    return ResponseEntity.ok(service.updateFicha(fichaStored));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFicha(@PathVariable Long id) {
        service.deleteFicha(id);
        return ResponseEntity.ok().build();
    }
}