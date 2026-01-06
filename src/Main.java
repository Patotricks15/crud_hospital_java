import model.Paciente;
import service.PacienteService;

public class Main {
    public static void main(String[] args) {
        PacienteService service = new PacienteService();

        // 1. Cadastrar
        service.cadastrar(new Paciente(1L, "Maria", 30));

        service.buscarPorId(1L).ifPresent(p -> {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
        });
        // 2. Usar os novos métodos
        service.alterarNome(1L, "Maria Silva");
        service.alterarIdade(1L, 31);

        // 3. Conferir a mudança
        service.buscarPorId(1L).ifPresent(p -> {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
        });
    }
}