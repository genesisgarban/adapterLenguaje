import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IConnectionEnglish connection = new Adapter(new ConnectionSpanish());

        connection.connection();

        String result = connection.runQuery();
        System.out.println(result);

        scanner.close();

    }
}