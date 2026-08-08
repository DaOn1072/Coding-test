import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] numbers = new int[n];
        
        for(int i = 0; i < n; i++){
            numbers[i] = sc.nextInt();
        }

        for(int j = n-1; j >= 0; j--){
            if(numbers[j] % 2 ==0){
                System.out.print(numbers[j]+" ");
            }
        }



    }
}