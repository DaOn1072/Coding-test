import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a = sc.next(), b = sc.next();

        int len_a = a.length(), len_b = b.length();

        if(len_a > len_b){
            System.out.printf("%s %d", a, len_a);
        }else if(len_a < len_b){
            System.out.printf("%s %d", b, len_b);
        }else{
            System.out.printf("same");
        }

    }
}