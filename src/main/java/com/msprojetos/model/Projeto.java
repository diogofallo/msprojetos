package com.msprojetos.model;

import com.msprojetos.model.enums.StatusProjeto;
import com.msprojetos.model.enums.StatusProjeto;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "projetos")
@Data
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "data_inicio", nullable = false)
    private LocalDate dataInicio;

    @Column(name = "data_termino")
    private LocalDate dataTermino;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private StatusProjeto statusProjeto;

}
