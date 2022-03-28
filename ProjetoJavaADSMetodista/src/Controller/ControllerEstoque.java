package Controller;

import java.util.ArrayList;

import Model.ModelProduto;

public class ControllerEstoque {

	ArrayList<ModelProduto> estoque = new ArrayList<>();

	public void addProduto(int id, String name, int saldo) {

		estoque.add(new ModelProduto(id, name, saldo));

	}

	public void removeProduto(int number) {

		System.out.println("metódo para remover produto");

	}

	public void updateProduto() {

		System.out.println("metódo atualizar estoque");

	}

	public void mostrarEstoque() {

		for (ModelProduto produtos : estoque) {
			System.out.println("\n================================" + "\nid: " + produtos.getId() + "\nProduto: "
					+ produtos.getName() + "\nSaldo: " + produtos.getSaldo() + "\n================================");
		}

	}

}
