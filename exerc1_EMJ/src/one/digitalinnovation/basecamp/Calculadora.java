 package one.digitalinnovation.basecamp;

public class Calculadora {

    public static void soma(double n1, double n2) {
        double resultado = n1 + n2;

        System.out.println("A soma de " + n1 + " + " + n2 + " é igual a " + resultado);
    }

    public static void subtracao(double n1, double n2) {
        double resultado = n1 - n2;

        System.out.println("A subtração de " + n1 + " - " + n2 + " é igual a " + resultado);

    }

    public static void multiplicacao(double n1, double n2) {
        double resultado = n1 * n2;

        System.out.println("A multiplicação de " + n1 + " x " + n2 + " é igual a " + resultado);

    }

    public static void divisao(double n1, double n2) {

        if (n2 == 0) {
            System.out.println("Divisão impossível pois o segundo valor digitado é 0");
            System.out.println("Se invertemos os valores de posição, esse é o resultado: ");
            double resultado = n2 / n1;
            System.out.println("A divisão de " + n2 + " por " + n1 + " é igual a " + resultado);
        } else {
            double resultado = n1 / n2;
            System.out.println("A divisão de " + n1 + " + " + n2 + " é igual a " + resultado);
        }
    }
}
