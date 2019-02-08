package lab4_eliasjosedjoel;

public class Delitos {

    private String desc;
    private String victima;
    private boolean culpa;
    private String fecha;
    private String pais;
    private int num;
    public Delitos() {
    }

    public Delitos(String desc, String victima, boolean culpa, String fecha, String pais, int num) {
        this.desc = desc;
        this.victima = victima;
        this.culpa = culpa;
        this.fecha = fecha;
        this.pais = pais;
        this.num = num;
    }

    
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getVictima() {
        return victima;
    }

    public void setVictima(String victima) {
        this.victima = victima;
    }

    public boolean isCulpa() {
        return culpa;
    }

    public void setCulpa(boolean culpa) {
        this.culpa = culpa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        String b;
        if (culpa){
            b="Sí";
        } else {
            b="No";
        }
        
        return "\nDescripcion=" + desc + "\nVictima=" + victima + "\nCulpable=" + b + "\nFecha=" + fecha + "\nPais=" + pais + "\nNumero=" + num;
    }
    
    
}

