package lpa;

class CepInvalidoException extends Exception {
    public CepInvalidoException() {
        super("CEP inválido!");
    }
}

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep == null || cep.length() != 8 || !cep.matches("\\d{8}")) {
            throw new CepInvalidoException();
        }

        return cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5);
    }
}
