package br.com.myindaia.conta;

public class Conta {
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
	
	public void atualiza(double taxa){
		this.saldo += this.saldo * taxa;
	}
}
