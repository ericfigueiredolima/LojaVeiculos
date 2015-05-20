package entidade;

import objetoDeValor.*;

public abstract class Veiculo {

	protected String chassi;
	protected String modelo;
	Cambio cor;
	protected float preco;

	public String getChassi() {
		return chassi;
	}

	public void setChassi(String chassi) {
		this.chassi = chassi;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Cambio getCor() {
		return cor;
	}

	public void setCor(Cambio cor) {
		this.cor = cor;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

}
