package com.despesas.dtos;

/*Classe que servirá para validações dos dados que
o sistema irá receber: caso não estejam corretos será
comunicado ao usuário*/


import jakarta.validation.constraints.NotBlank;


public class EntradasDto {

    @NotBlank
    private String ds_nome;

    @NotBlank
    private double ds_valor;
}
