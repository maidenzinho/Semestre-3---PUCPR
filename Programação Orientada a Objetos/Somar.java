public class Somar {
    // Método somar (complete)
    public int somar(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Somar calc = new Somar();
        int resultado = calc.somar(5, 3);
        System.out.println("Resultado: " + resultado);
    }
}