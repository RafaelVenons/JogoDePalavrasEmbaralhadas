
public class FactoryMecanicaDeJogo {
	public static MecanicaDeJogo factory(String mecanica) {
		switch (mecanica) {
		case "Palavra Unica": 
			return new MecanicaDeJogoPalavraUnica();
		case "Dois Jogadores":
			return new MecanicaDeJogoDoisJogadores();
		default:
			throw new IllegalArgumentException("Modo de jogo invalido!!!");
		}
	}
}
