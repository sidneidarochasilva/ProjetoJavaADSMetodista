package Controller;

import java.util.ArrayList;

import Model.ModelProduto;

public class ControllerEstoque {
//Teste Sincronia
	ArrayList<ModelProduto> estoque = new ArrayList<>();

	public void addProduto(int id, String name, int saldo) {

		estoque.add(new ModelProduto(id, name, saldo));

	}

	public void removeProduto(int id) {

		estoque.removeIf(estoque -> estoque.getId() == id);

		for (ModelProduto produtos : estoque) {
			System.out.println("\nESTOQUE ATUAL" + "\n================================" + "\nid: " + produtos.getId()
					+ "\nProduto: " + produtos.getName() + "\nSaldo: " + produtos.getSaldo()
					+ "\n================================");
		}

	}

	public void renomear() {
		System.out.println("atualizar");
	}

	public void adicionarSaldo(int id, int saldo) {

		if (estoque.size() == 0) {
			System.out.println("Não existe produtos cadastrados!");
		} else {
			System.out.println("Produto não localizado tente novamente");
		}

		for (ModelProduto produtos : estoque) {
			if (produtos.getId() == id) {

				int newSaldo = produtos.getSaldo() + saldo;

				produtos.setSaldo(newSaldo);
				System.out.println("\n================================" + "\nSaldo atual" + "\nid: " + produtos.getId()
						+ "\nProduto: " + produtos.getName() + "\nSaldo: " + produtos.getSaldo()
						+ "\n================================");

			}

		}

	}

	public void removerSaldo(int id, int saldo) {

		if (estoque.size() == 0) {
			System.out.println("Não existe produtos cadastrados!");
		} else {
			System.out.println("Produto não localizado tente novamente");
		}

		for (ModelProduto produtos : estoque) {
			if (produtos.getId() == id) {

				int newSaldo = produtos.getSaldo() - saldo;

				produtos.setSaldo(newSaldo);
				System.out.println("\n================================" + "\nSaldo atual" + "\nid: " + produtos.getId()
						+ "\nProduto: " + produtos.getName() + "\nSaldo: " + produtos.getSaldo()
						+ "\n================================");

			}

		}
	}

	public void mostrarEstoque() {

		for (ModelProduto produtos : estoque) {
			System.out.println("\n================================" + "\nid: " + produtos.getId() + "\nProduto: "
					+ produtos.getName() + "\nSaldo: " + produtos.getSaldo() + "\n================================");
		}

	}

}
