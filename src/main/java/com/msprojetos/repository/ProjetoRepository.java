package com.msprojetos.repository;

import com.msprojetos.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto,Long> {
}
