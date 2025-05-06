public class Carro {
    private double distancia_por_minuto;
    public Carro(double distancia_por_minuto) {
        this.distancia_por_minuto = distancia_por_minuto;
    }
    public double distancia_por_minuto(){
        return distancia_por_minuto;
    }
}
class Piloto{
    public int correr(Carro carro, double distancia_minima){
        double distancia_percorrida = 0;
        int tempo_decorrido = 0;
        while (distancia_percorrida < distancia_minima)
        {
            tempo_decorrido++;
            distancia_percorrida = distancia_percorrida + carro.distancia_por_minuto();
        }
        return tempo_decorrido;
    }
}
class main{
    public static void main(String[] args) {
        Carro brasilia = new Carro(1000.00);
        Carro ferrari = new Carro(5000.00);
        Piloto fangio = new Piloto();
        int tempo1 = fangio.correr(brasilia, 30000.00);
        int tempo2 = fangio.correr(ferrari, 30000.00);
        System.out.println(tempo1);
        System.out.println(tempo2);
    }
}