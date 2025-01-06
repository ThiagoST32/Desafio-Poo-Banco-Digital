package com.dio.dioProjects_BootCamp;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    public String nome;
    private List<Cliente> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Cliente> getContas() {
        return contas;
    }

    public void setContas(List<Cliente> contas) {
        this.contas = contas;
    }

    public void adicionarCliente(Cliente cliente){
        this.contas.add(cliente);
    }

}
