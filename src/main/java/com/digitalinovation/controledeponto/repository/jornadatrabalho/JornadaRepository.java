package com.digitalinovation.controledeponto.repository.jornadatrabalho;

import com.digitalinovation.controledeponto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
