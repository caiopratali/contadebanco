package br.com.myindaia.conta;

public abstract class Conta {
	private double saldo;
	
	public void saca(double valor){
		this.saldo -= valor;		
	}
	
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public double getSaldo(){
		return this.saldo;
	}
	
	public abstract void atualiza(double taxaSelic);
}
