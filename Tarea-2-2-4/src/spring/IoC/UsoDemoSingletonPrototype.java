package spring.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Carga de XML de configuración
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext1.xml");
		
		//Petición de Beans al contenedor Spring
		 SecretarioEmpleado Maria = context.getBean("secretarioEmpleado", SecretarioEmpleado.class);
		 SecretarioEmpleado Pablo = context.getBean("secretarioEmpleado", SecretarioEmpleado.class);
		 System.out.println(Maria);
		 System.out.println(Pablo);
		 
		 if(Maria == Pablo) System.out.println("Apuntan al mismo objeto");
		 else System.out.println("No se trata del mismo objeto");
	}
}
