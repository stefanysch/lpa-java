package lpa;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite algo:");
        String input = scanner.nextLine();
        System.out.println("Você digitou: " + input);
        
        scanner.close();
        
        System.out.println("Scanner fechado.");
    }
}

