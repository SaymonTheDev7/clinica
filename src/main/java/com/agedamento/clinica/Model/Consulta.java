package com.agedamento.clinica.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "consultas")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "medico_id", nullable = false)
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;

    @Column(nullable = false)
    private LocalDateTime horario;

    @Column(nullable = false)
    private boolean cancelada = false;

    // Construtor padrão exigido pelo JPA
    public Consulta() {}

    // Construtor correto para inicializar os atributos
    public Consulta(Medico medico, Paciente paciente, LocalDateTime horario) {
        this.medico = medico;
        this.paciente = paciente;
        this.horario = horario;
        this.cancelada = false; // Inicializado como falso por padrão
    }

    public Consulta(Object o, Long pacienteId, Long medicoId, LocalDateTime dataHora) {
    }
}
