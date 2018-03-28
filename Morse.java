package modelo;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Principal {
	
	public static void main (String [] args){
		String op="";
		do{
		System.out.println("Programa Codigo Morse");
		System.out.println("Seleccione una opcion:\n 1) Texo-Morse\n 2) Morse-Texto" );
		String entrada="";
		Scanner entradaS =new Scanner(System.in);
		entrada=entradaS.nextLine();
		System.out.println(entrada);
		String resultado=" ";
		switch (entrada) {
		case "1": // Texto-Morse
			do{
			System.out.println("Ingrese pabra, letra:");
			entrada=" ";
			entrada=entradaS.nextLine().toLowerCase();
			for (int i = 0; i < entrada.length(); i++) {
				char letra=entrada.charAt(i);
				if (letra==' ') {
					resultado+=" "+" "+" ";
				}
				if (letra=='a') {
					resultado+=".-"+" ";
				}
				if (letra=='b') {
					resultado+="-..."+" ";
				}
				if (letra=='c') {
					resultado+="-.-"+" ";
				}
				if (letra=='d') {
					resultado+="-.."+" ";
				}
				if (letra=='e') {
					resultado+="."+" ";
				}
				if (letra=='f') {
					resultado+="..-."+" ";
				}
				if (letra=='g') {
					resultado+="--."+" ";
				}
				if (letra=='h') {
					resultado+="...."+" ";
				}
				if (letra=='i') {
					resultado+=".."+" ";
				}
				if (letra=='j') {
					resultado+=".---"+" ";
				}
				if (letra=='k') {
					resultado+="-.-"+" ";
				}
				if (letra=='l') {
					resultado+=".-.."+" ";
				}
				if (letra=='m') {
					resultado+="--"+" ";
				}
				if (letra=='n') {
					resultado+="-."+" ";
				}
				if (letra=='o') {
					resultado+="---"+" ";
				}
				if (letra=='p') {
					resultado+=".--."+" ";
				}
				if (letra=='q') {
					resultado+="--.-"+" ";
				}
				if (letra=='r') {
					resultado+=".-."+" ";
				}
				if (letra=='s') {
					resultado+="..."+" ";
				}
				if (letra=='t') {
					resultado+="-"+" ";
				}
				if (letra=='u') {
					resultado+="..-"+" ";
				}
				if (letra=='v') {
					resultado+="...-"+" ";
				}
				if (letra=='w') {
					resultado+=".--"+" ";
				}
				if (letra=='x') {
					resultado+=".--."+" ";
				}
				if (letra=='y') {
					resultado+="-.--"+" ";
				}
				if (letra=='z') {
					resultado+="--.."+" ";
				}
				if (letra == '1') {
					resultado+=".----"+" ";
				}
				if (letra == '2') {
					resultado+="..---"+" ";
				}
				if (letra == '3') {
					resultado+="...--"+" ";
				}
				if (letra == '4') {
					resultado+="....-"+" ";
				}
				if (letra == '5') {
					resultado+="....."+" ";
				}
				if (letra == '6') {
					resultado+="-...."+" ";
				}
				if (letra == '7') {
					resultado+="--..."+" ";
				}
				if (letra == '8') {
					resultado+="---.."+" ";
				}
				if (letra == '9') {
					resultado+="----."+" ";
				}
				if (letra == '0') {
					resultado+="-----"+" ";
				}
			}
			System.out.println(resultado);
			resultado="";
			System.out.println("¿Desea volver a ingresar codigo? Si/No");
			op=entradaS.nextLine().toLowerCase();
		}while(op.equals("si"));
			System.out.println("Salio de la conversion texto-morse");
			break;
		case "2": //Morse-Texto
			do{
			System.out.println("Ingrese el codigo:");
			entrada=" ";
			entrada=entradaS.nextLine()+" ";
			System.out.println(entrada);
			String a="";
			int s=0;
			char [] signo=entrada.toCharArray();
			for (int i = 0; i < signo.length; i++) {
				if (signo[i]==' ' ||  signo[i]=='.' || signo[i]=='-') {
					if (signo[i]=='.' || signo[i]=='-') {
						a+=signo[i];
						s=0;
					}else{
							s=s+1;
							if (s==3) {
								resultado+=" ";
								s=0;
							}
						
						if (a.equals(".-")) {
							resultado+="a";
							a="";
						}
						if (a.equals("-...")) {
							resultado+="b";
							a="";
						}
						if (a.equals("-.-.")) {
							resultado+="c";
							a="";
						}
						if (a.equals("-..")) {
							resultado+="d";
							a="";
						}
						if (a.equals(".")) {
							resultado+="e";
							a="";
						}
						if (a.equals("--.")) {
							resultado+="g";
							a="";
						}
						if (a.equals("....")) {
							resultado+="h";
							a="";
						}
						if (a.equals("..")) {
							resultado+="i";
							a="";
						}
						if (a.equals(".---")) {
							resultado+="j";
							a="";
						}
						if (a.equals("-.-")) {
							resultado+="k";
							a="";
						}
						if (a.equals(".-..")) {
							resultado+="l";
							a="";
						}
						if (a.equals("--")) {
							resultado+="m";
							a="";
						}
						if (a.equals("-.")) {
							resultado+="n";
							a="";
						}
						if (a.equals("---")) {
							resultado+="o";
							a="";
						}if (a.equals(".--.")) {
							resultado+="p";
							a="";
						}
						if (a.equals("--.-")) {
							resultado+="q";
							a="";
						}
						if (a.equals(".-.")) {
							resultado+="r";
							a="";
						}
						if (a.equals("...")) {
							resultado+="s";
							a="";
						}
						if (a.equals("-")) {
							resultado+="t";
							a="";
						}
						if (a.equals("..-")) {
							resultado+="u";
							a="";
						}
						if (a.equals("...-")) {
							resultado+="v";
							a="";
						}
						if (a.equals(".--")) {
							resultado+="w";
							a="";
						}
						if (a.equals("-..-")) {
							resultado+="x";
							a="";
						}
						if (a.equals("-.--")) {
							resultado+="y";
							a="";
						}
						if (a.equals("--..")) {
							resultado+="z";
							a="";
						}
						if (a.equals(".----")) {
							resultado+="1";
							a="";
						}
						if (a.equals("..---")) {
							resultado+="2";
							a="";
						}
						if (a.equals("...--")) {
							resultado+="3";
							a="";
						}
						if (a.equals("....-")) {
							resultado+="4";
							a="";
						}
						if (a.equals(".....")) {
							resultado+="5";
							a="";
						}
						if (a.equals("-....")) {
							resultado+="6";
							a="";
						}
						if (a.equals("--...")) {
							resultado+="7";
							a="";
						}
						if (a.equals("---..")) {
							resultado+="8";
							a="";
						}
						if (a.equals("----.")) {
							resultado+="9";
							a="";
						}
						if (a.equals("-----")) {
							resultado+="0";
							a="";
						}
					}
				}else{
					resultado="";
					System.out.println("Solo se pueden ingresar '.'  y '-' ");
				}
			}
			System.out.println(resultado);
			resultado="";
			System.out.println("¿Desea volver a ingresar codigo? Si/No");
			op=entradaS.nextLine().toLowerCase();
		}while(op.equals("si"));
			System.out.println("Salio de la conversion morse-texto");
			break;

		default:
			break;
		}
		System.out.println("¿Desea volver al menu? Si/No");
		op=entradaS.nextLine().toLowerCase();
	}while(op.equals("si"));
	}

}
