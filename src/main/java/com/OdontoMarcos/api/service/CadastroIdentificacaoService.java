package com.OdontoMarcos.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.OdontoMarcos.api.model.CadastroIdentificacao;
import com.OdontoMarcos.api.repository.CadastroIdentificacaoRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CadastroIdentificacaoService {

    private final CadastroIdentificacaoRepository cadastroIdentificacaoRepository;

    @Autowired
    public CadastroIdentificacaoService(CadastroIdentificacaoRepository cadastroIdentificacaoRepository) {
        this.cadastroIdentificacaoRepository = cadastroIdentificacaoRepository;
    }

    public CadastroIdentificacao saveCadastroIdentificacao(CadastroIdentificacao cadastroIdentificacao) {
        return cadastroIdentificacaoRepository.save(cadastroIdentificacao);
    }

    public List<CadastroIdentificacao> findAllCadastros() {
        return cadastroIdentificacaoRepository.findAll();
    }

    public Optional<CadastroIdentificacao> findCadastroById(Long id) {
        return cadastroIdentificacaoRepository.findById(id);
    }

    public CadastroIdentificacao updateCadastro(CadastroIdentificacao cadastroIdentificacao) {
        return cadastroIdentificacaoRepository.save(cadastroIdentificacao);
    }

    public void deleteCadastro(Long id) {
        cadastroIdentificacaoRepository.deleteById(id);
    }
}