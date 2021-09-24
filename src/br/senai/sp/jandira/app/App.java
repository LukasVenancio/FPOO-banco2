package br.senai.sp.jandira.app;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		//Criação da conta da Maria
		Conta contaMaria = new Conta();
		contaMaria.titular = "Maria Antonieta";
		contaMaria.numero = "7858-1";
		contaMaria.numeroAgencia = "4214-9";
		contaMaria.tipo = "Corrente";
		contaMaria.saldo = 500.00;
		
		//Criação da conta do Pedro
		Conta contaPedro = new Conta();
		contaPedro.titular = "Pedro Pedroso";
		contaPedro.numero = "5963-2";
		contaPedro.numeroAgencia = "4214-9";
		contaPedro.tipo = "Corrente";
		contaPedro.saldo = 500.00;
		
		//Criação da conta da Ana 
		Conta contaAna = new Conta();
		contaAna.titular = "Ana Banana";
		contaAna.numero = "8532-6";
		contaAna.numeroAgencia = "4214-9";
		contaAna.tipo = "Corrente";
		contaAna.saldo = 500.00;
		
		//Exibindo os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		
	}

}
