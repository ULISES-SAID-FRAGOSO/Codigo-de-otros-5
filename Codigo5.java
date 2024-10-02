/*
 * Este programa solicita al usuario que introduzca un número entero. Luego, evalúa si el número es "afortunado" o no.
 * "afortunado" si la cantidad de dígitos afortunados (3, 7, 8, 9) es mayor que la cantidad de 
 * dígitos no afortunados. Al final, imprime si el número es afortunado o no.
 */


import java.util.Scanner;// Importar la clase Scanner para la entrada del usuario

public class FizzBuzz {
	 public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 System.out.print("Introduzca un número: ");
				 String niStr = s.nextLine();
				 int c;
				 
				 try {
			            c = Integer.parseInt(niStr);  // Convertir el String a entero
			        } catch (NumberFormatException e) {
			            System.out.println("Entrada no válida. Por favor, introduzca un número entero.");
			            return;  // Finalizar el programa si la entrada no es válida
			        }
				 
				 int ni = Math.abs(c);
				 
				 int afo = 0;
				 int noAfo = 0;
				 
				 while (ni > 0) {
					 int digito = (ni%10);
					 if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
			                afo++;  // Incrementar el contador de dígitos afortunados
			            } else {
			                noAfo++;  // Incrementar el contador de dígitos no afortunados
			            }
						 
						 ni/= 10;
					 }//else
					 
					 if (afo > noAfo) {
						 System.out.println("El " + c + " es un número afortunado.");
					 } else {
						 System.out.println("El " + c + " no es un número afortunado.");
					 }//else
					 s.close();
				}
		 
	 }//class codigo5
	  