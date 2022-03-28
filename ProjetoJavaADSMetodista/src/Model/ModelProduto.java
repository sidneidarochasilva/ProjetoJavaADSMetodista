package Model;

public class ModelProduto {

	private int id;
	private String name;
	private int saldo;

	public ModelProduto(int id, String name, int saldo) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.saldo = saldo;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}
