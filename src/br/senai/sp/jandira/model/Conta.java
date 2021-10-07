package br.senai.sp.jandira.model;

import br.senai.sp.jandira.lista.TipoConta;

public class Conta {

	private TipoConta tipo;
	private String numero;
	private Agencia agencia;
	private Cliente cliente;
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

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
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
			System.out.println("O valor do saque � maior do que o valor do saldo,\nn�o foi poss�vel realizar o saque!");
			return false;
		}
	}

	public void transferir(Conta contaDestino, double valorTransferencia) {

		boolean resultado = sacar(valorTransferencia);

		if (resultado) {
			contaDestino.depositar(valorTransferencia);
		} else {
			System.out.println("N�o foi poss�vel efetuar a tranfer�ncia");
		}
	}

	public void exibirDetalhes() {
		System.out.println();
		System.out.println("------------------------------");
		System.out.printf("Titular: %s\n", cliente.getNome());
		System.out.printf("N�mero: %s\n", numero);
		System.out.printf("Ag�ncia: %s\n", agencia.getNumero());
		System.out.printf("Saldo: %s\n", saldo);
		System.out.printf("Tipo da conta: %s\n", tipo);

	}

}
