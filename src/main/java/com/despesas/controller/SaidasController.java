package com.despesas.controller;

import com.despesas.services.SaidaService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/saidas")
public class SaidasController {

    final SaidaService saidaService;

    public SaidasController(SaidaService saidaService) {
        this.saidaService = saidaService;
    }
}
