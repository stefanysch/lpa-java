package carros;
public class Main {
    public static void main(String[] args){
        // objetos da classe carro
        Carro carro1 = new Carro("Ford", "Azul", "Fusion", 2024, 0.15);
        Carro carro2 = new Carro("Honda", "Preto", "Civic", 2014, 0.12);
        Carro carro3 = new Carro("Toyota", "Amarelo", "Supra", 2001, 0.20);

        carro1.acelerar(60);
        carro2.acelerar(90);
        carro3.acelerar(220);

        System.out.println(carro1.getDescricao());
        System.out.println(carro2.getDescricao());
        System.out.println(carro3.getDescricao());

        carro1.frear(160);
        carro2.frear(100);
        carro3.frear(150);

        carro1.encherPneu();
        carro2.trocarCor("Rosa");

        System.out.println(carro1.getDescricao());
        System.out.println(carro2.getDescricao());
        System.out.println(carro3.getDescricao());
        
        carro1.simularViagem(200);
        carro2.simularViagem(300);
        carro3.simularViagem(100);
        
        System.out.println(carro1.getDescricao());
        System.out.println(carro2.getDescricao());
        System.out.println(carro3.getDescricao());
    }
}