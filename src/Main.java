import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Kryptering kryptering = new Kryptering();
        Dekryptering dekryptering = new Dekryptering();

        Scanner scanner = new Scanner(System.in);

        String besked = scanner.nextLine();

        kryptering.encrypt(besked);
        System.out.println(kryptering.getOutput());


        dekryptering.deencrypt(kryptering.getOutput());
        System.out.println(dekryptering.getOutput());
    }
}
