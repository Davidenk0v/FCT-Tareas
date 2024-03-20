package spring.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Cargar XML de configuración
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//Obtención del bean
		
		Empleados Juan = context.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Juan.getInforme());
		
		//Cerrar el contexto
		context.close();
	}

}
