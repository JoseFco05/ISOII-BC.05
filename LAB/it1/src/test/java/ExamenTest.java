package ISOII_BC.LAB;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ExamenTest {

	@Test
	public void testExamen() {
		Examen examen_prueba = new Examen("001", "Examen ISO", "17/01/2024", "ESI", "Test");
		
		assertEquals("Test", examen_prueba.getTipoExamen());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetTipoExamen() {
		Examen examen_prueba = new Examen("001", "Examen ISO", "17/01/2024", "ESI", "Test");
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testSetTipoExamen() {
		Examen examen_prueba = new Examen("001", "Examen ISO", "17/01/2024", "ESI", "Test");
		examen_prueba.setTipoExamen("Mixto");
		assertEquals("Mixto", examen_prueba.getTipoExamen());
		//throw new RuntimeException("not yet implemented");
	}

}
