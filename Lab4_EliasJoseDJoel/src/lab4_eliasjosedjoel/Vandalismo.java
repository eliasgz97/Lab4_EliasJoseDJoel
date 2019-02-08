package lab4_eliasjosedjoel;

public class Vandalismo extends DMenor{
    private String lugar;
    private int pisos;
    private String dueño;

    public Vandalismo(String lugar, int pisos, String dueño, String captor, String idCaptor, int celda, String desc, String victima, boolean culpa, String fecha, String pais, int num, String sentencia) {
        super(captor, idCaptor, celda, desc, victima, culpa, fecha, pais, num, sentencia);
        this.lugar = lugar;
        this.pisos = pisos;
        this.dueño = dueño;
    }

    
    public Vandalismo() {
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }

    @Override
    public String toString() {
        return "\nLugar=" + lugar + "\nPisos=" + pisos + "\nDueno=" + dueño;
    }
    
}
