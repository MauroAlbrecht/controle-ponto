package com.digitalinovation.controledeponto.repository.empresa;

import com.digitalinovation.controledeponto.model.Empresa;
import com.digitalinovation.controledeponto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
