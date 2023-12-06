package ISOII_BC.LAB;

public class Clase extends Evento {
    private String asignatura;
    private String grupo;

    public Clase(String id, String titulo, String fecha, String ubicacion, String asignatura, String grupo) {
        super(id, titulo, fecha, ubicacion);
        this.asignatura = asignatura;
        this.grupo = grupo;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
}