package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Agencia;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		// Criando a agencia
		Agencia agenciaMestre = new Agencia();
		agenciaMestre.setNumero("4214-9");
		agenciaMestre.setNomeGerente("Marcos Marcado");
		agenciaMestre.setTelefone("(11)4002-8922");
		agenciaMestre.setCidade("Jandira-SP");

		// Criar a cliente Maria
		Cliente clienteMaria = new Cliente();
		clienteMaria.setNome("Maria Antonieta");
		clienteMaria.setEmail("mariaantonieta@gmail.com");
		clienteMaria.setSalario(2000);

		// Criação da conta da Maria
		Conta contaMaria = new Conta("7858-1");
		contaMaria.setCliente(clienteMaria);
		contaMaria.setAgencia(agenciaMestre);
		contaMaria.setTipo(TipoConta.CORRENTE);
		contaMaria.depositar(500);

		// Criaçaõ do cliente Pedro
		Cliente clientePedro = new Cliente();
		clientePedro.setNome("Pedro Pedroso");
		clientePedro.setEmail("pedropedroso@gmail.com");
		clientePedro.setSalario(2000);

		// Criação da conta do Pedro
		Conta contaPedro = new Conta("5963-2");
		contaPedro.setCliente(clientePedro);
		contaPedro.setAgencia(agenciaMestre);
		contaPedro.setTipo(TipoConta.CORRENTE);
		contaPedro.depositar(500);

		// Criação da cliente Ana
		Cliente clienteAna = new Cliente();
		clienteAna.setNome("Ana Banana");
		clienteAna.setEmail("anabanana@gmail.com");
		clienteAna.setSalario(2000);

		// Criação da conta da Ana
		Conta contaAna = new Conta("8532-6");
		contaAna.setCliente(clienteAna);
		contaAna.setAgencia(agenciaMestre);
		contaAna.setTipo(TipoConta.CORRENTE);
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

		// Tranferir 200 reais da conta da Maria para a conta do Pedro
		contaMaria.transferir(contaPedro, 200);
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();

	}

}