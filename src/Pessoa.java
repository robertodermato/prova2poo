import java.time.LocalDate;

public class Pessoa {
    public enum Genero {
        MASC, FEM
    }
    String nome;
    Genero genero;
    int idade;
    String email;

    public Pessoa(String nome, Genero genero, int idade, String email) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.email = email;
            }

    public int getIdade() { return idade; }
    public String getNome() { return nome; }
    public String getEmail() {return email;}
    public Genero getGenero() {return genero;}

    @Override
    public String toString() {
        return nome +   ", " + genero + ", " + idade + " anos.";
    }
}
