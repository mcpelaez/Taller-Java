
public class reservas {
	
	//1-definir atributos
	double cedula;
	String tipoHabitacion;
	String nombres;
	String apellidos;
	String fechaIngreso;
	String fechaSalida;
	double precio;


		
	
//2 Definir el constructor de la clase
	reservas (double cedula,String tipoHabitacion, String nombres, String apellidos,String fechaIngreso,String fechaSalida, double precio){
	this.cedula = cedula;
	this.tipoHabitacion = tipoHabitacion;
	this.nombres = nombres;
	this.apellidos = apellidos;
	this.fechaIngreso = fechaIngreso;
	this.fechaSalida = fechaSalida;
	this.precio = precio;

	}

	//3 Metodos Set 
	
	public void setCedula(double cedula) {
		this.cedula = cedula;
	}
	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public void setapellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public void setfechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}
	public void setApellidos(double precio) {
		this.precio = precio;
	}
	
	//definir los metodos get.permitir obtener
	// el get inicia con tipo de datos
	public double getCedula(double cedula ) {
		return this.cedula;
	}
	public String gettipoHabitacion( String tipoHabitacion) {
		return this.tipoHabitacion;
	}
	public String getNombres( String nombres) {
		return this.nombres;
	}
	public String getApellidos( String apellidos) {
		return this.apellidos;
	}
	public String getIngreso( String fechaIngreso) {
		return this.fechaIngreso;
	}
	public String getfechaSalida( String fechaSalida) {
		return this.fechaSalida;
	}
	public double getPrecio( double precio) {
		return this.precio;
	}
	//agraegar otros metodos
	public void registrarReserva() {
		System.out.println("la reserva se registro existosamente ");
	}
	public void consultarReserva() {
		System.out.println("La Reserva se Consulto existosamente ");
	}
	public void actualizarReserva() {
		System.out.println("la Reserva se actualizo correctamente ");
	}
	public void cambiarEstadoReserva() {
		System.out.println("El estado de la Reserva se cambio de estado correctamente ");
	}
	
@Override
public String toString () {
	return "reserva:\n cedula:" + this.cedula + "\ntipoHabitacion: " +this.tipoHabitacion + 
			"\nnombres: " +this.nombres+ "\napellidos: " + this.apellidos + 
			"\nfechaIngreso: " +this.fechaIngreso+ "\nfechaSalida: " + this.fechaSalida +"\nprecio: " + this.precio ;
}

}


