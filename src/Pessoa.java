import java.time.LocalDate;

public class Pessoa {
    public enum Genero {
        MASC, FEM
    }
    String nome;
    Genero genero;
    int idade;

    public Pessoa(String nome, Genero genero, int idade) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
            }

    public int getIdade() { return idade; }
    public String getNome() { return nome; }

    @Override
    public String toString() {
        return nome +   ", " + genero + ", " + idade + " anos.";
    }
}
