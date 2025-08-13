package JAvaExcecoesP01;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;

public class Excecao002 {
    public static void main(String[] args) {
        try{
            //Double valor = Double.valueOf("a1.75");
            DecimalFormat df = new DecimalFormat();
            DecimalFormatSymbols symbols = new DecimalFormatSymbols();
            symbols.setDecimalSeparator(',');
            symbols.setGroupingSeparator('.');
            df.setDecimalFormatSymbols(symbols);
            Number num = df.parse("1,75");
            System.out.println(num.doubleValue());
            //Number valor = NumberFormat.getInstance().parse("a1.75");
        } catch (ParseException e){
            //e.printStackTrace();
            System.err.println("Número Inválido");
        }
    }
}
