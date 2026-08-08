import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] numbers = new int[n];

        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
            numbers[i] = numbers[i] * numbers[i];
        }

        for(int j = 0; j < n; j++){
            System.out.print(numbers[j]+" ");
        }

    }
}