package exercicioschatgpt.dominio;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, String autor, int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    public Livro(String titulo, String autor){
        this(titulo, autor, 100);

    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setNumeroPaginas(int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }
    public int getNumeroPaginas(){
        return this.numeroPaginas;
    }

    public String exibirDetalhe(){
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;

        System.out.println("Livro: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        if (numeroPaginas > 0) {
            System.out.println("Páginas: " + this.numeroPaginas);
        }else {
            System.out.println("! Páginas inexistentes !");
        }

        return " ";
    }
}
