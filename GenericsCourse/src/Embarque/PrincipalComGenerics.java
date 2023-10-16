package Embarque;
import java.util.Scanner;

import Controle.Aeronaves;
import Controle.AeronavesComGenerics;

/*
 * Informar a quantidade de aeronaves no patio, o nr dos voos por ordem de chegada. 
 * A ordem de decolagem FIFO(fly-in/fly-out), o primeiro que entra e o primeiro que sai. 
 * Mostrar qual o primeiro voo a decolar
 */
public class PrincipalComGenerics {

	public static void main(String[] args) {
		//Informando a quantidade de Aeronaves no patio
		Scanner sc = new Scanner(System.in) ;
		AeronavesComGenerics<String> air = new AeronavesComGenerics<>();
		System.out.println("Informe o nr de aeronaves");
		int nrAeronaves = sc.nextInt();
		
		// adicionando voos
		for (int i = 0; i < nrAeronaves; i++) {
			String nrVoo = sc.next();
			air.addVoo(nrVoo);
		}
		air.primeiroVoo();
		String x = (String) air.primeiroVoo();
		System.out.println("O primeiro a decolar e o voo :" + x);
		air.listaVoos();
		sc.close();
	}
}