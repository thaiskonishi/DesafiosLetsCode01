
public class Email implements Formatador {
    private String remetente;
    private String destinatario;
    private String corpoMensagem;
    private String email;;

    public String escreveEmail(String remetente, String destinatario, String corpoMensagem) {
        email = String.format("De: %s \n olá, %s !\n %s \n Atenciosamente, \n %s .", remetente, destinatario,
                corpoMensagem, remetente);
        return email;
    }

    public String getRemetente() {
        return remetente;
    }

    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public String getCorpoMensagem() {
        return corpoMensagem;
    }

    public void setCorpoMensagem(String corpoMensagem) {
        this.corpoMensagem = corpoMensagem;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return String.format("De: %s \n olá, %s !\n %s \n Atenciosamente, \n %s .", remetente, destinatario,
                corpoMensagem, remetente);
    }

}
