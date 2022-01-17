import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMecanicaDeJogoPalavraUnica {

	MecanicaDeJogo mj;
	Embaralhador e;
	
	@BeforeEach
	void beforeEach() {
		mj = new MecanicaDeJogoPalavraUnica();
		e = new EmbaralhadorOrdemAlfabetica();
	}
	
	@Test
	void testErroSetPalavra() {
		try {
			mj.setPalavra("ABACATE");
			fail();
		}catch(Exception e){}
	}

	@Test
	void testGetPalavra() {
		mj.setEmbaralhador(e);
		try {
			mj.setPalavra("ABACATE");
		}catch(Exception e){
			fail();
		}
		assertEquals("AAABCET",mj.getPalavra());
	}
	
	@Test
	void testNovaTentativaSemPalavra() {
		mj.setEmbaralhador(e);
		assertFalse(mj.novaTentativa());
		assertTrue(mj.fimDeJogo());
	}
	
	@Test
	void testNovaTentativaTempoDeJogo() {
		mj.setEmbaralhador(e);
		try {
			mj.setPalavra("ABACATE");
		}catch(Exception e){
			fail();
		}
		assertTrue(mj.novaTentativa());
		assertFalse(mj.fimDeJogo());
	}
	
	@Test
	void testNovaTentativaFimDeJogo() {
		mj.setEmbaralhador(e);
		try {
			mj.setPalavra("ABACATE");
		}catch(Exception e){
			fail();
		}
		mj.tentativa("ABACATE");
		assertFalse(mj.novaTentativa());
		assertTrue(mj.fimDeJogo());
	}
}
