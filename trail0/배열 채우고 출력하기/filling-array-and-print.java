import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] original = new String[10];

        for(int i = 0; i < 10; i++){
            original[i] = sc.next();
        }

        for(int j = 9; j >= 0; j--){
            System.out.print(original[j]);
        }
    }
}