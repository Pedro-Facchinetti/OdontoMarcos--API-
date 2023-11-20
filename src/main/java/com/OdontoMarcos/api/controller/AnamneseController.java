package com.OdontoMarcos.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.OdontoMarcos.api.model.Anamnese;
import com.OdontoMarcos.api.service.AnamneseService;

import java.util.List;

@RestController
@RequestMapping("/anamneses")
public class AnamneseController {

    private final AnamneseService anamneseService;

    @Autowired
    public AnamneseController(AnamneseService anamneseService) {
        this.anamneseService = anamneseService;
    }

    @PostMapping
    public ResponseEntity<Anamnese> createAnamnese(@RequestBody Anamnese anamnese) {
        return ResponseEntity.ok(anamneseService.saveAnamnese(anamnese));
    }

    @GetMapping
    public ResponseEntity<List<Anamnese>> getAllAnamneses() {
        return ResponseEntity.ok(anamneseService.findAllAnamneses());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anamnese> getAnamneseById(@PathVariable Long id) {
        return anamneseService.findAnamneseById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Anamnese> updateAnamnese(@PathVariable Long id, @RequestBody Anamnese anamneseDetails) {
        return anamneseService.findAnamneseById(id)
                .map(anamneseStored -> {
                    anamneseStored.setMotivoConsulta(anamneseDetails.getMotivoConsulta());
                    // Outros campos a serem atualizados
                    return ResponseEntity.ok(anamneseService.saveAnamnese(anamneseStored));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAnamnese(@PathVariable Long id) {
        anamneseService.deleteAnamnese(id);
        return ResponseEntity.ok().build();
    }
}
