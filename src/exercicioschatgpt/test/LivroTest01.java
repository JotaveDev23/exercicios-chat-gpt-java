package exercicioschatgpt.test;

import exercicioschatgpt.dominio.Livro;

public class LivroTest01 {
    public static void main(String[] args) {
        Livro livro = new Livro("Marcola", "João", 23);
        Livro livro1 = new Livro("Pedra Duras", "Joçado");

        livro.exibirDetalhe();
        System.out.println("\n");
        livro1.exibirDetalhe();
    }
}
