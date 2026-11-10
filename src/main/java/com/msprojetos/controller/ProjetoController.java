package com.msprojetos.controller;

import com.msprojetos.dto.ProjetoDTO;
import com.msprojetos.dto.request.ProjetoRequestDTO;
import com.msprojetos.responses.Response;
import com.msprojetos.service.ProjetoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("msprojetos")
@RequiredArgsConstructor
public class ProjetoController {

    private final ProjetoService service;

    @PostMapping
    public ResponseEntity<Response> newProduct(@RequestBody ProjetoRequestDTO projeto) {
        Response response = new Response();
        service.newProject(projeto);

        response.setMsgRetorno("Projeto cadastrado com sucesso!");
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{id:\\d+}")
    public ResponseEntity<ProjetoDTO> findProjectById(@PathVariable Long id) {
        ProjetoDTO projeto = service.findProjecById(id);
        return ResponseEntity.ok(projeto);
    }

    @GetMapping("/lista-projetos")
    public ResponseEntity<List<ProjetoDTO>> listProjects(){
        return ResponseEntity.ok(service.listProjects());
    }
}
