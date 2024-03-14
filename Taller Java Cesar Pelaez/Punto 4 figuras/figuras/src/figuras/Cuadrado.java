package figuras;

public class Cuadrado {
   double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    
    public void setLado(double lado) {
    	this.lado = lado;
    }

    public double getLado() {
        return lado;
    }


    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}
