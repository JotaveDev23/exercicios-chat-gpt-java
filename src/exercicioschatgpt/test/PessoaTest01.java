package exercicioschatgpt.test;

import exercicioschatgpt.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 23);

        pessoa.setIdade(22);

        pessoa.nomePessoa();
        pessoa.fazerAniversário();
    }
}
