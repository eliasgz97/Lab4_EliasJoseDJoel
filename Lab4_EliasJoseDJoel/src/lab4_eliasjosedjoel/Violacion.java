package lab4_eliasjosedjoel;

public class Violacion extends DGrave {

    public int edadVictima;

    public Violacion() {
    }

    public Violacion(String desc, String victima, boolean culpa, String fecha, String pais, int num, String sentencia) {
        super(desc, victima, culpa, fecha, pais, num, sentencia);
    }

    public Violacion(int gravedad) {
        super(gravedad);
    }

    public int getEdadVictima() {
        return edadVictima;
    }

    public void setEdadVictima(int edadVictima) {
        this.edadVictima = edadVictima;
    }
    @Override
    public String toString() {
        return "\nEdad de la victima=" + edadVictima;
    }
}
