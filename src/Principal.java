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
					mj.setPalavra(bp.getPalavra());
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
			IO.imprimeException(fnfe);
		}
	}

}
