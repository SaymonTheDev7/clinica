package com.agedamento.clinica.Service;


import com.agedamento.clinica.Model.Consulta;
import com.agedamento.clinica.Repository.ConsultaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ConsultaServiceImpl implements ConsultaService {
    private final ConsultaRepository consultaRepository;

    public ConsultaServiceImpl(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    @Override
    public Consulta agendarConsulta(Long pacienteId, Long medicoId, LocalDateTime dataHora) {
        Consulta consulta = new Consulta(null, pacienteId, medicoId, dataHora);
        return consultaRepository.save(consulta);
    }

    @Override
    public void cancelarConsulta(Long consultaId) {
        consultaRepository.deleteById(consultaId);
    }

    @Override
    public List<Consulta> listarConsultas() {
        return consultaRepository.findAll();
    }
}
