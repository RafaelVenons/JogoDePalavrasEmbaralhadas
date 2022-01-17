
public class EmbaralhadorTrocaImparComPar implements Embaralhador {

	@Override
	public String Embaralhar(String palavra) {
		String[] palavras = palavra.split("-");
		String palavraEmbaralhada = null;
		
		for(String p : palavras) {
			
			char c[] = p.toCharArray();

			for(int i = 0; i < c.length-1; i+=2) {
				char temp = c[i];
				c[i] = c[i+1];
				c[i+1] = temp;
			}
			
			if(palavraEmbaralhada == null) {
				palavraEmbaralhada = new String(c);
			} else {
				palavraEmbaralhada = palavraEmbaralhada + "-" + new String(c);
			}
		}
		return palavraEmbaralhada;
	}

}
