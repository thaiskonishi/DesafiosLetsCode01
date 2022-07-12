public class App {
    public static void main(String[] args) throws Exception {
        Email email = new Email();
        System.out.println(email.escreveEmail("ANa", "destinatário",
                "Estou te escrevendo para lembrar do nosso encontro na próxima semana e reviver aquela história que é inesquecível")
                .toString());

        email.setEmail(Formatador.tudoMaiuscula(email.getEmail()));
        System.out.println(email.getEmail().toString());
        email.setEmail(Formatador.tudoMinuscula(email.getEmail()));
        System.out.println(email.getEmail().toString());
        email.setEmail(Formatador.removeAcentos(email.getEmail()));
        System.out.println(email.getEmail().toString());

    }
}
