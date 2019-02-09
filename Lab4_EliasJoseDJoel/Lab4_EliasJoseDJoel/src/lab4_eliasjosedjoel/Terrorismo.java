package lab4_eliasjosedjoel;

public class Terrorismo extends DGrave{
    private String artefacto;
    private int victimas;

    public Terrorismo() {
    }

    public Terrorismo(String artefacto, int victimas) {
        this.artefacto = artefacto;
        this.victimas = victimas;
    }

    public Terrorismo(String desc, String victima, boolean culpa, String fecha, String pais, int num, String sentencia) {
        super(desc, victima, culpa, fecha, pais, num, sentencia);
    }

    public Terrorismo(int gravedad) {
        super(gravedad);
    }

    public String getArtefacto() {
        return artefacto;
    }

    public void setArtefacto(String artefacto) {
        this.artefacto = artefacto;
    }

    public int getVictimas() {
        return victimas;
    }

    public void setVictimas(int victimas) {
        this.victimas = victimas;
    }

    @Override
    public String toString() {
        return "\nArtefacto utilizado=" + artefacto + "\nVictimas=" + victimas;
    }
    
}
