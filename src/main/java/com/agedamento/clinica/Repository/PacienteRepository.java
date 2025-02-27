package com.agedamento.clinica.Repository;

import com.agedamento.clinica.Model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository <Paciente, Long> {
}
