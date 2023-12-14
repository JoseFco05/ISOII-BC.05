package ISOII_BC.LAB;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;


class ClaseTest {

	@Test
	public void testClase() {
		Clase clase_prueba = new Clase("001", "El futuro del software", "01/12/2023", "Sala de conferencias", "Ingeniería del software", "1A");
		
		assertEquals("001", clase_prueba.getId());
        assertEquals("El futuro del software", clase_prueba.getTitulo());
        assertEquals("01/12/2023", clase_prueba.getFecha());
        assertEquals("Sala de conferencias", clase_prueba.getUbicacion());
        assertEquals("Ingeniería del software", clase_prueba.getAsignatura());
        assertEquals("1A", clase_prueba.getGrupo());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetAsignatura() {
		Clase clase_prueba = new Clase("001", "El futuro del software", "01/12/2023", "Sala de conferencias", "Ingenieria del software", "1A");
		assertEquals("Ingenieria del software", clase_prueba.getAsignatura());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testSetAsignatura() {
		Clase clase_prueba = new Clase("001", "El futuro del software", "01/12/2023", "Sala de conferencias", "Ingeniería del software", "1A");
		clase_prueba.setAsignatura("Diseño de software");
		assertEquals("Diseño de software", clase_prueba.getAsignatura());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetGrupo() {
		Clase clase_prueba = new Clase("001", "El futuro del software", "01/12/2023", "Sala de conferencias", "Ingeniería del software", "1A");
		assertEquals("1A", clase_prueba.getGrupo());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testSetGrupo() {
		Clase clase_prueba = new Clase("001", "El futuro del software", "01/12/2023", "Sala de conferencias", "Ingeniería del software", "1A");
		clase_prueba.setGrupo("4CO");
		assertEquals("4CO", clase_prueba.getGrupo());
		//throw new RuntimeException("not yet implemented");
	}

}
