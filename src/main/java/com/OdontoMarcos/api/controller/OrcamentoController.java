package com.OdontoMarcos.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.OdontoMarcos.api.model.Orcamento;
import com.OdontoMarcos.api.service.OrcamentoService;


import java.util.List;

@RestController
@RequestMapping("/orcamentos")
@CrossOrigin(origins = "http://localhost:3000")
public class OrcamentoController {

    @Autowired
    private OrcamentoService service;

    @PostMapping
    public ResponseEntity<Orcamento> createOrcamento(@RequestBody Orcamento orcamento) {
        return ResponseEntity.ok(service.saveOrcamento(orcamento));
    }

    @GetMapping
    public ResponseEntity<List<Orcamento>> getAllOrcamentos() {
        return ResponseEntity.ok(service.findAllOrcamentos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Orcamento> getOrcamentoById(@PathVariable Long id) {
        return service.findOrcamentoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Orcamento> updateOrcamento(@PathVariable Long id, @RequestBody Orcamento orcamentoDetails) {
        return service.findOrcamentoById(id)
                .map(orcamentoStored -> {
                    // Atualizar propriedades de orcamentoStored com base em orcamentoDetails
                    return ResponseEntity.ok(service.updateOrcamento(orcamentoStored));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrcamento(@PathVariable Long id) {
        service.deleteOrcamento(id);
        return ResponseEntity.ok().build();
    }
}
