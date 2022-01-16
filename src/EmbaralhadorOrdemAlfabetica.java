import java.util.Arrays;

public class EmbaralhadorOrdemAlfabetica implements Embaralhador {

	@Override
	public String Embaralhar(String palavra) {
		
		String[] palavras = palavra.split("-");
		String palavraEmbaralhada = null;
		
		for(String p : palavras) {
			
			char c[] = p.toCharArray();
			Arrays.sort(c);
			
			if(palavraEmbaralhada == null) {
				palavraEmbaralhada = new String(c);
			} else {
				palavraEmbaralhada = palavraEmbaralhada + "-" + new String(c);
			}
		}
		return palavraEmbaralhada;
	}

}
