package tallerClase;


public class notas {
    private String documento;
    private String asignatura;
    private double nota40;
    private double nota60;

    public notas(String documento, String asignatura, double nota40, double nota60) {
        this.documento = documento;
        this.asignatura = asignatura;
        this.nota40 = nota40;
        this.nota60 = nota60;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public double getNota40() {
        return nota40;
    }

    public void setNota40(double nota40) {
        this.nota40 = nota40;
    }

    public double getNota60() {
        return nota60;
    }

    public void setNota60(double nota60) {
        this.nota60 = nota60;
    }

    public double NotaFinal() {
        return this.nota60 * 0.6 + this.nota40 * 0.4;
    }

    public String evaluarAprobacion() {
    	if(NotaFinal() >= 3.0) {
    		return "Aprobo" ;
    	}else {
    		return "No aprobo";
    	}
//        return (NotaFinal() >= 3) ? "Aprobado" : "Reprobado";
    }

    @Override
    public String toString() {
        return "Documento: " + documento + "\n Asignatura: " + asignatura + " \nNota Final: " + NotaFinal();
    }
}

	
