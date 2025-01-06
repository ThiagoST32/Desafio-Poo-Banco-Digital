package com.dio.dioProjects_BootCamp;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente, Banco banco) {
        super(cliente, banco);
        banco.adicionarCliente(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("=== Extrato conta corrente ===");
        ImprimirInformações();
    }

    @Override
    public void imprimirClientes() {
        System.out.println("=== Imprimindo Clientes ===");
        ImprimirClientes();
    }


}
