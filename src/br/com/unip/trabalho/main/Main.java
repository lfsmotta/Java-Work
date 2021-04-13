package br.com.unip.trabalho.main;

import br.com.unip.trabalho.entidades.Administrador;
import br.com.unip.trabalho.entidades.Fornecedor;
import br.com.unip.trabalho.entidades.Operario;
import br.com.unip.trabalho.entidades.Vendedor;

public class Main {

	public static void main(String[] args) {
		
		Fornecedor fornecedor1 = new Fornecedor("Jose Paulo", "Rua Pamonha, 89", "39025691", 500.0, 250.0);
		Fornecedor fornecedor2 = new Fornecedor("Josefa Paulo", "Rua Cocada, 98", "40028922", 630.0, 400.0);
		
		Administrador administrador1 = new Administrador("Adm ta On", "Rua macaco, 56", "25647982", 256, 1250.0, 0.1, 400.0);
		Administrador administrador2 = new Administrador("Adm ta off", "Rua Feijão, 24", "36251498", 987, 1250.0, 0.1, 800.0);
		
		Operario operario1 = new Operario("Nelsinho", "Rua Junin, 45", "78945616", 256, 900.0, 0.1, 300.0, 0.2);
		Operario operario2 = new Operario("Junin", "Rua Nelsinho, 54", "26542354", 852, 900.0, 0.1, 100.0, 0.2);
		
		Vendedor vendedor1 = new Vendedor("Erik", "Rua Helicoptero, 12", "35731591", 456, 1000.0, 0.1, 600.0, 0.2);
		Vendedor vendedor2 = new Vendedor("Erika", "Rua Avião, 21", "89562154", 654, 1000.0, 0.1, 800.0, 0.2);
		
		System.out.println("Saldo Fornecedor 1: R$ " + fornecedor1.obterSaldo());
		System.out.println("Saldo Fornecedor 1: R$ " + fornecedor2.obterSaldo());
		System.out.println();
		
		System.out.println("Saldo Administrador 1: R$ " + administrador1.calcularSalario());
		System.out.println("Saldo Administrador 2: R$ " + administrador2.calcularSalario());
		
		System.out.println("Saldo Operario 1: R$ " + operario1.calcularSalario());
		System.out.println("Saldo Operario 2: R$ " + operario2.calcularSalario());
		
		System.out.println("Saldo Vendedor 1: R$ " + vendedor1.calcularSalario());
		System.out.println("Saldo Vendedor 2: R$ " + vendedor2.calcularSalario());
		System.out.println();
	}

}
