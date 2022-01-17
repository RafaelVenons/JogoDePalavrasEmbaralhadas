import java.io.FileNotFoundException;

public class Principal {

	public static BancoDePalavras bp;
	public static IO io;
	public static MecanicaDeJogo mj;
	
	public static void main(String[] args) {

		try {
			bp = new BancoDePalavras();	
		}
		catch(FileNotFoundException fnfe){
			IO.imprimeException(fnfe);
			return;
		}
		
		try {
			io = new IO();
			mj = FactoryMecanicaDeJogo.factory(io.mecanicaDeJogo());
		}
		catch(IllegalArgumentException iae){
			IO.imprimeException(iae);
			return;
		}
		
		do {
			//Inicialização da Rodada
			mj.setEmbaralhador(FactoryEmbaralhador.factory());
			
			try {
				mj.setPalavra(bp.getPalavra());
			}
			catch(Exception e){
				IO.imprimeException(e);
				return;
			}
			
			IO.apresentaPalavra(mj.getPalavra());
			while(mj.novaTentativa()) {
				mj.tentativa(io.entrada());
			}
			
		}while(!mj.fimDeJogo());
		
		io.close();
	}	
}
