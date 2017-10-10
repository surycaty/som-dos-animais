package com.surycaty.somdosanimais.entidade;

/**
 * Created by negus on 08/10/17.
 */

public class Animal {

    private String nome;

    private int idSom;

    private int idImagem;

    public Animal(String nome, int idSom, int idImagem) {
        this.nome = nome;
        this.idSom = idSom;
        this.idImagem = idImagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdSom() {
        return idSom;
    }

    public void setIdSom(int idSom) {
        this.idSom = idSom;
    }

    public int getIdImagem() {
        return idImagem;
    }

    public void setIdImagem(int idImagem) {
        this.idImagem = idImagem;
    }
}
