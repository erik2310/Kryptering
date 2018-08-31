public class Main {

    public static void main(String[] args) {

        Kryptering kryptering = new Kryptering();
        Dekryptering dekryptering = new Dekryptering();

        kryptering.encrypt("Hello World!");
        System.out.println(kryptering.getOutput());


        dekryptering.deencrypt(kryptering.getOutput());
        System.out.println(dekryptering.getOutput());
         }
}
