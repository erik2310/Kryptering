public class Kryptering {

    private String output = "";

    public String encrypt(String code) {

        for (char ch : code.toCharArray()) {
            output += letterSwitch(ch);
        }
        return output;
    }

    public char letterSwitch(char c) {
        switch (c) {
            case 'a': c = 'k'; break;

        }
          return c;
    }

    public String getOutput() {
        return output;
    }
}
