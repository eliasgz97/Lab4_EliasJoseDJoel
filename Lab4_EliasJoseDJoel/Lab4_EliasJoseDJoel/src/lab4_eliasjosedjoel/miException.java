package lab4_eliasjosedjoel;

public class miException extends Exception{

    public miException(String mensaje) {
        super(mensaje);
    }

    public miException() {
        super();
    }

    @Override
    public String toString() {
        return "miException{" + '}';
    }
    
}
