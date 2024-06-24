package edu.kaique.collections.list.Pesquisa;

public class Livro {

    private String tituto, autor;
    private int anoPublicacao;

    public Livro(String tituto, String autor, int anoPublicacao) {
        this.tituto = tituto;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTituto() {
        return tituto;
    }

    public void setTituto(String tituto) {
        this.tituto = tituto;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "tituto='" + tituto + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }
}
