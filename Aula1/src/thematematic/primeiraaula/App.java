package thematematic.primeiraaula;
public class App {
    public static void main(String[] args) {
        System.out.println("iniciando Aula");
        String x = "Julia";
        String y = "Costa";
        System.out.println(nomeCompleto(x, y));
        
    }


public static String nomeCompleto(String primeiroNome, String segundoNome){
    return primeiroNome.concat(" ").concat(segundoNome);
}}
