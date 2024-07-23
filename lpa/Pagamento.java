package lpa;
import java.util.Scanner;

public class Pagamento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo;
        float valorProduto;

        System.out.println("Por favor, informe o valor do produto:");
        valorProduto = scanner.nextFloat();

        do {
            System.out.println("Por favor, informe o código de pagamento.");
            System.out.println("1- À vista em dinheiro ou cheque, recebe 10% de desconto \n" +
                    "2- À vista no cartão de crédito, recebe 15% de desconto \n" +
                    "3- Em duas vezes, preço normal de etiqueta sem juros \n" +
                    "4- Em três vezes, preço normal de etiqueta mais juros de 10%");
            codigo = scanner.nextInt();
        } while (codigo < 1 || codigo > 4);
        
        System.out.println("O código escolhido foi o : " + codigo);


        if (codigo == 1) {
            float valorComDesconto = valorProduto * 0.9f;
            System.out.printf("Você escolheu a forma de pagamento à vista em dinheiro ou em cheque recebendo 10% de desconto. O valor total a ser pago é de: R$ %.2f%n", valorComDesconto);
        } else if (codigo == 2) {
            float valorComDesconto = valorProduto * 0.85f;
            System.out.printf("Você escolheu a forma de pagamento à vista no cartão de crédito recebendo 15%% de desconto. O valor total a ser pago é de: R$ %.2f%n", valorComDesconto);
        } else if (codigo == 3) {
            float parcela = valorProduto / 2;
            System.out.printf("Você escolheu a forma de pagamento em duas vezes, com o preço normal sem juros, totalizando duas parcelas de: R$ %.2f%n", parcela);
        } else {
            float valorComJuros = valorProduto * 1.1f;
            float parcela = valorComJuros / 3;
            System.out.printf("Você escolheu a forma de pagamento em três vezes. O valor total do produto é de: R$ %.2f com parcelas de: R$ %.2f%n", valorComJuros, parcela);
        }
        
        scanner.close();
    }
}