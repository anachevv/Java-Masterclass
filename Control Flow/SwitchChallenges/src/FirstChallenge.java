public class FirstChallenge {
    public static void main(String[] args) {
        System.out.println(getMessage());
    }
    public static String getMessage() {
        String letters = "ABCDEq";
        StringBuilder message = new StringBuilder();

        for (int idx = 0; idx < letters.length(); idx++) {
            char letter = letters.charAt(idx);

            switch (letter) {
                case 'A' -> message.append(letter).append(" is 'able'\n");
                case 'B' -> message.append(letter).append(" is 'baker'\n");
                case 'C' -> message.append(letter).append(" is 'charlie'\n");
                case 'D' -> message.append(letter).append(" is 'dog'\n");
                case 'E' -> message.append(letter).append(" is 'easy'\n");
                default -> message.append(letter).append(" not found\n");
            }
        }

        return message.toString().trim();
    }
}
