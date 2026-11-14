package com.senai.aula13compnuvemapi.Models;

public class Produto {

    //Atributos do produto

    private  int id;
    private  String nome;
    private double preco;
    private int quantidade;

    // Construtor

    public Produto(int id, String nome, int quantidade, double preco) {
        this.id = id;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    


    // Getters para pegar o id
    public int getId(){
        return id;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public double getPreco(){
        return  preco;
    }


    
}