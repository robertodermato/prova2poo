//Usando o recurso de operações de agregação, que aceitam expressões lambda como parâmetro,
// escreva um trecho de código para realizar cada uma das ações abaixo:
//        Exibir o nome das pessoas maiores de 18 anos
//        Exibir o email das mulheres maiores de 60 anos
//        Exibir a média de idade dos homens


import java.util.ArrayList;

public class AppPessoa {

    public static void main(String[] args) {

        ArrayList<Pessoa> lista = new ArrayList<>();

        Pessoa p1 = new Pessoa("Roberto", Pessoa.Genero.MASC, 43);
        Pessoa p2 = new Pessoa ("Pedro", Pessoa.Genero.MASC, 20);
        Pessoa p3 = new Pessoa ("Lucas", Pessoa.Genero.MASC, 19);
        Pessoa p4 = new Pessoa ("Bernardo", Pessoa.Genero.MASC, 3);
        Pessoa p5 = new Pessoa ("Adriana", Pessoa.Genero.FEM, 18);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        lista.add(p5);

        System.out.println("Todas as pessoas: " + lista);

        System.out.println("Pessoas com mais de 18 anos");
        //Exibir o nome das pessoas maiores de 18 anos
        lista
                .stream()
                .filter(p -> p.getIdade() > 18)
                .forEach(p -> System.out.println(p));



    }

}
