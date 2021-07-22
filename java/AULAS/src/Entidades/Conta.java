package Entidades;

public class Conta {
	private int numero;
	private String nomeCliente;
	private double saldo;
	public Conta(int numero, String nomeCliente) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	public void credito(double valorCredito) {
		this.saldo = this.saldo + valorCredito;
	}
	public void debito(double valorDebito) {
		this.saldo = this.saldo - valorDebito;
	}
}