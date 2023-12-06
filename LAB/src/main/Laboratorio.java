package ISOII_BC.LAB;

public class Laboratorio extends Evento {
    private String equipoRequerido;

    public Laboratorio(String id, String titulo, String fecha, String ubicacion, String equipoRequerido) {
        super(id, titulo, fecha, ubicacion);
        this.equipoRequerido = equipoRequerido;
    }

    public String getEquipoRequerido() {
        return equipoRequerido;
    }

    public void setEquipoRequerido(String equipoRequerido) {
        this.equipoRequerido = equipoRequerido;
    }
}