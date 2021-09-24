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

}
