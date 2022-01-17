import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFactoryMecanicaDeJogo {

	@Test
	void testPalavraUnica() {
		assertEquals(new MecanicaDeJogoPalavraUnica().getClass(),FactoryMecanicaDeJogo.factory("Palavra Unica").getClass());
	}

	@Test
	void testDoisJogadores() {
		assertEquals(new MecanicaDeJogoDoisJogadores().getClass(),FactoryMecanicaDeJogo.factory("Dois Jogadores").getClass());
	}

	@Test
	void testFalhas() {
		try {
			FactoryMecanicaDeJogo.factory("Modo de jogo Inexistente");
			fail();
		}catch(IllegalArgumentException e) {}
	}
}
