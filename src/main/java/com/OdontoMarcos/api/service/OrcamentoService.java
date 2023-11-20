package com.OdontoMarcos.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.OdontoMarcos.api.model.Orcamento;
import com.OdontoMarcos.api.repository.OrcamentoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrcamentoService {

    private final OrcamentoRepository orcamentoRepository;

    @Autowired
    public OrcamentoService(OrcamentoRepository orcamentoRepository) {
        this.orcamentoRepository = orcamentoRepository;
    }

    public Orcamento saveOrcamento(Orcamento orcamento) {
        return orcamentoRepository.save(orcamento);
    }

    public List<Orcamento> findAllOrcamentos() {
        return orcamentoRepository.findAll();
    }

    public Optional<Orcamento> findOrcamentoById(Long id) {
        return orcamentoRepository.findById(id);
    }

    public Orcamento updateOrcamento(Orcamento orcamento) {
        return orcamentoRepository.save(orcamento);
    }

    public void deleteOrcamento(Long id) {
        orcamentoRepository.deleteById(id);
    }
}
