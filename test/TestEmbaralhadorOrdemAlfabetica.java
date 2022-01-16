import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestEmbaralhadorOrdemAlfabetica {

	@Test
	void testSimples() {
		Embaralhador e = new EmbaralhadorOrdemAlfabetica();
		assertEquals("AAABCET",e.Embaralhar("ABACATE"));
	}
	
	@Test
	void testComposto() {
		Embaralhador e = new EmbaralhadorOrdemAlfabetica();
		assertEquals("MU-DIOS",e.Embaralhar("UM-DOIS"));
	}
}
