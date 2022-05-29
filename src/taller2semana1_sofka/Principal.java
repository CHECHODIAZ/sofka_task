package taller2semana1_sofka;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		NaveEspacial naveEspacial;
		NaveEspacialNoTripulada noTripulada;
		NaveEspacialTripulada Tripulada;
		
		System.out.println(1+" - NAVES DE LA NASA");
		System.out.println(2+" - NAVES DE LA ESA");
		System.out.println(3+" - NAVES CHINAS");
		System.out.println(4+" - NAVES RUSAS");
		System.out.println("CUALQUIER OTRA TECLA NUMERICA PARA SALIR");
		Scanner teclado = new Scanner(System.in);
		Boolean accion = true;
		
		while(accion) {
			int nave = teclado.nextInt();
			if(nave == 1) {
				naveEspacial = new NaveNasa(200F);
				Tripulada = new NaveNasa(100F);
				naveEspacial.volar();
				Tripulada.acelerar();
				Tripulada.orbitar();
				Tripulada.disparar();
			}else if(nave == 2) {
				naveEspacial = new NaveEsa(0f);
				Tripulada = new NaveEsa(0f);
				naveEspacial.volar();
				Tripulada.acelerar();
				Tripulada.orbitar();
				Tripulada.disparar();
				Tripulada.aterrizar();
			}else if(nave == 3) {
				naveEspacial = new NaveChina(0F);
				noTripulada = new NaveChina(0F);
				naveEspacial.volar();
				noTripulada.acelerar();
				noTripulada.orbitar();
				noTripulada.disparar();
			}else if(nave == 4) {
				naveEspacial = new NaveRusa(200F);
				noTripulada = new NaveRusa(100F);
				naveEspacial.volar();
				noTripulada.acelerar();
				noTripulada.orbitar();
				noTripulada.disparar();
				noTripulada.aterrizar();
			}else{
				teclado.close();
				System.out.println("Terminado");
				accion = false;
				break;
			}
		}
	}

}
