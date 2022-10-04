/// Java-Programm, das den Durchschnitt aller ganzzahligen
//Zahlen berechnet, die als Befehlszeilenparameter angegeben werden

import java.util.Scanner;

public class Main {
    static void labor1(int a, int b){
        System.out.println((a+b)/2);
    }
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter a number");

        int a = myObj.nextInt();  // Read user input

        System.out.println("Enter another number");

        int b = myObj.nextInt();

        labor1(a,b);
    }
}