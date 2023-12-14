package ISOII_BC.LAB;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class UsuarioTest {

	@Test
	public void testUsuario() {
		Usuario usuario_prueba = new Usuario("001", "1234");
		
		assertEquals("001", usuario_prueba.getIdUsuario());
		assertEquals("1234", usuario_prueba.getContrasena());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetIdUsuario() {
		Usuario usuario_prueba = new Usuario("001", "1234");
		assertEquals("001", usuario_prueba.getIdUsuario());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testSetIdUsuario() {
		Usuario usuario_prueba = new Usuario("001", "1234");
		usuario_prueba.setIdUsuario("002");
		assertEquals("002", usuario_prueba.getIdUsuario());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testGetContrasena() {
		Usuario usuario_prueba = new Usuario("001", "1234");
		assertEquals("1234", usuario_prueba.getContrasena());
		//throw new RuntimeException("not yet implemented");
	}

	@Test
	public void testSetContrasena() {
		Usuario usuario_prueba = new Usuario("001", "1234");
		usuario_prueba.setContrasena("12345");
		assertEquals("12345", usuario_prueba.getContrasena());
		//throw new RuntimeException("not yet implemented");
	}

}
