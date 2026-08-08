import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();

        for(int i = 2; i < 10; i++){
            numbers[i] = (numbers[i-2]+numbers[i-1]) % 10;
        }

        for(int j = 0; j <10; j++){
            System.out.print(numbers[j]+" ");
        }
    }
}