package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {

        // Calculadora

        System.out.println("Exercício Calculadora: \n");
        Calculadora.soma(19,0);
        Calculadora.subtracao(19,0);
        Calculadora.multiplicacao(19,0);
        Calculadora.divisao(19,0);

        // Empréstimo

        System.out.println("\nExercício do Empréstimo: \n");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);

        // Mensagem
        System.out.println("\nExercício das Horas: \n");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(18);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(28);
    }
}
