package lab4_eliasjosedjoel;

class Asesino extends Agentes{
    private String nombrevic;
    private String arma;

    public Asesino(String nombrevic, String arma) {
        this.nombrevic = nombrevic;
        this.arma = arma;
    }

    public Asesino(String nombrevic, String arma, String nombre, int edad, String genero, String pais, boolean encarcelado, String descripcion) {
        super(nombre, edad, genero, pais, encarcelado, descripcion);
        this.nombrevic = nombrevic;
        this.arma = arma;
    }

    public String getNombrevic() {
        return nombrevic;
    }

    public void setNombrevic(String nombrevic) {
        this.nombrevic = nombrevic;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Asesino{" + "nombrevic=" + nombrevic + ", arma=" + arma + '}';
    }

    @Override
    public void cometerdelito() {
        System.out.println("Asesinato concretado fatalmente");
    }
    
}	

