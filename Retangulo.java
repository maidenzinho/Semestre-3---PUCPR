public class Retangulo {
    // Crie os atributos privados aqui
    private double area;
    private double perimetro;

    // Crie o construtor aqui
    public Retangulo(double area, double perimetro) {
        this.area = perimetro;
        this.perimetro = perimetro;
    }
    // Crie o método calcularArea() aqui
    public double calcularArea() {
        return area * perimetro;
    }

    // Crie o método calcularPerimetro() aqui
    public double calcularPerimetro() {
        return 2 * (area + perimetro);
    }
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(5.0, 3.0);
        System.out.println("Área: " + retangulo.calcularArea());
        System.out.println("Perímetro: " + retangulo.calcularPerimetro());
    }
}