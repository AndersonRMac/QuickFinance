package com.despesas.controller;

import com.despesas.dtos.EntradasDto;
import com.despesas.model.EntradasModel;
import com.despesas.services.EntradasService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/entradas")
public class EntradasController {

    //criar ponto de injeção do service dentro do controller

    final EntradasService entradasService;

    public EntradasController(EntradasService entradasService) {
        this.entradasService = entradasService;
    }


    @PostMapping
    //método http para salvar dados // @Valid tem que ser adicionado para que as validações descritas na classe Dto sejam feitas.
    public ResponseEntity<Object> saveEntradas (@RequestBody @Valid EntradasDto entradasDto){    //irá receber como parametro do método o Dto como JSON
        var entradasModel = new EntradasModel(); // faço a instância do model
        BeanUtils.copyProperties(entradasDto, entradasModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(entradasService.save(entradasModel));

        /*o método http vai retornar um status "criado".
        E o body irá salvar, através do service os dados
        no model que irá para o banco. Obs.: Devo criar o método (save) dentro da classe service.*/


    }
}