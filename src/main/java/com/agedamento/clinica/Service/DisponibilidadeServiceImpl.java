package com.agedamento.clinica.Service;

import com.agedamento.clinica.Model.Consulta;
import com.agedamento.clinica.Repository.ConsultaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DisponibilidadeServiceImpl implements DisponibilidadeService {
    private final ConsultaRepository consultaRepository;

    public DisponibilidadeServiceImpl(ConsultaRepository consultaRepository) {
        this.consultaRepository = consultaRepository;
    }

    @Override
    public List<LocalDateTime> verificarDisponibilidade(Long medicoId) {
        List<Consulta> consultas = consultaRepository.findByMedicoId(medicoId);

        if (consultas == null || consultas.isEmpty()) {
            return Collections.emptyList(); // Retorna uma lista vazia em vez de null
        }

        return consultas.stream()
                .map(Consulta::getHorario) // Corrigido para chamar o método corretamente
                .collect(Collectors.toList());
    }

}
