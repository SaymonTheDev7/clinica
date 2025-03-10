package com.agedamento.clinica.Repository;

import com.agedamento.clinica.Model.Consulta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ConsultaRepository extends JpaRepository<Consulta, Long> {
    List<Consulta> findByMedicoId(Long medicoId);

}
