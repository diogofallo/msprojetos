package com.msprojetos.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;

public record ProjetoRequestDTO(
        @NotBlank @NotNull(message="Nome do Projeto é obrigatório") @Length(min = 5, max = 200) String nome,
        @NotBlank @NotNull(message="Dercrição do Projeto é obrigatório") @Length(min = 5, max = 200) String descricao
) {
}
