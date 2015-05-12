package entidade;

import objetoDeValor.Cambio;
import objetoDeValor.Cor;
import objetoDeValor.MontadoraCarro;
import objetoDeValor.TipoCarro;

public class Carro extends Veiculo{
     float motorizacao;
     Cambio cambio;
     MontadoraCarro montadora;
     TipoCarro tipo;

    public Carro() {
    }

    public Carro(String chassi, String modelo, float motorizacao, float preco, Cor cor, Cambio cambio, MontadoraCarro montadora, TipoCarro tipo) {
        this.chassi = chassi;
        this.modelo = modelo;
        this.motorizacao = motorizacao;
        this.preco = preco;
        this.cor = cor;
        this.cambio = cambio;
        this.montadora = montadora;
        this.tipo = tipo;
    }

    public TipoCarro getTipo() {
        return tipo;
    }

    public void setTipo(TipoCarro tipo) {
        this.tipo = tipo;
    }

    public float getMotorizacao() {
        return motorizacao;
    }

    public void setMotorizacao(float motorizacao) {
        this.motorizacao = motorizacao;
    }

    public Cambio getCambio() {
        return cambio;
    }

    public void setCambio(Cambio cambio) {
        this.cambio = cambio;
    }

    public MontadoraCarro getMontadora() {
        return montadora;
    }

    public void setMontadora(MontadoraCarro montadora) {
        this.montadora = montadora;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "chassi='" + chassi + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motorizacao=" + motorizacao +
                ", preco=" + preco +
                ", cor=" + cor +
                ", cambio=" + cambio +
                ", montadora=" + montadora +
                ", tipo=" + tipo +
                '}';
    }
}
