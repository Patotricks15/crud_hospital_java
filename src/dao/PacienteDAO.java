package dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
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

    public void mudarNome(Long id, String novoNome) {
        buscarPorId(id).ifPresent(p -> p.setNome(novoNome));
    }

    public void mudarIdade(Long id, int novaIdade) {
        buscarPorId(id).ifPresent(p -> p.setIdade(novaIdade));
    }
    public Double detectCancer(Long id) {
        Random gerador = new Random();
        Double prob_cancer = gerador.nextDouble(1);
        return prob_cancer;
    }
}
