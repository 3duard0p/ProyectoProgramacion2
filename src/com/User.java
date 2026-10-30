package com;

public class User {
	{
		System.out.println("ola :3");
	}
	String nombre = "";
	String apellido = "";
	String cedula = "";
	String servicio = "";
	int turnoAsignado;

	static int nTurno = 0;

	public User() {
		turnoAsignado = nTurno;
		System.out.println(turnoAsignado);
	}

	public String generarServicio(String servi) {
		servicio = servi;
		nTurno = nTurno + 1;
		turnoAsignado = nTurno;
		return servicio + turnoAsignado;
	}

	public String ingresarDatosUser(String nom, String apell, String cedu) {
		nombre = nom;
		apellido = apell;
		cedula = cedu;
		return (nombre + apellido + cedula);
	}

	public void imprimirInfo() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Cedula: " + cedula);
		System.out.println("Servicio deseado: " + servicio);
		System.out.println("Su turno asignado es: " + turnoAsignado);
	}

	public int asignarCubiculo(int CubDesocupado) {
		return CubDesocupado;
	}
}