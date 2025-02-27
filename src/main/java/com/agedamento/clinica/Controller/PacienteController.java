package com.agedamento.clinica.Controller;

import com.agedamento.clinica.Model.Paciente;
import com.agedamento.clinica.Service.PacienteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

    @Autowired
    private PacienteServiceImpl pacienteService;

    @PostMapping
    public Paciente cadastrarPaciente(@RequestBody Paciente paciente) {
        return pacienteService.cadastrarPaciente(paciente);
    }

    @GetMapping("/{id}")
    public Optional<Paciente> buscarPaciente(@PathVariable Long id) {
        return pacienteService.buscarPaciente(id);
    }

    @GetMapping
    public List<Paciente> listarPacientes() {
        return pacienteService.listarPacientes();
    }

    @PutMapping("/{id}")
    public Paciente atualizarPaciente(@PathVariable Long id, @RequestBody Paciente paciente) {
        return pacienteService.atualizarPaciente(id, paciente);
    }
}
