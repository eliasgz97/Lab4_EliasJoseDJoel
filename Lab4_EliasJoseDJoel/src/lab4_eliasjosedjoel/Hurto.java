package lab4_eliasjosedjoel;

public class Hurto extends DMenor{
    private String objeto;
    private double valor;

    public Hurto() {
    }

    public Hurto(String objeto, double valor, String captor, String idCaptor, int celda, String desc, String victima, boolean culpa, String fecha, String pais, int num, String sentencia) {
        super(captor, idCaptor, celda, desc, victima, culpa, fecha, pais, num, sentencia);
        this.objeto = objeto;
        this.valor = valor;
    }
    

    public String getObjeto() {
        return objeto;
    }

    public void setObjeto(String objeto) {
        this.objeto = objeto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "\nObjeto=" + objeto + "\nValor del objeto=" + valor;
    }
    
}
