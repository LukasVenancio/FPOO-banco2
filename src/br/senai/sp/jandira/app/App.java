package br.senai.sp.jandira.app;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		Conta contaMaria = new Conta();
		contaMaria.titular = "Maria Antonieta";
		contaMaria.numero = "7858-1";
		contaMaria.numeroAgencia = "4214-9";
		contaMaria.tipo = "Corrente";
		contaMaria.saldo = 500;
		
		System.out.println(contaMaria);
		
		Conta teste = new Conta();
		
		System.out.println(teste);
		
		
	}

}
