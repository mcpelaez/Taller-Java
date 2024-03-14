// Vehiculo.java
public class Vehiculo {
    private boolean detenido;
    private int velocidad;

    public Vehiculo() {
        this.detenido = true;
        this.velocidad = 0;
    }

    public void acelerar(int aumento) {
        if (detenido) {
            detenido = false;
        }
        velocidad += aumento;
    }

    public void detener() {
        velocidad = 0;
        detenido = true;
    }

    public boolean isDetenido() {
        return detenido;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return "Vehículo: Detenido = " + detenido + ", Velocidad = " + velocidad;
    }
}
