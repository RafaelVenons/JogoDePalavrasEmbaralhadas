
public class MecanicaDeJogoDoisJogadores implements MecanicaDeJogo {

	private boolean vezDoJogador; 
	private String palavra;
	private Embaralhador e;
	private boolean fdj;
	
	public MecanicaDeJogoDoisJogadores(){
		this.palavra = null;
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
		
		this.palavra = p;
		this.fdj = false;
	}

	@Override
	public String getPalavra() {
		return this.e.Embaralhar(this.palavra);
	}

	@Override
	public boolean novaTentativa() {
		if(this.fdj) return false;
		IO.vezDoJogador(this.vezDoJogador);
		return true;
	}

	@Override
	public void tentativa(String p) {
		if(this.palavra.equals(p)) {
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
