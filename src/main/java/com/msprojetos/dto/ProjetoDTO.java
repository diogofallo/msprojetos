package com.msprojetos.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.msprojetos.model.enums.StatusProjeto;
import com.msprojetos.model.enums.StatusProjeto;

public record ProjetoDTO(
        @JsonProperty("id") Long id,
        String nome,
        String descricao,
        String dataInicio,
        String dataTermino,
        StatusProjeto status
) {
}
