package com.agedamento.clinica.Service;

import com.agedamento.clinica.Model.Medico;

import java.util.List;
import java.util.Optional;

public interface MedicoService {
    Medico cadastrarMedico(Medico medico);
    Optional<Medico> buscarMedico(Long id);
    List<Medico> listarMedicos();
    Medico atualizarMedico(Long id, Medico medico);
}
