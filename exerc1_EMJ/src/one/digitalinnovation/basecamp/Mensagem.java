package one.digitalinnovation.basecamp;

public class Mensagem {

    public static void obterMensagem(int hora) {

        if (hora >= 18 && hora <=23 || hora >= 0 && hora <= 5){
            mensagemNoite();
        } else if (hora >= 6 && hora <= 11) {
            mensagemDia();
        } else if (hora >= 12 && hora <=17) {
           mensagemTarde();
        } else {
            mensagemInvalida();
        }
    }

    public static void mensagemNoite() {
        System.out.println("Já está de noite já, vai se preparar pra dormir fi");
    }

    public static void mensagemTarde() {
        System.out.println("Buenas tardes, compañero");
    }

    public static void mensagemDia() {
        System.out.println("Bom diaaa, flor do dia");
    }

    public static void mensagemInvalida() {
        System.out.println("Hora inválida, meu querido");
    }
}

