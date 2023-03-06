package com.despesas.repository;

import com.despesas.model.EntradasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EntradasRepository  extends JpaRepository<EntradasModel, UUID> {
}
