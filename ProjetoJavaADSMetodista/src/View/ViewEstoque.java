package View;

import java.util.Scanner;

import Controller.ControllerEstoque;

public class ViewEstoque {

	public static void main(String[] args) {

		ControllerEstoque produto = new ControllerEstoque();
		

		Scanner lerDados = new Scanner(System.in);

		int id;
		String name;
		int saldo;

		System.out.printf("Cadastre um id para o produto");
		id = lerDados.nextInt();

		System.out.printf("Qual o nome do produto");
		name = lerDados.next();

		System.out.printf("Informe a quantidade que será estocada");
		saldo = lerDados.nextInt();

		produto.addProduto(id, name, saldo);

		produto.mostrarEstoque();

		System.out.printf("Cadastre um id para o produto");
		id = lerDados.nextInt();

		System.out.printf("Qual o nome do produto");
		name = lerDados.next();

		System.out.printf("Informe a quantidade que será estocada");
		saldo = lerDados.nextInt();
		
		produto.addProduto(id, name, saldo);
		
		produto.mostrarEstoque();

	}

}
