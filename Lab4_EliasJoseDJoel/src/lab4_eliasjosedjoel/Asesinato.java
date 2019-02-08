package lab4_eliasjosedjoel;

public class Asesinato extends DGrave{
    public String arma;
    public int cuerpos;

    public Asesinato() {
    }

    public Asesinato(String arma, int cuerpos) {
        this.arma = arma;
        this.cuerpos = cuerpos;
    }

    public Asesinato(String desc, String victima, boolean culpa, String fecha, String pais, int num, String sentencia) {
        super(desc, victima, culpa, fecha, pais, num, sentencia);
    }

    public Asesinato(int gravedad) {
        super(gravedad);
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getCuerpos() {
        return cuerpos;
    }

    public void setCuerpos(int cuerpos) {
        this.cuerpos = cuerpos;
    }

    @Override
    public String toString() {
        return "\nArma Utilizada=" + arma + "\nNumero de cuerpos=" + cuerpos;
    }
    
    
}

