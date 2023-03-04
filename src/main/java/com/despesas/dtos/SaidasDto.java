package com.despesas.dtos;

import jakarta.validation.constraints.NotBlank;

public class SaidasDto {


    @NotBlank
    private String ds_nome;

    @NotBlank
    private double ds_valor;

    @NotBlank
    private String ds_parcela;

    @NotBlank
    private String ds_vencimento;
}
