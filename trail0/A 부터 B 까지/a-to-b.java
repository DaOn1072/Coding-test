import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        while(a <= b){
            System.out.print(a+" ");
            if(a % 2 == 0){
                a += 3;
            }else if(a % 2 != 0){
                a *= 2;
            }
        }
    }
}