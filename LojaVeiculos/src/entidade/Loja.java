package entidade;

public class Loja {

    private String nome;
    private String endereco;
    private Carro estoqueCarro[] = new Carro[100];
    private Motocicleta estoqueMotocicleta[] = new Motocicleta[100];
    private int contadorCarro = 0;
    private int contadorMoto = 0;

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

    public void adicionarCarro(Carro carro) {
        estoqueCarro[contadorCarro++] = carro;
    }

    public void adicionarMoto(Motocicleta motocicleta) {
        estoqueMotocicleta[contadorMoto++] = motocicleta;
    }

//     Pouca informação para fazer
//
//    public Carro pesquisarCarro(...) {
//        return null;
//    }
//
//    public Motocicleta pesquisarMoto(...) {
//        return null;
//    }

    public Carro buscarCarro(String chassi) {
        for (Carro c : estoqueCarro) {
            if (c != null && c.getChassi().equalsIgnoreCase(chassi))
                return c;
        }
        return null;
    }

    public Motocicleta buscarMoto(String chassi) {
        for (Motocicleta m : estoqueMotocicleta) {
            if (m != null && m.getChassi().equalsIgnoreCase(chassi))
                return m;
        }
        return null;
    }

    public void listarEstoqueCarros() {
        for (Carro c : estoqueCarro) {
            if (c != null)
                System.out.println(c);
        }
    }

    public void listarEstoqueMotos() {
        for (Motocicleta m : estoqueMotocicleta) {
            if (m != null)
                System.out.println(m);
        }
    }

    @Override
    public String toString() {
        return nome + " ( " + endereco + " )";
    }
}
