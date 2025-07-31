package JavaDocumentacao;
/**
 * Calculadora Simples
 * @author Hudson Diego
 * @since v1.0
 */
public class Calculadora {
    /**
    * Realiza a divisão entre dois números inteiros
    * @param dividendo Número que  será dividido
    * @param divisor   Némero que irá dividir o dividendo
    * @return Resultado da divisao entre o divisor e dividendo
    * @author Hudson Diego
    * @exception java.lang.ArithmeticException em caso de passar o divisor igual a zero
    */
    Integer dividir(Integer dividendo, Integer divisor){
        return dividendo/divisor;
    }
}
