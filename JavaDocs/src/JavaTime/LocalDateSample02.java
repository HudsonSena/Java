import java.time.LocalDate;

public class LocalDateSample02 {
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.of(2025, 3, 4);
        LocalDate data2 = LocalDate.of(2024, 4, 3);

        System.out.println(data2.isAfter(data1));
        System.out.println(data2.isBefore(data1));
        System.out.println(data2.isEqual(data1));

    }
}
