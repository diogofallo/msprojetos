package com.msprojetos.mapper;

import com.msprojetos.dto.ProjetoDTO;
import com.msprojetos.dto.request.ProjetoRequestDTO;
import com.msprojetos.model.Projeto;
import com.msprojetos.model.enums.Status;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.time.LocalDate;

@Mapper(componentModel = "spring")
public interface ProjetoMapper {

    ProjetoDTO toDTO(Projeto entity);
    Projeto toEntity(ProjetoRequestDTO dto);

    @AfterMapping
    default void  afterMapping(@MappingTarget Projeto projeto){
        projeto.setStatusProjeto(Status.ABERTO);
        projeto.setDataInicio(LocalDate.now());
    }
}
