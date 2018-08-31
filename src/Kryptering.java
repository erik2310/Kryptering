public class Kryptering {

    private String output = "";

    // Metode til at kryptere en besked
    public void encrypt(String message) {

        // For hver karakter kører den letterSwitch metoden og tilføjer det til output
        for (char ch : message.toCharArray()) {
            output += letterSwitch(ch);
        }

    }

    // Metode til at ændre karaktererne til noget andet
    private char letterSwitch(char c) {

        switch (c) {
            case 'a':
                c = 'k';
                break;
            case 'b':
                c = 'i';
                break;
            case 'c':
                c = 'y';
                break;
            case 'd':
                c = 'o';
                break;
            case 'e':
                c = 'l';
                break;
            case 'f':
                c = 'h';
                break;
            case 'g':
                c = 'm';
                break;
            case 'h':
                c = 'p';
                break;
            case 'j':
                c = 'n';
                break;
            case 'i':
                c = 'g';
                break;
            case 'k':
                c = 'd';
                break;
            case 'l':
                c = 'e';
                break;
            case 'm':
                c = 'r';
                break;
            case 'n':
                c = 'j';
                break;
            case 'o':
                c = 'u';
                break;
            case 'p':
                c = 't';
                break;
            case 'q':
                c = 'b';
                break;
            case 'r':
                c = 'v';
                break;
            case 's':
                c = 'c';
                break;
            case 't':
                c = 'x';
                break;
            case 'u':
                c = 'z';
                break;
            case 'v':
                c = 'a';
                break;
            case 'w':
                c = 'q';
                break;
            case 'x':
                c = 'w';
                break;
            case 'y':
                c = 'f';
                break;
            case 'z':
                c = 's';
                break;

        }
          return c;
    }

    // Metode til at hente output
    public String getOutput() {
        return output;
    }
}
