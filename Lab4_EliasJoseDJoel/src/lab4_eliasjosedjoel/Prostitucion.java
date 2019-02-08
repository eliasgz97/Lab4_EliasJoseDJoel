package lab4_eliasjosedjoel;

public class Prostitucion extends DMenor{
    private String solicitante;

    public Prostitucion() {
    }

    public Prostitucion(String solicitante, String captor, String idCaptor, int celda, String desc, String victima, boolean culpa, String fecha, String pais, int num, String sentencia) {
        super(captor, idCaptor, celda, desc, victima, culpa, fecha, pais, num, sentencia);
        this.solicitante = solicitante;
    }
    
    public Prostitucion(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    @Override
    public String toString() {
        return "\nSolicitante=" + solicitante;
    }
    
}



