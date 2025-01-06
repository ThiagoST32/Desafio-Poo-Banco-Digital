package com.dio.dioProjects_BootCamp;

public interface IConta {
     void sacar(double valor);
     void despositar(double valor);
     void tranferir(double valor, Conta contaDestino);
     void imprimirExtrato();
     void imprimirClientes();


}
