package exercicios;

import java.util.Scanner;

/* Aqui onde executa os exercicios */

public class App 
{
    public static void main(String[] args) throws Exception 
    {
        System.out.println("Insira qual o tipo de numero que deseja calcular:");
        System.out.println("(I para inteiro, D para decimal)");

        Scanner leitor = new Scanner(System.in);

        int numero1, numero2, resultado_int = 0;

        double decimal1, decimal2, resultado_decimal = 0.0;

        char tipo_entrada;

        tipo_entrada = leitor.next().charAt(0);

        if (tipo_entrada == 'I')
        {
            System.out.println("Insira o primeiro numero:");

            numero1 = leitor.nextInt();

            System.out.println("Insira o segundo numero:");

            numero2 = leitor.nextInt();

            System.out.println("Insira a operação que quer realizar:");

            tipo_entrada = leitor.next().charAt(0);

            switch (tipo_entrada)
            {
                case '+':
                    resultado_int = numero1 + numero2;
                    break;

                case '-':
                    resultado_int = numero1 - numero2;
                    break;

                case '/':
                    resultado_int = numero1 / numero2;
                    break;

                case '%':
                    resultado_int = numero1 % numero2;
                    break;
            }

            System.out.println("O resultado é: " + resultado_int);
        }

        else if (tipo_entrada == 'D') 
        {
            System.out.println("Insira o primeiro decimal:");

            decimal1 = leitor.nextDouble();

            System.out.println("Insira o segundo decimal:");

            decimal2 = leitor.nextDouble();

            System.out.println("Insira a operação que quer realizar:");

            tipo_entrada = leitor.next().charAt(0);

            switch (tipo_entrada)
            {
                case '+':
                    resultado_decimal = decimal1 + decimal2;
                    break;

                case '-':
                    resultado_decimal = decimal1 - decimal2;
                    break;

                case '/':
                    resultado_decimal = decimal1 / decimal2;
                    break;

                case '%':
                    resultado_decimal = decimal1 % decimal2;
                    break;
            }

            System.out.println("O resultado é: " + resultado_decimal);
        }
    }
}

