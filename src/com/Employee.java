package com;

public class Employee {
	{
		System.out.println("Empleado: inicializado (bloque 2)");
	}
	{
		System.out.println("Empleado: inicializado (bloque 1)");
	}

	Employee() {
		this("No name");
	}

	private Employee(String name) {
		this.name = name;
		System.out.println("Empleado: constructor " + name);
		asignarDatos(name);
	}

	String name = "";
	String lastname = "";

	public void asignarDatos(String name) {
		this.name = name + "(metodo 1)";
	}

	public void asignarDatos(String name, String lastname) {
		this.name = name;
		this.lastname = lastname;

		asignarDatos(name);
	}
}