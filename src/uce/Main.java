package com.uce;

public class Main {

	public static void main(String[] args) {
		
		//Apuntan al mismo de memoria en el String pool
		String prefijo1= "Alerta";
		String prefijo2= "Alerta";
		
		//Objeto inmutable innecesario por redundancia de objeto
		String prefijo3= new String ("Alerta");
		prefijo3.concat("Roja");
		
        //Esto no genera espacio en memoria y solo imprime
		System.out.println("Esta es una prueba de Strings");

		System.out.println(prefijo1 + prefijo2);
		System.out.println(prefijo1 + " " + prefijo2);

		System.out.println( prefijo1 == prefijo3);
	
		String log =" ";
		log = "Evento";
		for (int i=0; i<100000;i++) {
			log=log ;
		}
		
		String prefijo5= new String ("Alerta");
		prefijo5.concat(" ");
		prefijo5.concat("Roja");
		System.out.println(prefijo5);
		
		Empleado emp = new Empleado("Jaime", "Vargas");
		
		StringBuilder logBuilder = new StringBuilder("Alerta");
		
		logBuilder.append(" ");
		logBuilder.append("roja");
		logBuilder.append(" ");
		logBuilder.append(emp);
		logBuilder.insert(14, "Empleado :" );
		
		System.out.println(logBuilder);
		
		logBuilder.delete(15, 25);
		System.out.println(logBuilder);
		
		logBuilder.reverse();
		System.out.println(logBuilder);

		
		
		

		
		
	}

}
