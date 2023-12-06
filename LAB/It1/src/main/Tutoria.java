package ISOII_BC.LAB;

public class Tutoria extends Evento {
    private String tipo;

    public Tutoria(String id, String titulo, DateTime fecha, String ubicacion, String tipo) {
        super(id, titulo, fecha, ubicacion);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}