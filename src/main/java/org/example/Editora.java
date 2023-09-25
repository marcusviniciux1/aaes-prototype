package org.example;

public class Editora implements Cloneable {
    private String nome;
    private String telefone;

    public Editora(String nome, String telefone) {
        super();
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Editora{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}