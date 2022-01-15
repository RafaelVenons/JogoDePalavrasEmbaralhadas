
public interface MecanicaDeJogo {
	
	public void setEmbaralhador(Embaralhador e);
	
	public void setPalavra(String p) throws Exception ;
	
	public String getPalavra(String p);
	
	public boolean tentativa(String p);
	
	public int getPontos();
	
	public boolean fimDeJogo();
}
