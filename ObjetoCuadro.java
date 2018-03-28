package modelo;
import java.util.Scanner;
public class Cuadro {
	
	public static float area (float lado, int opc){
		if (opc==1) {
			return lado*lado;
		}
		if (opc==2) {
			return (float) Math.pow(lado, 3);
		}
		return opc;
	}
	public static float parametro(float lado, int opc){
		if (opc==1) {
			return 4*lado;
		}
		if (opc==2) {
			return 12*lado;
		}
		return opc;
	}
	public static void mcuadro(float lado, int opc){
		int opci;
		int opcio=0;
		Scanner opcion=new Scanner(System.in);
		do{
			System.out.println("El valor del lado es: "+lado);
			do{
			System.out.println("Elija una operacion\n (1)Obtener area\n (2)Obtener parametro\n (3)Cancelar\n (4)Salir");
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
		
		break;
		
			default:
				break;
			}
			}while(opcio!=2);
		}while(opci==3);
	}
}
