package ISOII_BC.LAB;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;


class EventoTest {

	@Test
	public void testEvento() {
		Evento evento_prueba = new Evento("001", "El futuro del software", "01/12/2023", "ESI");
		
		assertEquals("001", evento_prueba.getId());
		assertEquals("El futuro del software", evento_prueba.getTitulo());
		assertEquals("01/12/2023", evento_prueba.getFecha());
		assertEquals("ESI", evento_prueba.getUbicacion());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetId() {
		Evento evento_prueba = new Evento("001", "El futuro del software", "01/12/2023", "ESI");
		assertEquals("001", evento_prueba.getId());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testSetId() {
		Evento evento_prueba = new Evento("001", "El futuro del software", "01/12/2023", "ESI");
		evento_prueba.setId("002");
		assertEquals("002", evento_prueba.getId());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetTitulo() {
		Evento evento_prueba = new Evento("001", "El futuro del software", "01/12/2023", "ESI");
		assertEquals("El futuro del software", evento_prueba.getTitulo());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testSetTitulo() {
		Evento evento_prueba = new Evento("001", "El futuro del software", "01/12/2023", "ESI");
		evento_prueba.setTitulo("El futuro del desarrollo");
		assertEquals("El futuro del desarrollo", evento_prueba.getTitulo());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetFecha() {
		Evento evento_prueba = new Evento("001", "El futuro del software", "01/12/2023", "ESI");
		assertEquals("01/12/2023", evento_prueba.getFecha());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testSetFecha() {
		Evento evento_prueba = new Evento("001", "El futuro del software", "01/12/2023", "ESI");
		evento_prueba.setFecha("02/12/2023");
		assertEquals("02/12/2023", evento_prueba.getFecha());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetUbicacion() {
		Evento evento_prueba = new Evento("001", "El futuro del software", "01/12/2023", "ESI");
		assertEquals("ESI", evento_prueba.getUbicacion());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testSetUbicacion() {
		Evento evento_prueba = new Evento("001", "El futuro del software", "01/12/2023", "ESI");
		evento_prueba.setUbicacion("Edificio Fermin Caballero");
		assertEquals("Edificio Fermin Caballero", evento_prueba.getUbicacion());
		//throw new RuntimeException("not yet implemented");
	}

}
