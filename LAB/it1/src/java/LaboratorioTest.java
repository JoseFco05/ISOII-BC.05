package ISOII_BC.LAB;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class LaboratorioTest {

	@Test
	public void testLaboratorio() {
		Laboratorio lab_prueba = new Laboratorio("001", "Laboratorio de ISO", "01/12/2023", "ESI", "Ordenador personal");
		assertEquals("Ordenador personal", lab_prueba.getEquipoRequerido());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetEquipoRequerido() {
		Laboratorio lab_prueba = new Laboratorio("001", "Laboratorio de ISO", "01/12/2023", "ESI", "Ordenador personal");
		assertEquals("Ordenador personal", lab_prueba.getEquipoRequerido());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testSetEquipoRequerido() {
		Laboratorio lab_prueba = new Laboratorio("001", "Laboratorio de ISO", "01/12/2023", "ESI", "Ordenador personal");
		lab_prueba.setEquipoRequerido("Papel y boli");
		assertEquals("Papel y boli", lab_prueba.getEquipoRequerido());
		//throw new RuntimeException("not yet implemented");
	}

}
