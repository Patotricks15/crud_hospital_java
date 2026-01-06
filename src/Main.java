import model.Paciente;
import service.PacienteService;

public class Main {
    public static void main(String[] args) {
        PacienteService service = new PacienteService();
        service.cadastrar(new Paciente(1L, "Maria", 30));
        System.out.println("Pacientes cadastrados: " + service.listar().size());
    }
}
