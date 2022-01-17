
public class MecanicaDeJogoPalavraUnica implements MecanicaDeJogo {
	
	private String palavra;
	private Embaralhador e;
	private int pontos;
	private boolean fdj;
	
	MecanicaDeJogoPalavraUnica(){
		this.palavra = null;
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
		
		this.palavra = p;
		this.pontos = 100*p.length();
		this.fdj = false;
	}
	
	@Override
	public String getPalavra() {
		return e.Embaralhar(this.palavra);
	}

	@Override
	public boolean novaTentativa() {
		return !this.fdj;
	}
	
	@Override
	public void tentativa(String p) {
		if(palavra.equals(p)) {
			this.fdj = true;
			IO.acertou(this.getPontos());
		} else {
			pontos -= 10;
			if(this.pontos > 0) {
				IO.tenteNovamente();
			}else {
				this.fdj = true;
				IO.terminou(this.getPalavra());
			}
		}
		
	}

	public int getPontos() {
		return this.pontos;
	}

	@Override
	public boolean fimDeJogo() {
		return this.fdj;
	}

}
