//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        printIntegers(7);

        char[]chars={'a','b'};
        printChars(chars);

        System.out.println("release commit-1");
        System.out.println("release commit-2");
        System.out.println("Development finished its process");

    }
    public static void printIntegers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
    public static void printChars(char[] chars) {
        for (int i = 1; i <chars.length; i++) {
            System.out.print(chars[i]+ " ");
        }
    }

}