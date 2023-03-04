package com.despesas.repository;

import com.despesas.model.Saidas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SaidasRepository extends JpaRepository<Saidas, UUID> {
}
