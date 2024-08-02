package imc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float imc = 0;

        try {

            System.out.println("=================================================== <[Entrada]> ==================================================");
            System.out.print("Ingrese el peso (kilogramos): ");
            float peso = scan.nextFloat();

            System.out.print("Ingrese el peso (metros): ");
            float altura = scan.nextFloat();
            altura = altura * altura;

            imc = peso / altura;

            System.out.println("=================================================== <[Calculo]> ==================================================");
            System.out.println("Su IMC = " + imc);
            if (imc < 18.5) {
                System.out.println("Su peso es Bajo");
            } else if (imc <= 24.9) {
                System.out.println("Su peso es Normal");
            } else if (imc <= 29.9) {
                System.out.println("Sufre de sobrepeso");
            } else {
                System.out.println("Sufre de Obecidad");
            }
            System.out.println("==================================================================================================================");

        } catch (InputMismatchException e) {
            System.out.println("=================================================== <[Error]> ====================================================");
            System.err.println("Error, solo se admiten numeros");
            System.out.println("==================================================================================================================");
        }

    }
}
