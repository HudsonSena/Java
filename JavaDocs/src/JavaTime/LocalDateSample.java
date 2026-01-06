import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateSample {
    public static void main(String[] args) {
        LocalDate meuAniversario = LocalDate.of(2024, 2, 25);
        System.out.println(meuAniversario);

        String stringDataBr = "15/03/1993";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataConcreta = LocalDate.parse(stringDataBr, formatter);
        System.out.println(dataConcreta);

        LocalDate dataQueTera15Anos = meuAniversario.plusYears(15);
        System.out.println(dataQueTera15Anos);

        LocalDate novaData = meuAniversario.minusDays(5);
        System.out.println(novaData);

    }
}
