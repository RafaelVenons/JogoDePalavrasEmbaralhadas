import java.util.Random;

public class FactoryEmbaralhador {
	public static Embaralhador factory() {
		switch(new Random().nextInt(3)) {
			case 0:
				return new EmbaralhadorInverterString();
			case 1:
				return new EmbaralhadorOrdemAlfabetica();
			case 2:
				return new EmbaralhadorTrocaImparComPar();
			default:
				throw new IllegalArgumentException("Configuraram mal isso aqui!!!");
		}
	}
}
