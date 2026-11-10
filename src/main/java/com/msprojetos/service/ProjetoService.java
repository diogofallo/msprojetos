package com.msprojetos.service;

import com.msprojetos.dto.ProjetoDTO;
import com.msprojetos.dto.request.ProjetoRequestDTO;
import com.msprojetos.model.Projeto;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProjetoService {

    ProjetoDTO newProject(@Valid ProjetoRequestDTO dto);
    ProjetoDTO findProjecById(Long id);
    List<ProjetoDTO> listProjects();

}
