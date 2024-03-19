package spring.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Creación de objetos de tipo Empleado
		
		//Empleados empleado1 = new DirectorEmpleado();
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		Empleados Juan = context.getBean("miEmpleado", Empleados.class);
		//Uso de los objetos creados
		
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		context.close();
	}

}
