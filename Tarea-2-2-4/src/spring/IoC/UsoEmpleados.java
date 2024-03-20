package spring.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Creación de objetos de tipo Empleado
		
		//Empleados empleado1 = new DirectorEmpleado();
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//DirectorEmpleado Juan = context.getBean("miEmpleado", DirectorEmpleado.class);
//		//Uso de los objetos creados
//		
//		System.out.println(Juan.getTareas());
//		System.out.println(Juan.getInforme());
//		System.out.println(Juan.getEmail());
//		System.out.println(Juan.getNombreEmpresa());
//		
		
		 SecretarioEmpleado Maria = context.getBean("secretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Pablo = context.getBean("secretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(Maria.getTareas());
		
		System.out.println("Email: " + Maria.getEmail());
		System.out.println(Maria.getNombreEmpresa());
		
		System.out.println("Email: " + Pablo.getEmail());
		System.out.println(Pablo.getNombreEmpresa());
		
		
		
		context.close();
	}

}
