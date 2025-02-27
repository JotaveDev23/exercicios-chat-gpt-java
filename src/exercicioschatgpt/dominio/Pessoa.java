package exercicioschatgpt.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = 3;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    public int getIdade(){
        return this.idade;
    }

    public String nomePessoa(){
        System.out.println("Nome: " + this.nome);
        return " ";
    }

    public int fazerAniversário () {
        if (this.idade < 0){
            System.out.println("Idade Inválida");
    } else {
            System.out.println("Idade: " + this.idade);
            ++this.idade;
            System.out.println("A nova idade da pessoa no ano que vem é: " + this.idade);
        }
        return 0;
    }
}
