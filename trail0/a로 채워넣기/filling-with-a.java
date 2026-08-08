import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        char[] chars = text.toCharArray();

        chars[1] = 'a';
        chars[text.length()-2] = 'a';

        System.out.println(chars);

    }
}