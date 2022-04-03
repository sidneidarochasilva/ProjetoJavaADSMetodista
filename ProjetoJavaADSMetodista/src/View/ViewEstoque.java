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

			System.out.println("\n===== CONTROLE DE ESTOQUE =====");
			System.out.println("\nDigite a opção desejada");
			System.out.println("1 - Novo Produto");
			System.out.println("2 - Consulta Estoque");
			System.out.println("3 - Adicionar Saldo");
			System.out.println("4 - Remover Saldo");
			System.out.println("5 - Renomear");
			System.out.println("6 - Remover Produto");
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
				System.out.println("Informe o id do produto que deseja remover saldo:");
				id = lerDados.nextInt();

				System.out.println("Qual quantidade que deseja remover:");
				saldo = lerDados.nextInt();

				produto.removerSaldo(id, saldo);
				break;

			case 5:
				System.out.println("Informe o id do produto a ser renomeado:");
				id = lerDados.nextInt();
				System.out.println("Digite o novo nome para o produto com id: " + id);
				name = lerDados.next();

				produto.renomear(id, name);

				break;

			case 6:
				System.out.println("Informe o id do produto a ser removido");
				id = lerDados.nextInt();

				produto.removeProduto(id);

			default:
				System.out.println("Aplica��o encerrada");

			}

		} while (opc <= 4);

		// System.out.printf("REMOVA UM PRODUTO POR ID");
		// id = lerDados.nextInt();
		// produto.removeProduto(id);
		lerDados.close();
	}

}
