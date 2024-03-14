package tallerClase2;



public class conversor {
    private double cantidadPesos;

    public conversor(double cantidadPesos) {
        this.cantidadPesos = cantidadPesos;
    }

   
    public void setCantidadPesos(double cantidadPesos) {
        this.cantidadPesos = cantidadPesos;
    }
    public double getCantidadPesos() {
        return cantidadPesos;
    }
    public double convertirDolares() {
        return cantidadPesos / 3944; // Tasa de cambio aproximada
    }

    public double convertirEuros() {
        return cantidadPesos / 4282; // Tasa de cambio aproximada
    }

    @Override
    public String toString() {
        return "Cantidad de pesos colombianos: " + cantidadPesos;
    }
}
