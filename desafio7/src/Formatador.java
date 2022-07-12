import java.text.Normalizer;
import java.util.regex.Pattern;

public interface Formatador {

    public static String removeAcentos(String texto) {

        String normalizer = Normalizer.normalize(texto, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalizer).replaceAll("");
    }

    public static String tudoMinuscula(String texto) {
        return texto.toLowerCase();
    }

    public static String tudoMaiuscula(String texto) {
        return texto.toUpperCase();
    }

}
