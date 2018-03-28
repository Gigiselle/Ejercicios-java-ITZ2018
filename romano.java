package modelo;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class romano {
	public static void main (String [] args){
		String op="";
		do{
		String numero="";
		String cadena="";
		System.out.println("Ingrese numeros de 0 al 1000");
		Scanner entrada =new Scanner(System.in);
		numero=entrada.nextLine();
		System.out.println(numero);
		char [] num= numero.toCharArray();
		if (num.length <=4) {
			for (int i = 0; i < num.length; i++) {
				if (num.length==1) {
					if (num[i]=='1') {
						cadena+="I";
					}
					if (num[i]=='2') {
						cadena+="II";
					}
					if (num[i]=='3') {
						cadena+="III";
					}
					if (num[i]=='4') {
						cadena+="IV";
					}
					if (num[i]=='5') {
						cadena+="V";
					}
					if (num[i]=='6') {
						cadena+="VI";
					}
					if (num[i]=='7') {
						cadena+="VII";
					}
					if (num[i]=='8') {
						cadena+="VIII";
					}
					if (num[i]=='9') {
						cadena+="IX";
					}
				}
				if (num.length==2) {
					if (i==0) {
						if (num[i]=='1') {
							cadena+="X";
						}
						if (num[i]=='2') {
							cadena+="XX";
						}
						if (num[i]=='3') {
							cadena+="XXX";
						}
						if (num[i]=='4') {
							cadena+="XL";
						}
						if (num[i]=='5') {
							cadena+="L";
						}
						if (num[i]=='6') {
							cadena+="LX";
						}
						if (num[i]=='7') {
							cadena+="LXX";
						}
						if (num[i]=='8') {
							cadena+="LXXX";
						}
						if (num[i]=='9') {
							cadena+="XC";
						}
					}
					if (i==1) {
						if (num[i]=='1') {
							cadena+="I";
						}
						if (num[i]=='2') {
							cadena+="II";
						}
						if (num[i]=='3') {
							cadena+="III";
						}
						if (num[i]=='4') {
							cadena+="IV";
						}
						if (num[i]=='5') {
							cadena+="V";
						}
						if (num[i]=='6') {
							cadena+="VI";
						}
						if (num[i]=='7') {
							cadena+="VII";
						}
						if (num[i]=='8') {
							cadena+="VIII";
						}
						if (num[i]=='9') {
							cadena+="IX";
						}
					}
				}
				if (num.length==3) {
					if (i==0) {

						if (num[i]=='1') {
							cadena+="C";
						}
						if (num[i]=='2') {
							cadena+="CC";
						}
						if (num[i]=='3') {
							cadena+="CCC";
						}
						if (num[i]=='4') {
							cadena+="CD";
						}
						if (num[i]=='5') {
							cadena+="D";
						}
						if (num[i]=='6') {
							cadena+="DC";
						}
						if (num[i]=='7') {
							cadena+="DCC";
						}
						if (num[i]=='8') {
							cadena+="DCCC";
						}
						if (num[i]=='9') {
							cadena+="CM";
						}
					}
					if (i==1) {	
						if (num[i]=='1') {
							cadena+="X";
						}
						if (num[i]=='2') {
							cadena+="XX";	
						}
						if (num[i]=='3') {
							cadena+="XXX";
						}
						if (num[i]=='4') {
							cadena+="XL";
						}
						if (num[i]=='5') {
							cadena+="L";
						}
						if (num[i]=='6') {
							cadena+="LX";
						}
						if (num[i]=='7') {
							cadena+="LXX";
						}
						if (num[i]=='8') {
							cadena+="LXXX";	
						}
						if (num[i]=='9') {
							cadena+="XC";
						}
					}
					if (i==2) {
						if (num[i]=='1') {
							cadena+="I";
						}
						if (num[i]=='2') {
							cadena+="II";
						}
						if (num[i]=='3') {
							cadena+="III";
						}
						if (num[i]=='4') {
							cadena+="IV";
						}
						if (num[i]=='5') {
							cadena+="V";
						}
						if (num[i]=='6') {
							cadena+="VI";
						}
						if (num[i]=='7') {
							cadena+="VII";
						}
						if (num[i]=='8') {
							cadena+="VIII";
						}
						if (num[i]=='9') {
							cadena+="IX";
						}
					}
				}
				if (num.length==4) {
					if (num[i]!='1') {
						System.out.println("Recuerda ingresar numeros que sean de 0 a 1000");
						break;
					}else{
						cadena+="M";
					}
				}
			}
			
		}else{
			System.out.println("No puede ingresar mas de 4 digitos");
		}
		System.out.println(cadena);	
		System.out.println("¿Desea ingresar otro numero? SI/NO");
		op=entrada.nextLine().toLowerCase();
		}while(op.equals("si"));
		System.out.println("Ha salio del programa.");
	}
}
