package br.com.unip.trabalho.entidades;

public class Fornecedor extends Pessoa{
	
	private Double valorCredito;
	private Double valorDivida;
	
	
	
	public Fornecedor() {
	}

	public Fornecedor(String nome, String endereco, String telefone, Double valorCredito, Double valorDivida) {
		super(nome, endereco, telefone);
		this.valorCredito = valorCredito;
		this.valorDivida = valorDivida;
	}

	public Double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(Double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public Double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(Double valorDivida) {
		this.valorDivida = valorDivida;
	}

	public Double obterSaldo() {
		return this.valorCredito - this.valorDivida;
		
	}

}
