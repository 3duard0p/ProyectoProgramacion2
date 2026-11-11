package com.uce;

public class Empleado {
	
	private String nombre;
	private String apellido;
	
	Empleado(String nombre, String apellido){
		this.apellido = apellido;
		this.nombre = nombre;
	}
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	public void setApellido (String apellido) {
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

}
