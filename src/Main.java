public class Main {

    public static void main(String[] args) {

        Kryptering kryptering = new Kryptering();

        kryptering.encrypt("Hallo world!");
        System.out.println(kryptering.getOutput());
         }
}
