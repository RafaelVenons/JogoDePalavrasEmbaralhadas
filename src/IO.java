import java.util.Scanner;

public class IO {
	
	Scanner sc;
	
	public IO() {
		sc = new Scanner(System.in);
	}
	
	public String entrada() {
		System.out.print("Tentativa: ");
		String entrada = sc.next();
		return entrada;
	}
	
	public void close() {
		sc.close();
	}
	
	public static void imprimeException(Exception e) {
		System.out.println(e);
	}
	
	public static void apresentaPalavra(String palavra) {
		System.out.println("A palavra tem " + palavra.length() + " letras");
		System.out.println("A palavra embaralhada é: " + palavra);
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
}
