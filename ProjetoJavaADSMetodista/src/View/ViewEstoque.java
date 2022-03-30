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
                
                switch(opc){
                    case 1:
                        System.out.printf("Cadastre um id para o produto");
                        id = lerDados.nextInt();

                        System.out.printf("Qual o nome do produto");
                        name = lerDados.next();

                        System.out.printf("Informe a quantidade que ser"
                                + " estocada");
                        saldo = lerDados.nextInt();

                        produto.addProduto(id, name, saldo);
                        
                        System.out.println("Produto cadastrado com Sucesso!!!");
                    break;
                    
                    case 2:
                       produto.mostrarEstoque(); 
                    break;
                    
                    case 3:
                        System.out.println("Informe o id do produto a ser"
                                + " renomeado:");
                    break;
                    
                    case 4:
                        
                }
                

		System.out.printf("REMOVA UM PRODUTO POR ID");
		id = lerDados.nextInt();
		produto.removeProduto(id);
		lerDados.close();
	}

}
