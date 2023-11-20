package com.OdontoMarcos.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.OdontoMarcos.api.model.FichaClinica;
import com.OdontoMarcos.api.repository.FichaClinicaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class FichaClinicaService {

    private final FichaClinicaRepository fichaClinicaRepository;

    @Autowired
    public FichaClinicaService(FichaClinicaRepository fichaClinicaRepository) {
        this.fichaClinicaRepository = fichaClinicaRepository;
    }

    public FichaClinica saveFichaClinica(FichaClinica fichaClinica) {
        return fichaClinicaRepository.save(fichaClinica);
    }

    public List<FichaClinica> findAllFichas() {
        return fichaClinicaRepository.findAll();
    }

    public Optional<FichaClinica> findFichaById(Long id) {
        return fichaClinicaRepository.findById(id);
    }

    public FichaClinica updateFicha(FichaClinica fichaClinica) {
        return fichaClinicaRepository.save(fichaClinica);
    }

    public void deleteFicha(Long id) {
        fichaClinicaRepository.deleteById(id);
    }
}