//Usando o recurso de operações de agregação, que aceitam expressões lambda como parâmetro,
// escreva um trecho de código para realizar cada uma das ações abaixo:
//        Exibir o nome das pessoas maiores de 18 anos
//        Exibir o email das mulheres maiores de 60 anos
//        Exibir a média de idade dos homens


import java.util.ArrayList;

public class AppPessoa {

    public static void main(String[] args) {

        ArrayList<Pessoa> lista = new ArrayList<>();

        Pessoa p1 = new Pessoa("Roberto", Pessoa.Genero.MASC, 43, "roberto@gmail.com");
        Pessoa p2 = new Pessoa ("Pedro", Pessoa.Genero.MASC, 20, "pedro@gmail.com");
        Pessoa p3 = new Pessoa ("Lucas", Pessoa.Genero.MASC, 19, "lucas@gmail.com");
        Pessoa p4 = new Pessoa ("Bernardo", Pessoa.Genero.MASC, 3, "bernardo@gmail.com");
        Pessoa p5 = new Pessoa ("Adriana", Pessoa.Genero.FEM, 18, "adriana@gmail.com");
        Pessoa p6 = new Pessoa ("Ana Maria", Pessoa.Genero.FEM, 73, "ana@gmail.com");
        Pessoa p7 = new Pessoa ("Gladir", Pessoa.Genero.FEM, 72, "gladir@gmail.com");

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);
        lista.add(p6);
        lista.add(p7);

        System.out.println("Todas as pessoas: " + lista);

        //Exibir o nome das pessoas maiores de 18 anos
        System.out.println("\nPessoas com mais de 18 anos");
        lista
                .stream()
                .filter(p -> p.getIdade() > 18)
                .forEach(p -> System.out.println(p));

        //Exibir o email das mulheres maiores de 60 anos
        System.out.println("\nemail das mulheres com mais de 60 anos");
        lista
                .stream()
                .filter(p -> p.getIdade() > 60)
                .filter(p -> p.getGenero()== Pessoa.Genero.FEM)
                .forEach(p-> System.out.println("Email: " + p.getEmail()));

//        Exibir a média de idade dos homens



    }

}
