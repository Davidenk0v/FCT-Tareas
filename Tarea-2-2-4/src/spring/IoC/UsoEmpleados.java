package spring.IoC;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Creación de objetos de tipo Empleado
		
		Empleados empleado1 = new DirectorEmpleado();
		
		
		
		//Uso de los objetos creados
		
		System.out.println(empleado1.getTareas());
	}

}
