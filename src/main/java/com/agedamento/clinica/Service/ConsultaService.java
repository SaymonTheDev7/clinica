package com.agedamento.clinica.Service;

import com.agedamento.clinica.Model.Consulta;

import java.time.LocalDateTime;
import java.util.List;

public interface ConsultaService {

    Consulta agendarConsulta(Long pacienteId, Long medicoId, LocalDateTime dataHora);
    void cancelarConsulta(Long consultaId);
    List<Consulta> listarConsultas();
}
