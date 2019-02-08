package lab4_eliasjosedjoel;

import java.util.ArrayList;

public class Policias {

    private String nombre;
    private int id;
    private int edad;
    private ArrayList<Criminales> capturados = new ArrayList();

    public Policias(String nombre, int id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
    }

    public Policias() {
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Criminales> getCapturados() {
        return capturados;
    }

    public void setCapturados(ArrayList<Criminales> capturados) {
        this.capturados = capturados;
    }

    @Override
    public String toString() {
        return "Policias{" + "nombre=" + nombre + ", id=" + id + ", edad=" + edad + ", capturados=" + capturados + '}';
    }
    

}
