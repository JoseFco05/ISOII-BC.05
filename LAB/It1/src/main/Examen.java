package ISOII_BC.LAB;

public class Examen extends Evento {
    private String tipoExamen;

    public Examen(String id, String titulo, DateTime fecha, String ubicacion, String tipoExamen) {
        super(id, titulo, fecha, ubicacion);
        this.tipoExamen = tipoExamen;
    }

    public String getTipoExamen() {
        return tipoExamen;
    }

    public void setTipoExamen(String tipoExamen) {
        this.tipoExamen = tipoExamen;
    }
}