package aplicacao;

import java.util.Scanner;

import Entidades.Conta;

public class TestBank {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		double valor;
		String nome;
		int numero;
		
		System.out.println("Digite o nome do cliente: ");
		nome = read.next();
		System.out.println("Digite o número da conta: ");
		numero = read.nextInt();
		
		Conta clil = new Conta(numero,nome);
		
		System.out.println("Cliente :"+clil.getNomeCliente());
		System.out.println("Saldo atual: R$"+clil.getSaldo());
		System.out.println("Digite o valor do Crédito :");
		valor = read.nextDouble();
		clil.credito(valor);
		System.out.println("Saldo atual crédito: R$"+clil.getSaldo());
		clil.debito(valor);
		System.out.println("Saldo atual débito: R$"+clil.getSaldo());
	}

}
