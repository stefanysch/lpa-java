package carros;
class Carro {
    // atributos
    private String marca;
    private String cor;
    private String modelo;
    private int ano_fabricacao;
    private double velocidade;
    private double gasolina;
    private double consumoPorKm;

    // construtores
    public Carro(String marca, String cor, String modelo, int ano_fabricacao, double consumoPorKm){
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.ano_fabricacao = ano_fabricacao;
        this.velocidade = 0;
        this.gasolina = 40; 
        this.consumoPorKm = consumoPorKm;
    }

    // metodos
    public void acelerar(double incremento){
        this.velocidade += incremento;
        System.out.println(this.modelo + " aumentou a velocidade para " + this.velocidade);
        if (this.velocidade >= 100) {
            System.out.println(this.modelo + " ATENÇÃO! Velocidade acima do permitido na rodovia.");
        }
    }

    public void frear(double decremento){
        this.velocidade -= decremento;
        if (this.velocidade <= 0) {
            this.velocidade = 0;
            System.out.println(this.modelo + " parou!");
        } else {
            System.out.println(this.modelo + " reduziu a velocidade para " + this.velocidade + " km/h");
        }
    }

    public void trocarOleo() {
        System.out.println("O óleo do " + this.modelo + " foi trocado.");
    }

    public void revisarFreios() {
        System.out.println("Os freios do modelo " + this.modelo + " estão revisados.");
    }

    public void encherPneu() {
        System.out.println(this.modelo + " encheu o pneu!");
    }

    public void trocarCor (String novaCor) {
         this.cor = novaCor;
        System.out.println(this.modelo + " agora está na cor " + this.cor);
    }

    public double calcularConsumoMedio(double distancia) {
        return distancia * this.consumoPorKm;
    }

    public void simularViagem(double distancia) {
        double consumo = calcularConsumoMedio(distancia);
        if (consumo <= this.gasolina) {
            this.gasolina -= consumo;
            System.out.println("Viagem realizada. Combustível restante: " + this.gasolina + " litros.");
        } else {
            System.out.println("Combustível insuficiente para a viagem.");
        }
    }

    public String getDescricao() {
        return "MARCA: " + this.marca + ", COR: " + this.cor + ", MODELO: " + this.modelo + ", ANO DE FABRICAÇÃO: " + this.ano_fabricacao + ", VELOCIDADE: " + this.velocidade + " km/h, COMBUSTÍVEL: " + this.gasolina + " litros";
    }
}