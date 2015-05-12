package entidade;

import objetoDeValor.Cambio;
import objetoDeValor.Cor;
import objetoDeValor.MontadoraCarro;
import objetoDeValor.TipoCarro;

public class Carro  extends Veiculo{

    private String chassi;
    private String modelo;
    private float motorizacao;
    private float preco;
    private Cor cor;
    private Cambio cambio;
    private MontadoraCarro montadora;
    private TipoCarro tipo;

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

    public float getMotorizacao() {
        return motorizacao;
    }

    public void setMotorizacao(float motorizacao) {
        this.motorizacao = motorizacao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
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
