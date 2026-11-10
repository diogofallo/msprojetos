package com.msprojetos.service.impl;

import com.msprojetos.dto.ProjetoDTO;
import com.msprojetos.dto.request.ProjetoRequestDTO;
import com.msprojetos.mapper.ProjetoMapper;
import com.msprojetos.model.Projeto;
import com.msprojetos.repository.ProjetoRepository;
import com.msprojetos.service.ProjetoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Service
@Validated
@RequiredArgsConstructor
public class ProjetoServiceImpl implements ProjetoService {

    private final ProjetoRepository repository;
    private final ProjetoMapper mapper;

    @Override
    public ProjetoDTO newProject(@Valid ProjetoRequestDTO dto) {
        Projeto projeto = mapper.toEntity(dto);
        Projeto s = repository.save(projeto);

        return mapper.toDTO(s);
    }

    @Override
    public ProjetoDTO findProjecById(Long id) {
        Projeto projeto = repository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Projeto não encontrado: " + id));
        return mapper.toDTO(projeto);
    }

    @Override
    public List<ProjetoDTO> listProjects() {
        return repository.findAll()
                .stream()
                .map(mapper::toDTO)
                .toList();
    }
}
