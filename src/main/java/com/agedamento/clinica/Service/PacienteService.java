package com.agedamento.clinica.Service;

import com.agedamento.clinica.Model.Paciente;

import java.util.List;
import java.util.Optional;

public interface PacienteService {
    Paciente cadastrarPaciente(Paciente paciente);
    Optional<Paciente> buscarPaciente(Long id);
    List<Paciente> listarPacientes();
    Paciente atualizarPaciente(Long id, Paciente paciente);
}
