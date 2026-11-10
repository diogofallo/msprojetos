package com.msprojetos.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.msprojetos.model.enums.Status;

public record ProjetoDTO(
        @JsonProperty("id") Long id,
        String nome,
        String descricao,
        String dataInicio,
        String dataTermino,
        Status status
) {
}
