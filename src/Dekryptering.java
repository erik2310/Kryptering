public class Dekryptering {

    private String output = "";

    // Metode til at dekryptere en besked
    public void deencrypt(String message) {

        // For hver karakter kører den letterSwitch metoden og tilføjer det til output
        for (char ch : message.toCharArray()) {
            output += letterSwitch(ch);
        }

    }

    // Metode til at ændre karaktererne til noget andet
    private char letterSwitch(char c) {

        switch (c) {
            case 'k':
                c = 'a';
                break;
            case 'i':
                c = 'b';
                break;
            case 'y':
                c = 'c';
                break;
            case 'o':
                c = 'd';
                break;
            case 'l':
                c = 'e';
                break;
            case 'h':
                c = 'f';
                break;
            case 'm':
                c = 'g';
                break;
            case 'p':
                c = 'h';
                break;
            case 'n':
                c = 'j';
                break;
            case 'g':
                c = 'i';
                break;
            case 'd':
                c = 'k';
                break;
            case 'e':
                c = 'l';
                break;
            case 'r':
                c = 'm';
                break;
            case 'j':
                c = 'n';
                break;
            case 'u':
                c = 'o';
                break;
            case 't':
                c = 'p';
                break;
            case 'b':
                c = 'q';
                break;
            case 'v':
                c = 'r';
                break;
            case 'c':
                c = 's';
                break;
            case 'x':
                c = 't';
                break;
            case 'z':
                c = 'u';
                break;
            case 'a':
                c = 'v';
                break;
            case 'q':
                c = 'w';
                break;
            case 'w':
                c = 'x';
                break;
            case 'f':
                c = 'y';
                break;
            case 's':
                c = 'z';
                break;

        }
        return c;
    }

    // Metode til at hente output
    public String getOutput() {
        return output;
    }

}
