package org.example;

public class Livro implements Cloneable {
    private String titulo;
    private String autor;
    private Editora editora;
    private int ano;

    public Livro(String titulo, String autor, Editora editora, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public Livro clone() throws CloneNotSupportedException {
        Livro livroClone = (Livro) super.clone();
        livroClone.editora = (Editora) livroClone.editora.clone();
        return livroClone;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", editora=" + editora +
                ", ano=" + ano +
                '}';
    }
}