package br.com.unip.trabalho.entidades;

public class Administrador extends Empregado {

	private Double ajudaDeCusto;
	
	public Administrador() {
	}

	public Administrador(String nome, String endereco, String telefone, Integer codigoSetor, Double salarioBase,
			Double imposto, Double ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public Double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(Double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}
	 
	public Double calcularSalario() {
		Double salario = getSalarioBase() + this.ajudaDeCusto - (getSalarioBase() * getImposto());
			return salario;
	}
}
