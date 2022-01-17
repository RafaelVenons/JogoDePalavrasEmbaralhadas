
public class EmbaralhadorInverterString implements Embaralhador {

	@Override
	public String Embaralhar(String palavra) {
		return new StringBuilder(palavra).reverse().toString();
	}

}
