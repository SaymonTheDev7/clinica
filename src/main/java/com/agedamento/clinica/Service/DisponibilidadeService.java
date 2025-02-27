package com.agedamento.clinica.Service;

import java.time.LocalDateTime;
import java.util.List;

public interface DisponibilidadeService {
    List<LocalDateTime> verificarDisponibilidade(Long medicoId);
}
