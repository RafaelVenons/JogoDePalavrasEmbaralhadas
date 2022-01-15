import java.io.FileNotFoundException;

public class Principal {

	public static void main(String[] args) {
		try {
			BancoDePalavras bp = new BancoDePalavras();
			MecanicaDeJogo mj = new MecanicaDeJogoPalavraUnica();
			do {
				mj.setEmbaralhador(new EmbaralhadorOrdemAlfabetica());
				try {
					mj.setPalavra(bp.getPalavra());
				}
				catch(Exception e){
					System.out.println(e);
				}
			}while(!mj.fimDeJogo());
		}
		catch(FileNotFoundException fnfe){
			System.out.println("Não foi possivel carregar o banco de palavras!");
		}
	}

}
