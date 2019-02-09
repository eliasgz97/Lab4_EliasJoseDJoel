package lab4_eliasjosedjoel;

public class DMenor extends Delitos {

    private String captor;
    private String idCaptor;
    private int celda;
    private String sentencia;

    public DMenor() {
    }

    public DMenor(String captor, String idCaptor, int celda, String desc, String victima, boolean culpa, String fecha, String pais, int num, String sentencia) {
        super(desc, victima, culpa, fecha, pais, num);
        this.captor = captor;
        this.idCaptor = idCaptor;
        this.celda = celda;
    }

    public DMenor(String desc, String victima, boolean culpa, String fecha, String pais, int num, String sentencia) {
        super(desc, victima, culpa, fecha, pais, num);
    }

    public String getSentencia() {
        return sentencia;
    }

    public void setSentencia(String sentencia) {
        this.sentencia = sentencia;
    }

    public DMenor( String desc, String victima, boolean culpa, String fecha, String pais, int num) {
        super(desc, victima, culpa, fecha, pais, num);
      
    }
    

    public String getCaptor() {
        return captor;
    }

    public void setCaptor(String captor) {
        this.captor = captor;
    }

    public String getIdCaptor() {
        return idCaptor;
    }

    public void setIdCaptor(String idCaptor) {
        this.idCaptor = idCaptor;
    }

    public int getCelda() {
        return celda;
    }

    public void setCelda(int celda) {
        this.celda = celda;
    }

    @Override
    public String toString() {
        return "\nCaptor=" + captor + "\nID del Captor=" + idCaptor + "\nNumero de celda=" + celda;
    }

}
