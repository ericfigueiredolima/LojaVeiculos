import entidade.Carro;
import entidade.Loja;
import entidade.Motocicleta;
import objetoDeValor.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Test {

    Scanner sc = new Scanner(System.in);
    Loja loja; //loja

    public static void main(String[] args) {
        Test t = new Test();
        t.init();
    }

    public void init() {
        loja = new Loja("Montadora Teste Ltda.", "Rua. Sao Jose, 90 - Centro, Rio de Janeiro - RJ, 20010-020");
        menu();
    }

    public void menu() {
        int opcao = 0;
        do {
            System.out.println(loja + "\n");

            System.out.println("1 - Adicionar Carro \n" +
                    "2 - Adicionar Moto \n" +
                    "3 - Listar Carros \n" +
                    "4 - Listar Motos \n" +
                    "5 - Buscar Carro \n" +
                    "6 - Buscar Moto \n" +
                    "0 - Sair \n");

            System.out.println("Escolha o numero da opcao desejada:");
            opcao = sc.nextInt();

            switch (opcao) {
                case 0: //é tipo um default
                    break;
                case 1:
                    adicionarCarro();
                    break;
                case 2:
                    break;
                case 3:
                    loja.listarEstoqueCarros();
                    break;
                case 4:
                    loja.listarEstoqueMotos();
                    break;
                case 5:
                    break;
                case 6:
                    break;
            }
        } while (opcao != 0);

        System.out.println("Programa finalizado");
    }

    public void adicionarCarro() {
        Carro novoCarro = new Carro();

        System.out.println("Cadastro de Carro:");

        System.out.println("Informe o chassi do carro (Ex.: F23021):");
        novoCarro.setChassi(sc.next());
        sc.nextLine(); //tipo um fflush

        System.out.println("Informe o modelo do carro (Ex.: Focus Hatch):");
        novoCarro.setModelo(sc.next());
        sc.nextLine(); 

        System.out.println("Informe a motorizacao do carro (Ex.: 1,0/ 1,6/ 2,0):");
        while (true) {
            try {
                float motorizacao = sc.nextFloat();
                sc.nextLine();
                novoCarro.setMotorizacao(motorizacao);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor informado para a motorizacao deve ser um numero decimal. Tente novamente:");
                sc.nextLine();
            }
        }

        System.out.println("Informe o preco do carro (Ex.: 15000,30 / 23500):");

        while (true) {
            try {
                float preco = sc.nextFloat();
                novoCarro.setPreço(preco);
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Valor informado para a motorizacao deve ser um numero decimal. Tente novamente:");
                sc.nextLine();
            }
        }
        System.out.println("Informe a Cor do carro: ");

        ArrayList<Cor> cores = new ArrayList<Cor>(Arrays.asList(Cor.values()));
        for (int i = 0; i < cores.size(); i++) {
            System.out.print((i + 1) + "-" + cores.get(i) + " ");
            if ((i + 1) % 10 == 0)
                System.out.println();

        }

        String cor = "";
        while (true) {
            try {
                cor = sc.next();
                novoCarro.setCor(Cor.valueOf(cor.toUpperCase()));
                sc.nextLine();
                break;
            } catch (Exception e) {
                try
                {
                    int corValor = Integer.parseInt(cor);
                    novoCarro.setCor(Cor.values()[corValor-1]);
                    sc.nextLine();
                    break;
                }
                catch (Exception ex) {
                    System.out.println("Valor informado para a cor deve ser o numero correspondente a cor ou o nome da cor. Tente novamente:");
                    sc.nextLine();
                }
            }
        }
        

        System.out.println("Informe o Câmbio do carro: ");
        ArrayList<Cambio> cambios = new ArrayList<Cambio>(Arrays.asList(Cambio.values()));
        for (int i = 0; i < cambios.size(); i++) {
            System.out.print((i + 1) + "-" + cambios.get(i) + " ");
            if ((i + 1) % 10 == 0)
                System.out.println();
        }

        String cambio = "";
        while (true) {
            try {
                cambio = sc.next();
                novoCarro.setCambio(Cambio.valueOf(cambio.toUpperCase()));
                sc.nextLine();
                break;
            } catch (Exception e) {
                try
                {
                    int cambioValor = Integer.parseInt(cambio);
                    novoCarro.setCambio(Cambio.values()[cambioValor-1]);
                    sc.nextLine();
                    break;
                }
                catch (Exception ex) {
                    System.out.println("Valor informado para a cor deve ser o numero correspondente a cor ou o nome da cor. Tente novamente:");
                    sc.nextLine();
                }
            }
        }
        
        System.out.println("Informe a Montadora do Carro: ");

        ArrayList<MontadoraCarro> montadoras = new ArrayList<MontadoraCarro>(Arrays.asList(MontadoraCarro.values()));
        for (int i = 0; i < montadoras.size(); i++) {
            System.out.print((i + 1) + "-" + montadoras.get(i) + " ");
            if ((i + 1) % 10 == 0)
                System.out.println();
        }

        String montadora = "";
        while (true) {
            try {
                montadora = sc.next();
                novoCarro.setMontadora(MontadoraCarro.valueOf(montadora.toUpperCase()));
                sc.nextLine();
                break;
            } catch (Exception e) {
                try
                {
                    int montadoraValor = Integer.parseInt(montadora);
                    novoCarro.setMontadora(MontadoraCarro.values()[montadoraValor-1]);
                    sc.nextLine();
                    break;
                }
                catch (Exception ex) {
                    System.out.println("Valor informado para a cor deve ser o numero correspondente a cor ou o nome da cor. Tente novamente:");
                    sc.nextLine();
                }
            }
        }
        
        System.out.println("Informe o Tipo do Carro: ");

        ArrayList<TipoCarro> tipos = new ArrayList<TipoCarro>(Arrays.asList(TipoCarro.values()));
        for (int i = 0; i < tipos.size(); i++) {
            System.out.print((i + 1) + "-" + tipos.get(i) + " ");
            if ((i + 1) % 10 == 0)
                System.out.println();
        }

        String tipo = "";
        while (true) {
            try {
                tipo = sc.next();
                novoCarro.setTipo(TipoCarro.valueOf(tipo.toUpperCase()));
                sc.nextLine();
                break;
            } catch (Exception e) {
                try
                {
                    int tipoValor = Integer.parseInt(tipo);
                    novoCarro.setTipo(TipoCarro.values()[tipoValor-1]);
                    sc.nextLine();
                    break;
                }
                catch (Exception ex) {
                    System.out.println("Valor informado para a cor deve ser o numero correspondente a cor ou o nome da cor. Tente novamente:");
                    sc.nextLine();
                }
            }
        }

        loja.adicionarCarro(novoCarro);
        System.out.println("Carro cadastrado com sucesso!");
    }

    public void testar() {
        Carro carro = new Carro();
        carro.setCambio(Cambio.AUTOMATICO);
        carro.setChassi("F00001");
        carro.setCor(Cor.AZUL);
        carro.setModelo("Focus Hatch");
        carro.setMontadora(MontadoraCarro.FORD);
        carro.setMotorizacao(1.6f);
        carro.setPreço(68.000f);
        carro.setTipo(TipoCarro.HATCH);

        loja.adicionarCarro(carro);

        System.out.println("Estoque de Carros:");
        loja.listarEstoqueCarros();

        System.out.println("Buscar Carro chassi F00001:");
        Carro carroBusca1 = loja.buscarCarro("f00001");

        if (carroBusca1 != null)
            System.out.println(carroBusca1);
        else
            System.out.println("Nenhum carro encontrado com este chassi.");


        System.out.println("==============================================================================================================================");

        Motocicleta moto = new Motocicleta();
        moto.setChassi("F00001");
        moto.setCor(Cor.AZUL);
        moto.setModelo("Focus Hatch");
        moto.setMontadora(MontadoraMoto.HARLEY_DAVIDSON);
        moto.setPreço(68.000f);
        moto.setTipo(TipoMoto.ESPORTIVA);

        loja.adicionarMoto(moto);

        System.out.println("Estoque de motos:");
        loja.listarEstoqueMotos();

        Motocicleta motoBusca = null;
        System.out.println("Buscar moto chassi F00001:");
        motoBusca = loja.buscarMoto("f00001");

        if (motoBusca != null)
            System.out.println(motoBusca);
        else
            System.out.println("Nenhuma moto encontrada com este chassi.");

        System.out.println("Buscar moto chassi F00002:");
        motoBusca = loja.buscarMoto("f00002");

        if (motoBusca != null)
            System.out.println(motoBusca);
        else
            System.out.println("Nenhuma moto encontrada com este chassi.");
    }
}
