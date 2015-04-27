package br.com.myindaia.main;


import br.com.myindaia.conta.AtualizadorDeContas;
import br.com.myindaia.conta.Conta;
import br.com.myindaia.conta.ContaCorrente;
import br.com.myindaia.conta.ContaPoupanca;

public class Principal {
	public static void main(String[] args){
		Conta c = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.1);
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);
		adc.getSaldoTotal();
		
	}	
}
