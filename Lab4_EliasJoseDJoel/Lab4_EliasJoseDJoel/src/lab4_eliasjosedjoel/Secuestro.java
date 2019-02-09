package lab4_eliasjosedjoel;

public class Secuestro extends DGrave {

    public String tiempoRetenido;
    public boolean estado;

    public Secuestro() {
    }

    public Secuestro(String desc, String victima, boolean culpa, String fecha, String pais, int num, String sentencia) {
        super(desc, victima, culpa, fecha, pais, num, sentencia);
    }

    public Secuestro(int gravedad) {
        super(gravedad);
    }

    public Secuestro(String tiempoRetenido, boolean estado) {
        this.tiempoRetenido = tiempoRetenido;
        this.estado = estado;
    }

    public String getTiempoRetenido() {
        return tiempoRetenido;
    }

    public void setTiempoRetenido(String tiempoRetenido) {
        this.tiempoRetenido = tiempoRetenido;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        String b;
        if (estado) {
            b = "vivo";
        } else {
            b = "muerto";
        }
        return "\nTiempo retenido=" + tiempoRetenido + "\nEstado de entrega del retenido=" + b;
    }

}

