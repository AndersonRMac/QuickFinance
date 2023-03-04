package com.despesas.services;

import com.despesas.repository.EntradasRepository;
import org.springframework.stereotype.Service;
//transações com o banco
@Service
public class EntradasService {
    //ponto de injeções de dependecias do repository para transações com o banco

    final EntradasRepository entradasRepository;

    public EntradasService(EntradasRepository entradasRepository) {
        this.entradasRepository = entradasRepository;
    }
}
