import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hap = 0;

        for(int i = 1; i <= n; i++){
            int a = sc.nextInt(), b = sc.nextInt();
            
            for(int j = a; j <= b; j++){
                if(j % 2 == 0){
                    hap += j;
                }
            }
            System.out.println(hap);
            hap = 0;
        }
    }
}