package lab4_eliasjosedjoel;

public abstract class Agentes extends Criminales implements CometerDelito{

    public Agentes(String nombre, int edad, String genero, String pais, boolean encarcelado, String descripcion) {
        super(nombre, edad, genero, pais, encarcelado, descripcion);
        encarcelado = false;
    }

    public Agentes() {
    }

    @Override
    public abstract void cometerdelito();
    

}


