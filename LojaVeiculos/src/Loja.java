
public class Loja {

	private String nome;
	private String endereco;
	private Veiculo estoqueCarro[] = new Veiculo[100];
	private Veiculo estoqueMotocicleta[] = new Veiculo[100];
	private int contadorCarro = 0;
	private int contadorMoto = 0;
	private Object m;

	public Loja(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void adicionarCarro(Veiculo carro) {
		estoqueCarro[contadorCarro++] = carro;
	}

	public void adicionarMoto(Veiculo motocicleta) {
		estoqueMotocicleta[contadorMoto++] = motocicleta;
	}

	// Pouca informação para fazer
	//
	// public Carro pesquisarCarro(...) {
	// return null;
	// }
	//
	// public Motocicleta pesquisarMoto(...) {
	// return null;
	// }

	public Veiculo buscarCarro(String chassi) {
		for (Veiculo c : estoqueCarro) {
			if (c != null && c.getChassi().equalsIgnoreCase(chassi))
				return c;
		}
		return null;
	}

	public Veiculo buscarMoto(String chassi) {
		for (Veiculo m : estoqueMotocicleta) {
			if (m != null && m.getChassi().equalsIgnoreCase(chassi))
				return m;
		}
		return null;
	}

	public void listarEstoqueCarros() {
		for (Veiculo c : estoqueCarro) {
			if (c != null)
				System.out.println(c);
		}
	}

	public void listarEstoqueMotos() {
		if (m != null)
			System.out.println(m);
	}

	@Override
	public String toString() {
		return nome + " ( " + endereco + " )";
	}
}
