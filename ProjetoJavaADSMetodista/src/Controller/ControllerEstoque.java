package Controller;

import Model.ModelProduto;

public class ControllerEstoque {

	ModelProduto produto = new ModelProduto();

	public void addProduto(int number) {

		System.out.println("met�do para adicionar produto");
	}

	public void removeProduto(int number) {

		System.out.println("met�do para remover produto");

	}

	public void updateProduto() {

		System.out.println("met�do atualizar estoque");

	}

	public void mostrarEstoque() {

		System.out.println("met�do mostrar estoque atual");

	}

	public void addNovoProduto(Object newProduto) {

		System.out.println("met�do mostrar estoque atual");

	}

}
