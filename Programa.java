public class Programa {
    public static void main(String[] args) {
        CalculadoraAreas calc = new CalculadoraAreas();
        System.out.println(calc.calcularArea(2, 3));       // Chama o primeiro metodo
        System.out.println(calc.calcularArea(2, 3));    // Chama o segundo metodo
        System.out.println(calc.calcularArea(3.5));   // Chama o terceiro metodo

    }
}
