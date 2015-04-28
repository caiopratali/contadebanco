package br.com.myindaia.conta;

public class GerenciadorDeImpostoDeRenda {
	private double total;
	
	public void adiciona(Tributavel t){
		System.out.println("Adicionando Tributavel" + t);
		
		this.total += t.calculaTributos();
	}
	
	public double getTotal(){
		return this.total;
	}
}
