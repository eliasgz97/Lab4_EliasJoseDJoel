package lab4_eliasjosedjoel;

public class DGrave extends Delitos {

    private int gravedad;
    private String sentencia;

    public DGrave() {
    }

    public DGrave(String desc, String victima, boolean culpa, String fecha, String pais, int num, String sentencia) {
        super(desc, victima, culpa, fecha, pais, num);
    }

    public DGrave(int gravedad, String desc, String victima, boolean culpa, String fecha, String pais, int num) {
        super(desc, victima, culpa, fecha, pais, num);
        this.gravedad = gravedad;
    }
    
    public DGrave(int gravedad) {
        this.gravedad = gravedad;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        if (gravedad <= 5 || gravedad >= 1) {
            this.gravedad = gravedad;
        } else {
            System.out.println("La escala es sólo de 1 a 5");
        }

    }

    @Override
    public String toString() {
        return "\nGravedad=" + gravedad;
    }

}

