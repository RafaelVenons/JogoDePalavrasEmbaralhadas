
public class MecanicaDeJogoPalavraUnica implements MecanicaDeJogo {
	
	private String palavraOriginal;
	private String palavraEmbaralhada;
	private Embaralhador e;
	private int pontos;
	private boolean fdj;
	
	MecanicaDeJogoPalavraUnica(){
		this.palavraOriginal = null;
		this.e = null;
		this.pontos = 0;
		this.fdj = true;
	}
	
	@Override
	public void setEmbaralhador(Embaralhador e) {
		this.e = e;
	}
	
	@Override
	public void setPalavra(String p) throws Exception {
		
		if(e == null) throw new Exception("Embaralhador não definido");
		
		this.palavraOriginal = p;
		this.palavraEmbaralhada = e.Embaralhar(p);
		this.pontos = 100*p.length();
		this.fdj = false;
	}
	
	@Override
	public String getPalavra(String p) {
		return palavraEmbaralhada;
	}

	@Override
	public boolean tentativa(String p) {
		if(palavraOriginal.equals(p)) {
			this.fdj = true;
			return true;
		} else {
			pontos -= 10;
			return false;
		}
		
	}

	@Override
	public int getPontos() {
		return this.pontos > 0 ? this.pontos : 0;
	}

	@Override
	public boolean fimDeJogo() {
		return this.pontos > 0 ? fdj : true;
	}

}
