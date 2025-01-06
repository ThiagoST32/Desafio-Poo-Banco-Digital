package com.dio.dioProjects_BootCamp;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente, Banco banco) {
        super(cliente, banco);
        banco.adicionarCliente(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato conta poupança ===");
        ImprimirInformações();
    }

    @Override
    public void imprimirClientes() {
        System.out.println("=== Imprimindo Clientes ===");
        ImprimirClientes();
    }

}
