package br.com.myindaia.conta;

public class ContaPoupanca extends Conta {

	private double saldo;
	
	public void atualiza(double taxa) {
		this.saldo = this.saldo * taxa * 3;
	}
}
