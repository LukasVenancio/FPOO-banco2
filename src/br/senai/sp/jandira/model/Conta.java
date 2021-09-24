package br.senai.sp.jandira.model;

public class Conta {
	
	public String tipo;
	public String numero;
	public String numeroAgencia;
	public String titular;
	public double saldo;
	
	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
	}
	
	public void sacar(double valorSaque) {
		saldo -= valorSaque;
	}
	
	public void transferir() {
	}
	
	public void exibirDetalhes() {
		System.out.println();
		System.out.println("------------------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", numeroAgencia);
		System.out.printf("Saldo: %s\n", saldo);
	}

}
