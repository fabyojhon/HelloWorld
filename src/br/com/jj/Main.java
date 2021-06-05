package br.com.jj;

import java.util.Scanner;
import java.io.IOException;


public class Main {

    public static void main(String[] args)  throws  IOException {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");


        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);


        Double Altura, Peso, h;

        System.out.println("Qual a sua Altura");
        Altura = myObj.nextDouble();
        System.out.println("Sua Altura é: " + Altura);


        myObj.nextLine();

        System.out.println("Qual o seu Peso");
        Peso = myObj.nextDouble();
        System.out.println("Seu Peso é:  " + Peso);

        myObj.nextLine();

       System.out.printf( "\nResultado:\n");
       System.out.println((h=Peso/(Altura*Altura)*10000));
            if (h<25)
                System.out.println("você é um desnutrido");
            else System.out.println("Você tá gordo, vai malhar");





        // * / + - %
        // > < >= <= !=

        // && ||             | &

    }
}
