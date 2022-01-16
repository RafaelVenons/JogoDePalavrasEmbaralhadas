import java.util.Scanner;

public class IO {
	
	Scanner sc;
	
	public IO() {
		sc = new Scanner(System.in);
	}

	public void close() {
		sc.close();
	}
	
	public String entrada() {
		System.out.print("Tentativa: ");
		return sc.next().toUpperCase();
	}
	
	public String mecanicaDeJogo(){
		System.out.println("Escolha um modo de Jogo através do indice:");
		System.out.println("1. Unico Jogador/Palavra Unica.");
		System.out.println("2. Dois Jogadores.");
		System.out.print("Opção: ");
		switch(sc.nextInt()) {
		case 1:
			return "Palavra Unica";
		case 2:
			return "Dois Jogadores";
		default :
			System.out.println("Entrada invalida!");
			return mecanicaDeJogo();
		}
	}
	
	
	public static void imprimeException(Exception e) {
		System.out.println(e);
	}
	
	public static void apresentaPalavra(String palavra) {
		System.out.println("A palavra tem " + palavra.length() + " letras");
		System.out.println("A palavra embaralhada é: " + palavra);
	}
	
	public static void acertou(boolean jogador) {
		if(jogador) {
			System.out.println("Parabens, o Jogador 1 acertou a palavra!!!");
		}else {
			System.out.println("Parabens, o Jogador 2 acertou a palavra!!!");
		}
	}
	
	public static void acertou(int pontos) {
		System.out.println("Parabens, você acertou a palavra!!!");
		System.out.println("Você fez " + pontos + " pontos");
	}
	
	public static void tenteNovamente() {
		System.out.println("Errou... Tente Novamente!");
	}
	
	public static void terminou(String palavra) {
		System.out.println("Errou... Infelismente suas tentativas acabaram");
		System.out.println("A palavra era " + palavra);
	}
	
	public static void vezDoJogador(boolean jogador) {
		if(jogador) {
			System.out.println("Vez do jogador 1");
		}else {
			System.out.println("Vez do jogador 2");
		}
	}
}
