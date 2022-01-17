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
		
		io = new IO();
		
		do {
			mj = FactoryMecanicaDeJogo.factory(io.mecanicaDeJogo());
			mj.setEmbaralhador(FactoryEmbaralhador.factory());
			mj.setPalavra(bp.getPalavra());
						
			IO.apresentaPalavra(mj.getPalavra());
			
			while(mj.novaTentativa()) {
				mj.tentativa(io.entrada());
			}
			
		}while(!mj.fimDeJogo() || io.jogarNovamente());
	}	
}
