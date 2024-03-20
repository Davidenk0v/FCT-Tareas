package spring.IoC;

public class DirectorEmpleado implements Empleados {

	//Creación de campo tipo CreaciónInforme (interfaz)
	

	private CreacionInformes informeNuevo;
	
	private String email;
	
	private String nombreEmpresa;
	
	public CreacionInformes getInformeNuevo() {
		return informeNuevo;
	}
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
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
	
	//Metodo Init: Ejecutar tareas antes de que el beans esté disponible
	
	public void init() {
		System.out.println("Dentro del método Init. Aquí irían las tarejas a ejecutar antes de utilizar el beans");
	}
	
	//Metodo destroy: Ejecutar tareas después de que el bean haya sido utilizado
	
	public void destroy() {
		System.out.println("Dentro del método Destroy. Aquí irían las tarejas a ejecutar despues de utilizar el beans");
	}

}
