import java.util.Arrays;

public class EmbaralhadorOrdemAlfabetica implements Embaralhador {

	@Override
	public String Embaralhar(String palavra) {
		char c[] = palavra.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}

}
