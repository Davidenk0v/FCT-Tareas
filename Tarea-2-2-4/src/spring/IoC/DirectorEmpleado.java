package spring.IoC;

public class DirectorEmpleado implements Empleados {

	//Creación de campo tipo CreaciónInforme (interfaz)
	

	private CreacionInformes informeNuevo;
	
	//Creación de constructor que injecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el Director: " + informeNuevo.getInforme();
	}

}
