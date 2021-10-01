package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {

	private TipoConta tipo;
	private String numero;
	private String numeroAgencia;
	public Cliente titular;
	private double saldo;

	public Conta(String mumeroConta) {
		numero = mumeroConta;
	}

	public void setTipo(TipoConta tipo) {
		this.tipo = tipo;
	}
	
	public TipoConta getTipo() {
		return tipo;
	}
	
	public void setNumeroAgencia(String numeroAgencia) {
		this.numeroAgencia = numeroAgencia;
		
	}
	
	public String getNumeroAgencia() {
		return numeroAgencia;
	}

	public void depositar(double valorDeposito) {

		if (valorDeposito > 0) {
			saldo += valorDeposito;
		} else {
			System.out.println("O valor do deposito precisa ser positivo!");
		}
	}

	public boolean sacar(double valorSaque) {

		if (valorSaque <= saldo) {
			if (valorSaque > 0) {
				saldo -= valorSaque;
				return true;
			} else {
				System.out.println("O valor do deposito precisa ser positivo!");
				return false;
			}
		} else {
			System.out.println("O valor do saque é maior do que o valor do saldo,\nnão foi possível realizar o saque!");
			return false;
		}
	}

	public void transferir(Conta contaDestino, double valorTransferencia) {

		boolean resultado = sacar(valorTransferencia);

		if (resultado) {
			contaDestino.depositar(valorTransferencia);
		} else {
			System.out.println("Não foi possível efetuar a tranferência");
		}
	}

	public void exibirDetalhes() {
		System.out.println();
		System.out.println("------------------------------");
		System.out.printf("Titular: %s\n", titular);
		System.out.printf("Número: %s\n", numero);
		System.out.printf("Agência: %s\n", numeroAgencia);
		System.out.printf("Saldo: %s\n", saldo);
		System.out.printf("Tipo da conta: %s\n", tipo);
		
	}

}
