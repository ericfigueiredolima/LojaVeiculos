import java.util.ArrayList;
import java.util.Scanner;

public class Veiculo extends Especificacao {
	static Scanner in = new Scanner(System.in);

	float motorização;
	String chassi;
	String modelo;
	float preço;
	private int cilindrada;
	private int capacidadeTanque;
	private String montadoras;
	private String Cor;
	private String tipoAutomovel; // se é motocicleta ou carro
	private String cambio;

	public Veiculo adicionarCarro(String chassi, String modelo, float preço,
			int cilindrada, ArrayList<String> cambio, ArrayList<String> cor,
			float motorização) {
		int i = 0;
		Veiculo v = new Veiculo();
		System.out.println("Digite o chassi: ");
		v.setChassi(in.next());
		in.nextLine(); // limpa o buffer
		System.out.println("Digite o modelo: ");
		v.setModelo(in.next());
		in.nextLine();
		System.out.println("Digite o preço: ");
		v.setPreço(in.nextFloat());
		in.nextLine();
		System.out.println("Digite a cilindrada: ");
		v.setCilindrada(in.nextInt());
		in.nextLine();
		;
		System.out.println("Digite o numero que corresponde ao cambio: ");
		for (String cam : cambio) {
			System.out.println(i + " " + cam + " - ");
			i++;
		}
		v.setCambio(cambio.get(in.nextInt()));
		i = 0;
		System.out.println("Digite o numero que corresponde a cor: ");
		for (String color : cor) {
			System.out.println(i + " " + color + " - ");
			i++;
		}
		v.setCor(cor.get(in.nextInt()));
		return v;
	}

	public Veiculo adicionarMotocicleta(String chassi, String modelo,
			int cilindrada, String capacidadeTanque, float preço,
			ArrayList<String> cor, ArrayList<String> tipoMotocicleta,
			ArrayList<String> montadoraMotocicleta) {
		Veiculo veiculo = new Veiculo();
		int i = 0;
		System.out.println("Digite o chassi: ");
		veiculo.setChassi(in.next());
		in.nextLine();
		System.out.println("Digite o modelo: ");
		veiculo.setModelo(in.next());
		in.nextLine();
		System.out.println("Digite a cilindrada: ");
		veiculo.setCilindrada(in.nextInt());
		in.nextLine();
		System.out.println("Digite a capacidade do tanque: ");
		veiculo.setCapacidadeTanque(in.nextInt());
		in.nextLine();
		System.out.println("Digite o preço: ");
		veiculo.setPreço(in.nextFloat());
		in.nextLine();
		System.out.println("Digite o numero correspondente a cor: ");
		for (String color : cor) {
			System.out.println(i + " " + color + " - ");
			i++;
		}
		veiculo.setCor(cor.get(in.nextInt()));
		i = 0;
		System.out
				.println("Digite o numero correspondente ao tipo da motocicleta: ");
		for (String tm : tipoMotocicleta) {
			System.out.println(i + " " + tm + " - ");
			i++;
		}
		veiculo.setTipoAutomovel(tipoMotocicleta.get(in.nextInt()));
		in.nextLine();
		i = 0;
		System.out
				.println("Digite o numero correspondente ao numero da montadora da motocicleta: ");
		for (String mm : montadoraMotocicleta) {
			System.out.println(i + " " + mm + " - ");
			i++;
		}
		veiculo.setMontadoras(montadoraMotocicleta.get(in.nextInt()));
		return veiculo;
	}

	public String getMontadoras() {
		return montadoras;
	}

	public void setMontadoras(String montadoras) {
		this.montadoras = montadoras;
	}

	public String getTipoAutomovel() {
		return tipoAutomovel;
	}

	public void setTipoAutomovel(String tipoAutomovel) {
		this.tipoAutomovel = tipoAutomovel;
	}

	public String getCor() {
		return Cor;
	}

	public void setCor(String cor) {
		Cor = cor;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

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

	public float getPreço() {
		return preço;
	}

	public void setPreço(float preço) {
		this.preço = preço;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public int getCapacidadeTanque() {
		return capacidadeTanque;
	}

	public void setCapacidadeTanque(int capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}

	@Override
	public String toString() {
		return "Veiculo{" + "chassi='" + chassi + '\'' + ", modelo='" + modelo
				+ '\'' + ", cilindrada=" + cilindrada
				+ ", capacidade do tanque=" + capacidadeTanque + ", preco="
				+ preço + ", cor=" + Cor + ", tipo=" + tipoAutomovel
				+ ", montadora=" + montadoras + '}';
	}

}
