/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package proyecto1_clase4;

import java.util.Scanner;
public class Proyecto1_clase4 {
    public static void main(String[] args) {
        //declarar variables
        int n1, n2, n3, suma;
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar Numero 1:");
        n1=lectura.nextInt();
        System.out.print("Ingresar Numero 2:");
        n2=lectura.nextInt();
        System.out.print("Ingresar Numero 3:");
        n3=lectura.nextInt();
        //proceso de datos
        suma=n1+n2+n3;
        //salida de datos
        System.out.println("La suma de los numeros es:"+suma);
    }
    

}
