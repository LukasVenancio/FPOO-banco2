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
		System.out.printf("N�mero: %s\n", numero);
		System.out.printf("Ag�ncia: %s\n", numeroAgencia);
		System.out.printf("Saldo: %s\n", saldo);
	}

}
