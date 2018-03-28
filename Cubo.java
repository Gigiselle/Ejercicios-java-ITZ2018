package modelo;

import java.util.Scanner;

public class Cubo extends Cuadro{
	
	
	public static void main (String [] args){
		Cuadro cuadro= new Cuadro();
		Cubo cubo= new Cubo();
		int op=0;
		int opc=0;
		float lado=0;
		Scanner entrada =new Scanner(System.in);
		do{
			System.out.println("Ingrese el valor de lado");
			lado=entrada.nextFloat();
			
			System.out.println("Elija una opcion\n (1)Operacion de un cuadrado\n (2)Operacion de cubo\n (3)Cancelar\n (4)Salir");
			op=entrada.nextInt();
			switch (op) {
			case 1:
				System.out.println("Cuadro");
				cuadro.mcuadro(lado, op);
				break;
			case 2:
				System.out.println("Cubo");
				cubo.mcubo(lado, op);
				break;
			case 4:
				System.out.println("Salio del programa");
				break;

			default:
				break;
			}
		}while(op!=4);
		
	}
	
	public static void mcubo(float lado, int opc){
		int opci;
		int opcio=0;
		Scanner opcion=new Scanner(System.in);
		do{
			System.out.println("El valor del lado es: "+lado);
			do{
			System.out.println("Elija una operacion\n (1)Obtener el volumen\n (2)Obtener parametro\n (3)Cancelar\n (4)Salir");
			opci=opcion.nextInt();
			switch (opci) {
			case 1:
				System.out.println("El resultado es: "+area(lado, opc));
				System.out.println("Elija una opcion:\n (1)Salir menu\n (2)salir inicio");
				opcio=opcion.nextInt();
				break;
			case 2:
				System.out.println("El resultado es: "+parametro(lado, opc));
				System.out.println("Elija una opcion:\n (1)Salir menu\n (2)salir inicio");
				opcio=opcion.nextInt();
				break;
			case 4:
				System.out.println("Salio del programa");
		break;
		
			default:
				break;
			}
			}while(opcio!=2);
		}while(opci==3);
	}
}
