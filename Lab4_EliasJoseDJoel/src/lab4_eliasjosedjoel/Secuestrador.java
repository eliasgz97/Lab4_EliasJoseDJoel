package lab4_eliasjosedjoel;

class Secuestrador extends Agentes{
    private String nombrevic;
    private double rescate;

    public Secuestrador(String nombrevic, double rescate, String nombre, int edad, String genero, String pais, boolean encarcelado, String descripcion) {
        super(nombre, edad, genero, pais, encarcelado, descripcion);
        this.nombrevic = nombrevic;
        this.rescate = rescate;
    }

    public Secuestrador(String nombrevic, double rescate) {
        this.nombrevic = nombrevic;
        this.rescate = rescate;
    }

    public Secuestrador() {
    }

    public String getNombrevic() {
        return nombrevic;
    }

    public void setNombrevic(String nombrevic) {
        this.nombrevic = nombrevic;
    }

    public double getRescate() {
        return rescate;
    }

    public void setRescate(double rescate) {
        this.rescate = rescate;
    }

    @Override
    public String toString() {
        return "Secuestrador{" + "nombrevic=" + nombrevic + ", rescate=" + rescate + '}';
    }

    @Override
    public void cometerdelito() {
        System.out.println("Secuestro realizado");
    }
    
}
