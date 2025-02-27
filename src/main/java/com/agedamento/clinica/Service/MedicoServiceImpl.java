package com.agedamento.clinica.Service;

import com.agedamento.clinica.Model.Medico;
import com.agedamento.clinica.Repository.MedicoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MedicoServiceImpl implements MedicoService {
    private final MedicoRepository medicoRepository;

    public MedicoServiceImpl(MedicoRepository medicoRepository) {
        this.medicoRepository = medicoRepository;
    }

    @Override
    public Medico cadastrarMedico(Medico medico) {
        return medicoRepository.save(medico);
    }

    @Override
    public Optional<Medico> buscarMedico(Long id) {
        return medicoRepository.findById(id);
    }

    @Override
    public List<Medico> listarMedicos() {
        return medicoRepository.findAll();
    }

    @Override
    public Medico atualizarMedico(Long id, Medico medico) {
        if (medicoRepository.existsById(id)) {
            medico.setId(id);
            return medicoRepository.save(medico);
        }
        throw new RuntimeException("Médico não encontrado");
    }
}
