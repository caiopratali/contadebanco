package br.com.myindaia.main;

import br.com.myindaia.conta.ContaCorrente;
import br.com.myindaia.conta.Tributavel;

public class TestaTributavel {
	
	public static void main(String[] args){
		
		ContaCorrente cc = new ContaCorrente();
		cc.deposita(100);
		System.out.println(cc.calculaTributos());
		
		Tributavel t = cc;
		System.out.println(t.calculaTributos());
		
	}
}
 