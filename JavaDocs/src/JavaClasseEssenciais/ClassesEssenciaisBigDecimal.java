package JavaClasseEssenciais;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ClassesEssenciaisBigDecimal {
    public static void main(String[] args) {
        /*BigDecimal zero = BigDecimal.ZERO;
        //BigDecimal dez = BigDecimal.TEN;
        BigDecimal resultado = zero.add(new BigDecimal("100"));
        System.out.println(resultado);
        resultado = resultado.subtract(new BigDecimal("27.5"));
        System.out.println(resultado);*/

        BigDecimal divisor = BigDecimal.valueOf(3);
        BigDecimal resultado = BigDecimal.TEN.divide(divisor, 3, RoundingMode.HALF_EVEN);
        System.out.println(resultado);//3.333

        //BigDecimal decimal = BigDecimal.valueOf(1234.5678);
        //BigDecimal numeroString = new BigDecimal("1234.5678");
    }
}