package com.agedamento.clinica.Controller;

import com.agedamento.clinica.Model.Medico;
import com.agedamento.clinica.Service.MedicoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @Autowired
    private MedicoServiceImpl medicoService;

    @PostMapping
    public Medico cadastrarMedico(@RequestBody Medico medico) {
        return medicoService.cadastrarMedico(medico);
    }

    @GetMapping("/{id}")
    public Optional<Medico> buscarMedico(@PathVariable Long id) {
        return medicoService.buscarMedico(id);
    }

    @GetMapping
    public List<Medico> listarMedicos() {
        return medicoService.listarMedicos();
    }

    @PutMapping("/{id}")
    public Medico atualizarMedico(@PathVariable Long id, @RequestBody Medico medico) {
        return medicoService.atualizarMedico(id, medico);
    }
}
