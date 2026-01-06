package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import model.Paciente;

public class PacienteDAO {

    private final List<Paciente> pacientes = new ArrayList<>();

    public void salvar(Paciente paciente) {
        pacientes.add(paciente);
    }

    public List<Paciente> listar() {
        return pacientes;
    }

    public Optional<Paciente> buscarPorId(Long id) {
        return pacientes.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    public void atualizar(Paciente pacienteAtualizado) {
        buscarPorId(pacienteAtualizado.getId()).ifPresent(p -> {
        });
    }

    public void deletar(Long id) {
        pacientes.removeIf(p -> p.getId().equals(id));
    }
}
