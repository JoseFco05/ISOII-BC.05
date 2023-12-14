package ISOII_BC.LAB;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class TutoriaTest {

	@Test
	public void testTutoria() {
		Tutoria tutoria_prueba = new Tutoria("001", "Tutoria ISO" , "01/12/2023", "ESI", "Practica");
		
		assertEquals("Practica", tutoria_prueba.getTipo());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetTipo() {
		Tutoria tutoria_prueba = new Tutoria("001", "Tutoria ISO" , "01/12/2023", "ESI", "Practica");
		assertEquals("Practica", tutoria_prueba.getTipo());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testSetTipo() {
		Tutoria tutoria_prueba = new Tutoria("001", "Tutoria ISO" , "01/12/2023", "ESI", "Practica");
		tutoria_prueba.setTipo("Teorica");
		assertEquals("Teorica", tutoria_prueba.getTipo());
		//throw new RuntimeException("not yet implemented");
	}

}
