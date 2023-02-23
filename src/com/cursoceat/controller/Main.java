package com.cursoceat.controller;

import java.nio.channels.NonWritableChannelException;
import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//mi objeto 1-> miCita
		System.out.print("Indique el nombre-> ");
		String nombre=new Scanner(System.in).nextLine();
		System.out.print("Indique el DNI-> ");
		String midni=new Scanner(System.in).nextLine();
		CuentaCorriente miCita=new CuentaCorriente(nombre,midni);
		//preguntamos el importe a ingresar
		System.out.print("Cuanto quieres ingresar-> ");
		double miIngreso=new Scanner(System.in).nextDouble();
		//actualizar el saldo segun el importe a ingrasar
		miCita.ingreso(miIngreso);
		//Pregunto el nombre del banco
		System.out.print("Nombre del Banco ");
		CuentaCorriente.setNombreBanco(new Scanner(System.in).nextLine());
		//preguntamos importe a retirar
		System.out.print("Cuanto quieres retirar-> ");
		double miEgreso=new Scanner(System.in).nextDouble();
		//actualizar el saldo segun el importe retirado
		miCita.egreso(miEgreso);
		//creamos el gestir 1
		Gestor miGestor1=new Gestor("Jose Luis Valcarcel", "745123154");
		miCita.miGestor=miGestor1;
	
		//Mostramos informacion
		
		miCita.mostrarInformacion();
		
		//creo mi objeto 2 -> miCita2
		System.out.println("********** Creo Objeto 2 **********");
		System.out.print("Indique el DNI-> ");
		midni=new Scanner(System.in).nextLine();
		System.out.println("Intique el Saldo Inicial al crear la cta-> ");
		Double saldoInicial=new Scanner(System.in).nextDouble();
		CuentaCorriente miCita2=new CuentaCorriente(midni, saldoInicial);//llama al constructor
		System.out.print("Indique el nombre-> ");
		miCita2.nombre=new Scanner(System.in).nextLine();//llamar
		//Creo mi gestor 2
		Gestor miGestor2=new Gestor("Beatriz López", "625417845");
		miCita2.miGestor=miGestor2;
	
		System.out.println("Datos de la cuenta 1");
		miCita.mostrarInformacion();
		System.out.println("Datos de la cuenta 2");
		miCita2.mostrarInformacion();
		
		
		
		
		

	}

}
