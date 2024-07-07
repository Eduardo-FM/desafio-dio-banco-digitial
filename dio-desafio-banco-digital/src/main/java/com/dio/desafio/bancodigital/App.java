package com.dio.desafio.bancodigital;

import com.dio.desafio.bancodigital.objetos.Cliente;
import com.dio.desafio.bancodigital.objetos.Conta;
import com.dio.desafio.bancodigital.objetos.ContaCorrente;
import com.dio.desafio.bancodigital.objetos.ContaPoupanca;


public class App 
{
    public static void main( String[] args )
    {
        Cliente venilton = new Cliente();
        venilton.setNome("Venilton");

        Conta cc = new ContaCorrente(venilton);
        Conta poupanca = new ContaPoupanca(venilton);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
