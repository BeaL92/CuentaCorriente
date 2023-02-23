package com.cursoceat.controller;

public class Gestor {
	
	public String nombreGestor;
	private String telefono;
	double importeMax;

	//Contructror con todos los atributos
	public Gestor(String nombreGestor, String telefono, double importeMax) {
	this.nombreGestor = nombreGestor;
	this.telefono = telefono;
	this.importeMax = importeMax;

}
	//Contructror con solo nombre y telefono
	public Gestor(String nombreGestor, String telefono) {
		this.nombreGestor = nombreGestor;
		this.telefono = telefono;
		this.importeMax=1000;
	}
	//metodo getter solo para consultar el telefono
	public String getTelefono() {
		return telefono;
	}
	
	void mostrarInfoGestor() {
		System.out.println("Nombre -> "+this.nombreGestor+ "\nTeléfono -> "+this.telefono+
				"\nImporte"+this.importeMax+ "€");
	}
	
	
	

}
