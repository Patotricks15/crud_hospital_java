import model.Paciente;
import service.PacienteService;

public class Main {
    public static void main(String[] args) {
        PacienteService service = new PacienteService();

        service.cadastrar(new Paciente(1L, "Maria", 30));
        
        System.err.println("Antes da alteração:");
        service.buscarPorId(1L).ifPresent(p -> {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
        });
        service.alterarNome(1L, "Maria Silva");
        service.alterarIdade(1L, 31);
        
        System.err.println("Depois da alteração:");
        service.buscarPorId(1L).ifPresent(p -> {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Idade: " + p.getIdade());
        });

        System.err.println("Probabilidade de câncer: " + String.format("%.2f", service.detectCancer(1L)));    }
}