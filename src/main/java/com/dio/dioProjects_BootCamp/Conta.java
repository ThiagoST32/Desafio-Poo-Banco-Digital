package com.dio.dioProjects_BootCamp;

public abstract class Conta implements IConta {

    protected static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    private Cliente cliente;
    private Banco banco;

    public Conta(Cliente cliente, Banco banco) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.banco = banco;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }


    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void despositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.despositar(valor);
    }

    protected void ImprimirInformações() {
        System.out.println("Banco: " + this.banco.getNome());
        System.out.println(String.format("Titular: " + this.cliente.getNome()));
        System.out.println(String.format("Documento: " + this.cliente.getDocument()));
        System.out.println(String.format("Agencia: " + this.agencia));
        System.out.println(String.format("Numero Conta: " + this.numero));
        System.out.println(String.format("Saldo Conta: " + this.saldo));
    }

    protected void ImprimirClientes(){
        for (var clientes: banco.getContas()){
            System.out.println(clientes.getNome());
        }
    }
}
