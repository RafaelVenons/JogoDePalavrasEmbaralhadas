import java.io.FileNotFoundException;

public class Principal {

	public static void main(String[] args) {
		try {
			BancoDePalavras bp = new BancoDePalavras();
			String palavraCerta = bp.getPalavra();
			Embaralhador e = new EmbaralhadorOrdemAlfabetica();
			System.out.println(palavraCerta);
			System.out.println(e.Embaralhar(palavraCerta));
		}
		catch(FileNotFoundException fnfe){
			System.out.println("Não foi possivel carregar o banco de palavras!");
		}
	}

}
