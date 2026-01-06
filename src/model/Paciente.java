package model;

public class Paciente {
    private Long id;
    private String nome;
    private int idade;

    public Paciente(Long id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
}
