package br.com.unip.trabalho.entidades;

public class Empregado extends Pessoa{
	
		private Integer codigoSetor;		
// Salario Minimo 1.045	
		
		private Double salarioBase;	
		
		private Double imposto;
		
		
		
		public Empregado() {
		}

		public Empregado(String nome, String endereco, String telefone, Integer codigoSetor, Double salarioBase,
				Double imposto) {
			super(nome, endereco, telefone);
			this.codigoSetor = codigoSetor;
			this.salarioBase = salarioBase;
			this.imposto = imposto;
		}

		public Integer getCodigoSetor() {
			return codigoSetor;
		}

		public void setCodigoSetor(Integer codigoSetor) {
			this.codigoSetor = codigoSetor;
		}

		public Double getSalarioBase() {
			return salarioBase;
		}

		public void setSalarioBase(Double salarioBase) {
			this.salarioBase = salarioBase;
		}

		public Double getImposto() {
			return imposto;
		}

		public void setImposto(Double imposto) {
			this.imposto = imposto;
		}
		
		
		public Double calcularSalario() {
			Double salario = this.salarioBase - (this.salarioBase * this.imposto);
			return salario;
		}
}
