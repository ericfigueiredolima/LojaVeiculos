package entidade;

import objetoDeValor.Cor;
import objetoDeValor.EspecificacaoMoto;


public class Motocicleta extends Veiculo{
    private int cilindrada;
    private int capacidadeTanque;
    private EspecificacaoMoto.TipoMoto tipo;
    private EspecificacaoMoto.Montadora montadora;

    public Motocicleta() {
    }

    public Motocicleta(String chassi, String modelo, int cilindrada, int capacidadeTanque, float preco, Cor cor, EspecificacaoMoto.TipoMoto tipo, EspecificacaoMoto.Montadora montadora) {
        this.chassi = chassi;
        this.modelo = modelo;
        this.cilindrada = cilindrada;
        this.capacidadeTanque = capacidadeTanque;
        this.preço = preco;
        this.cor = cor;
        this.tipo = tipo;
        this.montadora = montadora;
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

    public EspecificacaoMoto.TipoMoto getTipo() {
        return tipo;
    }

    public void setTipo(EspecificacaoMoto.TipoMoto tipo) {
        this.tipo = tipo;
    }

    public EspecificacaoMoto.Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(EspecificacaoMoto.Montadora montadora) {
        this.montadora = montadora;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "chassi='" + chassi + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidade do tanque=" + capacidadeTanque +
                ", preco=" + preço +
                ", cor=" + cor +
                ", tipo=" + tipo +
                ", montadora=" + montadora +
                '}';
    }
}
