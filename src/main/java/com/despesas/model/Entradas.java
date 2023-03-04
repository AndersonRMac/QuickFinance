package com.despesas.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.UUID;

//aqui é onde eu crio os modelos, que serão criados dentro do banco de dados como tabelas

@Entity
@Table(name = "TB_ENTRADA")
public class Entradas implements Serializable {
    private static final long serioVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO) // significa que o ID vai ser gerado de forma automática//
    private UUID id;

    @Column(nullable = false, unique = true, length = 20)  //equivale ao not nulll,
    private String ds_nome;

    @Column(nullable = false, unique = true, length = 20)
    private double ds_valor;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDs_nome() {
        return ds_nome;
    }

    public void setDs_nome(String ds_nome) {
        this.ds_nome = ds_nome;
    }

    public double getDs_valor() {
        return ds_valor;
    }

    public void setDs_valor(double ds_valor) {
        this.ds_valor = ds_valor;
    }
}
