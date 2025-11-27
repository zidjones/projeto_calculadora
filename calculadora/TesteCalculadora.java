package calculadora;

/**
 * Classe de teste da Calculadora.
 *
 * Executa alguns exemplos de uso do método {@link calculadora#calcular(int, int, String)},
 * testando operações válidas e também situações que geram exceção.
 */
public class TesteCalculadora {

    /**
     * Método principal da aplicação.
     *
     * Cria uma instância de {@link calculadora} e executa:
     * <ul>
     *   <li>Operações básicas: soma, subtração, multiplicação e divisão</li>
     *   <li>Um teste de divisão por zero</li>
     *   <li>Um teste com operador inválido</li>
     * </ul>
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {

        // Instância da calculadora usada nos testes
        calculadora calc = new calculadora();

        // Testes válidos
        System.out.println(calc.calcular(2, 3, "+"));   // esperado: 5
        System.out.println(calc.calcular(10, 4, "-"));  // esperado: 6
        System.out.println(calc.calcular(3, 5, "*"));   // esperado: 15
        System.out.println(calc.calcular(8, 2, "/"));   // esperado: 4

        // Teste: divisão por zero
        try {
            System.out.println(calc.calcular(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Teste: operador inválido
        try {
            System.out.println(calc.calcular(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
