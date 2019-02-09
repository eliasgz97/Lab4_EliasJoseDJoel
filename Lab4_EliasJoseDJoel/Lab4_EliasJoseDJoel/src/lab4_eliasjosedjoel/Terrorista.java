package lab4_eliasjosedjoel;

public class Terrorista extends Agentes{
    private String paisataque;
    private String ciudad;
    private String metodo;

    public Terrorista(String paisataque, String ciudad, String metodo, String nombre, int edad, String genero, String pais, boolean encarcelado, String descripcion) {
        super(nombre, edad, genero, pais, encarcelado, descripcion);
        this.paisataque = paisataque;
        this.ciudad = ciudad;
        this.metodo = metodo;
    }

    public Terrorista(String paisataque, String ciudad, String metodo) {
        this.paisataque = paisataque;
        this.ciudad = ciudad;
        this.metodo = metodo;
    }

    public String getPaisataque() {
        return paisataque;
    }

    public void setPaisataque(String paisataque) {
        this.paisataque = paisataque;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    @Override
    public String toString() {
        return "Terrorista{" + "paisataque=" + paisataque + ", ciudad=" + ciudad + ", metodo=" + metodo + '}';
    }

    @Override
    public void cometerdelito() {
        System.out.println("Acto terrorista impactante realizado");
    }
    
}
