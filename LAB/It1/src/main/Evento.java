package ISOII_BC.LAB;

public class Evento {
    private String id;
    private String titulo;
    private String fecha;
    private String ubicacion;

    public Evento(String id, String titulo, String fecha, String ubicacion) {
        this.id = id;
        this.titulo = titulo;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}