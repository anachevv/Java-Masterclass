public class MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
    }
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.printf("%d KB = %d MB and %d KB", kiloBytes, kiloBytes / 1024, kiloBytes % 1024);
        }
    }
}
