package com.OdontoMarcos.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.OdontoMarcos.api.model.CadastroIdentificacao;
import com.OdontoMarcos.api.service.CadastroIdentificacaoService;

import java.util.List;

@RestController
@RequestMapping("/cadastros")
public class CadastroIdentificacaoController {

    private final CadastroIdentificacaoService service;

    @Autowired
    public CadastroIdentificacaoController(CadastroIdentificacaoService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<CadastroIdentificacao> createCadastro(@RequestBody CadastroIdentificacao cadastro) {
        return ResponseEntity.ok(service.saveCadastroIdentificacao(cadastro));
    }

    @GetMapping
    public ResponseEntity<List<CadastroIdentificacao>> getAllCadastros() {
        return ResponseEntity.ok(service.findAllCadastros());
    }

    @GetMapping("/{id}")
    public ResponseEntity<CadastroIdentificacao> getCadastroById(@PathVariable Long id) {
        return service.findCadastroById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<CadastroIdentificacao> updateCadastro(@PathVariable Long id, @RequestBody CadastroIdentificacao cadastroDetails) {
        return service.findCadastroById(id)
                .map(cadastroStored -> {
                    // Copiar propriedades de cadastroDetails para cadastroStored
                    return ResponseEntity.ok(service.updateCadastro(cadastroStored));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCadastro(@PathVariable Long id) {
        service.deleteCadastro(id);
        return ResponseEntity.ok().build();
    }
}
