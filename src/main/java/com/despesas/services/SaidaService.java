package com.despesas.services;

import com.despesas.repository.SaidasRepository;

public class SaidaService {

    final SaidasRepository saidasRepository;

    public SaidaService(SaidasRepository saidasRepository) {
        this.saidasRepository = saidasRepository;
    }
}
