package com.dio.dioProjects_BootCamp;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Cliente velto = new Cliente();
        Cliente jesi = new Cliente();

        banco.setNome("Itau");
        velto.setNome("Velto");
        velto.setDocument("00223311");
        jesi.setNome("Jesi");
        jesi.setDocument("12345678");

        Conta cc = new ContaCorrente(velto, banco);
        Conta cp = new ContaPoupanca(jesi, banco);

        cc.despositar(100);
        cc.tranferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
        cc.imprimirClientes();


    }
}