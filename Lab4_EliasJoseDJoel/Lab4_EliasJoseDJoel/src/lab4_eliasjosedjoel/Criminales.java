package lab4_eliasjosedjoel;

import java.util.ArrayList;

public class Criminales {
    private ArrayList<Delitos> delitos = new ArrayList();
    private String nombre;
    private int edad;
    private String genero;
    private String pais;
    private boolean encarcelado;
    private String descripcion;
 
    public Criminales() {
    }

    public Criminales(String nombre, int edad, String genero, String pais, boolean encarcelado, String descripcion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.pais = pais;
        this.encarcelado = encarcelado;
        this.descripcion = descripcion;
    }

    public ArrayList<Delitos> getDelitos() {
        return delitos;
    }

    public void setDelitos(ArrayList<Delitos> delitos) {
        this.delitos = delitos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isEncarcelado() {
        return encarcelado;
    }

    public void setEncarcelado(boolean encarcelado) {
        this.encarcelado = encarcelado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Criminal{" + "delitos=" + delitos + ", nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", pais=" + pais + ", encarcelado=" + encarcelado + ", descripcion=" + descripcion + '}';
    }
    
}
    

