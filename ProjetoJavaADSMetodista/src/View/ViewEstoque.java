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
		int opc = 0;

		do {

			System.out.println("\ndigite a opção desejada");
			opc = lerDados.nextInt();

			switch (opc) {
			case 1:
				System.out.println("Cadastre um id para o produto");
				id = lerDados.nextInt();

				System.out.println("Qual o nome do produto");
				name = lerDados.next();

				System.out.println("Informe a quantidade que ser" + " estocada");
				saldo = lerDados.nextInt();

				produto.addProduto(id, name, saldo);

				System.out.println("Produto cadastrado com Sucesso!!!");
				break;

			case 2:
				produto.mostrarEstoque();

				break;

			case 3:
				System.out.println("informe o id do produto que deseja adicionar saldo:");
				id = lerDados.nextInt();

				System.out.println("qual a quantidade que deseja adicionar:");
				saldo = lerDados.nextInt();

				produto.adicionarSaldo(id, saldo);

				break;

			case 4:
				System.out.println("Informe o id do produto a ser" + " renomeado:");
				break;

			default:
				System.out.println("Aplicação encerrada");

			}

		} while (opc <= 4);

		// System.out.printf("REMOVA UM PRODUTO POR ID");
		// id = lerDados.nextInt();
		// produto.removeProduto(id);
		lerDados.close();
	}

}
