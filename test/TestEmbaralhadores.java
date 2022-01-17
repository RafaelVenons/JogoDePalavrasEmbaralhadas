import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEmbaralhadores {

	@Test
	void testEmbaralhadorOrdemAlfabeticaSimples() {
		Embaralhador e = new EmbaralhadorOrdemAlfabetica();
		assertEquals("AAABCET",e.Embaralhar("ABACATE"));
	}
	
	@Test
	void testEmbaralhadorOrdemAlfabeticaComposto() {
		Embaralhador e = new EmbaralhadorOrdemAlfabetica();
		assertEquals("MU-DIOS",e.Embaralhar("UM-DOIS"));
	}
	
	@Test
	void testEmbaralhadorInverterStringSimples() {
		Embaralhador e = new EmbaralhadorInverterString();
		assertEquals("ETACABA",e.Embaralhar("ABACATE"));
	}
	
	@Test
	void testEmbaralhadorInverterStringComposto() {
		Embaralhador e = new EmbaralhadorInverterString();
		assertEquals("SIOD-MU",e.Embaralhar("UM-DOIS"));
	}
	
	@Test
	void testEmbaralhadorTrocaImparComParSimplesImpar() {
		Embaralhador e = new EmbaralhadorTrocaImparComPar();
		assertEquals("BACATAE",e.Embaralhar("ABACATE"));
	}
	
	@Test
	void testEmbaralhadorTrocaImparComParSimplesPar() {
		Embaralhador e = new EmbaralhadorTrocaImparComPar();
		assertEquals("OTAMET",e.Embaralhar("TOMATE"));
	}
	
	@Test
	void testEmbaralhadorTrocaImparComParComposto() {
		Embaralhador e = new EmbaralhadorTrocaImparComPar();
		assertEquals("NUS-ODSI",e.Embaralhar("UNS-DOIS"));
	}
}
