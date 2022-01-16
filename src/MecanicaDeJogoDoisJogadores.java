
public class MecanicaDeJogoDoisJogadores implements MecanicaDeJogo {

	private boolean vezDoJogador; 
	private String palavraOriginal;
	private String palavraEmbaralhada;
	private Embaralhador e;
	private boolean fdj;
	
	public MecanicaDeJogoDoisJogadores(){
		this.palavraOriginal = null;
		this.e = null;
		this.fdj = true;
		this.vezDoJogador = true;
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
		this.fdj = false;
	}

	@Override
	public String getPalavra() {
		return this.palavraEmbaralhada;
	}

	@Override
	public boolean novaTentativa() {
		if(this.fdj) return false;
		IO.vezDoJogador(this.vezDoJogador);
		return true;
	}

	@Override
	public void tentativa(String p) {
		if(this.palavraOriginal.equals(p)) {
			this.fdj = true;
			IO.acertou(this.vezDoJogador);
		}else {
			this.vezDoJogador = !this.vezDoJogador;
		}
	}

	@Override
	public boolean fimDeJogo() {
		return this.fdj;
	}

}
