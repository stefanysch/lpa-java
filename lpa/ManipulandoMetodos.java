package lpa;

public class ManipulandoMetodos { // manipulando métodos com e sem parâmetros
    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
    public void aumentarCanal(){
        canal++;
        System.out.println("Aumentando o canal para: " + canal + "...");
    }
    public void diminuirCanal(){
        canal--;
        System.out.println("Diminuindo o volume para: " + canal + "...");
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Aumentando o volume para: " + volume + "...");
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: " + volume + "...");
    }
    public void mudarCanal (int novoCanal){
        canal = novoCanal;
        System.out.println("Mudando o canal para: " + novoCanal + "...");
    }

    //usuário 
    public static void main (String[] args) throws Exception{
        ManipulandoMetodos smartTv = new ManipulandoMetodos();

        System.out.println("TV ligada?" + smartTv.ligada);

        smartTv.ligar();

        System.out.println("TV ligada?" + smartTv.ligada);

        System.out.println("Canal atual:" + smartTv.canal);
        
        smartTv.aumentarCanal();

        smartTv.mudarCanal(9);

        System.out.println("Canal atual:" + smartTv.canal);

        System.out.println("Volume atual:" + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        
        System.out.println("Volume Atual -> " + smartTv.volume);

    }
}