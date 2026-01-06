package service;

import dao.PacienteDAO;
import java.util.List;
import model.Paciente;

public class PacienteService {

    private final PacienteDAO dao = new PacienteDAO();

    public void cadastrar(Paciente paciente) {
        if (paciente.getIdade() < 0) {
            throw new IllegalArgumentException("Idade inválida");
        }
        dao.salvar(paciente);
    }

    public List<Paciente> listar() {
        return dao.listar();
    }

    public void atualizar(Paciente paciente) {
        dao.atualizar(paciente);
    }

    public void remover(Long id) {
        dao.deletar(id);
    }
}
