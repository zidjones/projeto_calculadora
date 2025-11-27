package calculadora;

/**
 * Classe utilizada para testar os métodos da classe {@link calculadora}.
 *
 * Executa operações válidas e também casos que geram exceção,
 * permitindo verificar se o comportamento da calculadora está correto.
 */
public class TesteCalculadora {

    /**
     * Método principal que realiza os testes da calculadora.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {

        // Instância da calculadora usada nos testes
        calculadora calc = new calculadora();

        // Testes de operações básicas
        System.out.println(calc.calcular(2, 3, "+"));   // esperado: 5
        System.out.println(calc.calcular(10, 4, "-"));  // esperado: 6
        System.out.println(calc.calcular(3, 5, "*"));   // esperado: 15
        System.out.println(calc.calcular(8, 2, "/"));   // esperado: 4

        // Teste de divisão por zero
        try {
            System.out.println(calc.calcular(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Teste de operador inválido
        try {
            System.out.println(calc.calcular(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
