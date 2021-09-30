package br.senai.sp.jandira.app;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		// Criação da conta da Maria
		Conta contaMaria = new Conta("7858-1");
		contaMaria.titular = "Maria Antonieta";
		contaMaria.numeroAgencia = "4214-9";
		contaMaria.tipo = "Corrente";
		contaMaria.depositar(500);

		// Criação da conta do Pedro
		Conta contaPedro = new Conta("5963-2");
		contaPedro.titular = "Pedro Pedroso";
		contaPedro.numeroAgencia = "4214-9";
		contaPedro.tipo = "Corrente";
		contaPedro.depositar(500);

		// Criação da conta da Ana
		Conta contaAna = new Conta("8532-6");
		contaAna.titular = "Ana Banana";
		contaAna.numeroAgencia = "4214-9";
		contaAna.tipo = "Corrente";
		contaAna.depositar(500);

		// Exibindo os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();
		System.out.println("========================================");

		// Depositar 100 reais na conta da Maria
		contaMaria.depositar(100);
		contaMaria.exibirDetalhes();
		System.out.println("========================================");

		// Sacando 100 reais da conta da Maria
		contaMaria.sacar(100);
		contaMaria.exibirDetalhes();
		System.out.println("========================================");

		//Tranferir 200 reais da conta da Maria para a conta do Pedro
		contaMaria.transferir(contaPedro, 200);
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
	}

}
