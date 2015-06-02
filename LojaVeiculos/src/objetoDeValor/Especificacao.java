package objetoDeValor;

import java.util.ArrayList;

import entidade.Veiculo;

public class Especificacao {
	{
		ArrayList<String> Cambio = new ArrayList<>();
		ArrayList<String> Cor = new ArrayList<>();
		ArrayList<String> tipoVeiculo = new ArrayList<>();
		ArrayList<String> montadoras = new ArrayList<>();
		String[] mont = { "BMW", "HONDA", "BASHAN", "DAFRA", "DAJIANG",
				"DAYANG", "FLASH", "HARLEY_DAVIDSON", "IROS", "ITALIKA",
				"KASINSKI", "KAWASAKI", "LONCIN", "SHINERAY", "SUNDOWN",
				"SUZUKI", "TRAXX", "TRIHMPH", "WUYANG", "YAMAHA", "CHEVROLET",
				"FORD", "HYUNDAI", "NISSAN", "RENAULT", "TOYOTA", "VOLKSWAGEN" };
		String[] tipo = { "HATCH", "SEDA", "MONOVOLUME", "PERUA", "PICAPE",
				"SUV", "ESPORTIVO", "JIPE", "SCRAMBLER", "TRACKER", "BOBBER",
				"CAFE_RACER", "CUSTOM", "CHOPPER", "ESPORTIVA", "FUN_BIKE",
				"HYPER_SPORT", "MAXI_TRAIL", "MINIMOTOS", "NAKED", "OFF_ROAD",
				"MOTOS_DE_TRIAL", "SCOOTERS", "SIDE_CAR", "STREET",
				"STREETFIGHTER", "SUPERMOTARD", "UNDERBONE", "WHEELIE" };
		String[] color = { "BRANCO", "INDIGO", "ROXO", "PINK", "AMARELO",
				"CINZA", "MARROM", "PRETO", "PRATA", " VERMELHO", "LARANJA",
				"AZUL", "DOURADO", "VERDE", "TURQUESA", "CASTANHO_AVERMELHADO" };
		String[] Cam = { "CVT", "AUTOMATICO", "AUTOMATICO_SEQUENCIAL",
				"SEMIAUTOMATICO", "MANUAL" };
		Cambio.contains(Cam);
		Cor.contains(color);
		montadoras.contains(mont);
		tipoVeiculo.contains(tipo);

	}
}
