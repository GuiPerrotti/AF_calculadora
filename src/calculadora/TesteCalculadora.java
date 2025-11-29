package calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.calc(2, 3, "+")); // esperado: 5
        System.out.println(calc.calc(5, 2, "-")); // esperado: 3
        System.out.println(calc.calc(3, 3, "*")); // esperado: 9

        try {
            System.out.println(calc.calc(8, 2, "/")); // esperado: 4
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calc(5, 0, "/")); // erro
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calc(2, 3, "%")); // inválido
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
