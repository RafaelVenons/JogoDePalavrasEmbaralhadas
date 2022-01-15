import java.io.FileNotFoundException;

public class Principal {

	public static void main(String[] args) {
		try {
			BancoDePalavras bp = new BancoDePalavras();
			System.out.println(bp.getPalavra());
		}
		catch(FileNotFoundException fnfe){
			System.out.println("Não foi possivel carregar o banco de palavras!");
		}

	}

}
