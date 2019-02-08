package lab4_eliasjosedjoel;

public class TraficoDrogas extends DGrave{
    private String droga;
    private double cant;

    public TraficoDrogas(String droga, double cant) {
        this.droga = droga;
        this.cant = cant;
    }

    public TraficoDrogas(String desc, String victima, boolean culpa, String fecha, String pais, int num, String sentencia) {
        super(desc, victima, culpa, fecha, pais, num, sentencia);
    }

    public TraficoDrogas(int gravedad) {
        super(gravedad);
    }

    public TraficoDrogas() {
    }

    public String getDroga() {
        return droga;
    }

    public void setDroga(String droga) {
        this.droga = droga;
    }

    public double getCant() {
        return cant;
    }

    public void setCant(double cant) {
        this.cant = cant;
    }

    @Override
    public String toString() {
        return "\nTipo de Droga=" + droga + "\nCantidad (gramos)=" + cant;
    }
    
}
