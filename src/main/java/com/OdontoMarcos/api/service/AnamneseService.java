package com.OdontoMarcos.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.OdontoMarcos.api.model.Anamnese;
import com.OdontoMarcos.api.repository.AnamneseRepository;

import java.util.List;
import java.util.Optional;

@Service
public class AnamneseService {

    private final AnamneseRepository anamneseRepository;

    @Autowired
    public AnamneseService(AnamneseRepository anamneseRepository) {
        this.anamneseRepository = anamneseRepository;
    }

    public Anamnese saveAnamnese(Anamnese anamnese) {
        return anamneseRepository.save(anamnese);
    }

    public List<Anamnese> findAllAnamneses() {
        return anamneseRepository.findAll();
    }

    public Optional<Anamnese> findAnamneseById(Long id) {
        return anamneseRepository.findById(id);
    }

    public Anamnese updateAnamnese(Anamnese anamnese) {
        return anamneseRepository.save(anamnese);
    }

    public void deleteAnamnese(Long id) {
        anamneseRepository.deleteById(id);
    }
}


