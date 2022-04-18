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

	public void renomear(int id, String name) {

		if (estoque.size() == 0) {
			System.out.println("N�o existe produtos cadastrados!");
		} else {
			System.out.println("Produto n�o localizado tente novamente");
		}

		for (ModelProduto produtos : estoque) {
			if (produtos.getId() == id) {

				produtos.setName(name);

				System.out.println("\n================================" + "\nSaldo atual" + "\nid: " + produtos.getId()
						+ "\nProduto: " + produtos.getName() + "\nSaldo: " + produtos.getSaldo()
						+ "\n================================");

			}

		}
	}

	public void adicionarSaldo(int id, int saldo) {

		if (estoque.size() == 0) {
			System.out.println("N�o existe produtos cadastrados!");
		} else {
			System.out.println("Produto n�o localizado tente novamente");
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
		if (estoque.size() == 0) {
			System.out.println("N�o existe produtos cadastrados!");
		} else {
			System.out.println("\n================================" + " \n|| ESTOQUE ATUAL || "
					+ "\n================================");
			for (ModelProduto produtos : estoque) {
				System.out.println("\n================================" + "\nid: " + produtos.getId() + "\nProduto: "
						+ produtos.getName() + "\nSaldo: " + produtos.getSaldo());
			}
		}

	}
        
        public void Encerrar(){
        
            System.runFinalization();
            
            
        }

}
