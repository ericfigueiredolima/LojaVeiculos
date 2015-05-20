package entidade;

import objetoDeValor.Cambio;
import objetoDeValor.Cor;
import objetoDeValor.EspecificacaoCarro;


public class Carro extends Veiculo{ //com a heranÃ§a da classe Veiculo,nÃ£o preciso reescrever as variÃ¡veis protegidas na classe veÃ­culo e fazer os getters and setters,alÃ©m de poder utilizÃ¡-las
     float motorizacao;
     Cambio cambio;
     EspecificacaoCarro.Montadora montadora;
     EspecificacaoCarro.TipoCarro tipo;

    public Carro() {
    }

    public Carro(String chassi, String modelo, float motorizacao, float preco, Cor cor, Cambio cambio, EspecificacaoCarro.Montadora montadora, EspecificacaoCarro.TipoCarro tipo) {
        this.chassi = chassi;
        this.modelo = modelo;
        this.motorizacao = motorizacao;
        this.preco = preco;
        this.cor = cor;
        this.cambio = cambio;
        this.montadora = montadora;
        this.tipo = tipo;
    }

    public EspecificacaoCarro.TipoCarro getTipo() {
        return tipo;
    }

    public void setTipo(EspecificacaoCarro.TipoCarro tipo) {
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

    public EspecificacaoCarro.Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(EspecificacaoCarro.Montadora montadora) {
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
