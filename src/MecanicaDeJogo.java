
public interface MecanicaDeJogo {
	
	public void setEmbaralhador(Embaralhador e);
	
	public void setPalavra(String p) throws Exception ;
	
	public String getPalavra();
	
	public boolean novaTentativa();

	public void tentativa(String p);
	
	public int getPontos();
	
	public boolean fimDeJogo();
}
