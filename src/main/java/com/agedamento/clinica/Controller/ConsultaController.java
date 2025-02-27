package com.agedamento.clinica.Controller;

import com.agedamento.clinica.Model.Consulta;
import com.agedamento.clinica.Service.ConsultaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/consultas")
public class ConsultaController {
    private final ConsultaService consultaService;

    public ConsultaController(ConsultaService consultaService) {
        this.consultaService = consultaService;
    }

    @PostMapping("/agendar")
    public ResponseEntity<Consulta> agendarConsulta(@RequestParam Long pacienteId, @RequestParam Long medicoId, @RequestParam LocalDateTime dataHora) {
        Consulta consulta = consultaService.agendarConsulta(pacienteId, medicoId, dataHora);
        return ResponseEntity.ok(consulta);
    }

    @DeleteMapping("/cancelar/{id}")
    public ResponseEntity<Void> cancelarConsulta(@PathVariable Long id) {
        consultaService.cancelarConsulta(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Consulta>> listarConsultas() {
        List<Consulta> consultas = consultaService.listarConsultas();
        return ResponseEntity.ok(consultas);
    }
}
