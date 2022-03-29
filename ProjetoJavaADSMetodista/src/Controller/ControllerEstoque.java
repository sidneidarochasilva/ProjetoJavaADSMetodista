package Controller;

import java.util.ArrayList;

import Model.ModelProduto;

public class ControllerEstoque {

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
		System.out.println("atualizar nome");
	}

	public void adicionarSaldo() {

		System.out.println("metódo atualizar estoque");
	}

	public void removerSaldo(int id) {

		System.out.println("metódo remove estoque");
	}

	public void mostrarEstoque() {

		for (ModelProduto produtos : estoque) {
			System.out.println("\n================================" + "\nid: " + produtos.getId() + "\nProduto: "
					+ produtos.getName() + "\nSaldo: " + produtos.getSaldo() + "\n================================");
		}

	}

}
