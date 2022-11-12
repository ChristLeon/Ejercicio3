package utp.ejerciciopropuesto3;
import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
    Scanner scn=new  Scanner(System.in);
    int n=0;
    System.out.println("Ingrese el numero del cual desea saber si par:");
    n=scn.nextInt();
    if(n%2==0){
        System.out.println("El numero par");
    }else if(n%2!=0){
        System.out.println("El numero es impar");
    }
    }
    
}
