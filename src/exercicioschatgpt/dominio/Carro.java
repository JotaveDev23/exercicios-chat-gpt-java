package exercicioschatgpt.dominio;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo){ //criei um construtor aqui dentro
        this.marca = marca;
        this.modelo = modelo;

    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return this.ano;
    }

    public void imprimirCarros (){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
}
