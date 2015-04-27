package br.com.myindaia.conta;

public class ContaCorrente extends Conta {
	
	private double saldo;
	
	public void deposita(double valor){
		this.saldo += valor - 0.10;
	}
	
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}
}
