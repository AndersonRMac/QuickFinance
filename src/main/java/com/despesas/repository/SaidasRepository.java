package com.despesas.repository;

import com.despesas.model.SaidasModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SaidasRepository extends JpaRepository<SaidasModel, UUID> {
}
