import java.io.FileNotFoundException;

public class Principal {

	public static void main(String[] args) {
		try {
			
			BancoDePalavras bp = new BancoDePalavras();
			MecanicaDeJogo mj = new MecanicaDeJogoPalavraUnica();
			IO io = new IO();
			do {
				//Inicialização da Rodada
				mj.setEmbaralhador(new EmbaralhadorOrdemAlfabetica());
				
				try {
					String pa = bp.getPalavra();
					System.out.println(pa);
					mj.setPalavra(pa);
				}
				catch(Exception e){
					IO.imprimeException(e);
				}
				
				IO.apresentaPalavra(mj.getPalavra());
				while(mj.novaTentativa()) {
					mj.tentativa(io.entrada());
				}
				
			}while(!mj.fimDeJogo());
			
			io.close();
		}
		catch(FileNotFoundException fnfe){
			System.out.println("Não foi possivel carregar o banco de palavras!");
		}
	}

}
