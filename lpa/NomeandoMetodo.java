package lpa;

public class NomeandoMetodo { // criando método

    public static void main (String [ ] args) {
        String primeiroNome = "Hello"; //2
        String segundoNome = "Kitty";
    
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome); //3
    
        System.out.println(nomeCompleto);
    }
    
    public static String nomeCompleto(String primeiroNome, String segundoNome) { //1
        return primeiroNome.concat(" ").concat(segundoNome);
    }
    }
