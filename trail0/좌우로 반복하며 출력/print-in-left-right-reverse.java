import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                int cnt = 1;
                for(int j = 0; j < n; j++){
                    System.out.print(cnt);
                    cnt++;
                }
                System.out.println();
            }else{
                int cnt = n;
                for(int j = n-1; j > -1; j--){
                    System.out.print(cnt);
                    cnt--;
                }
                System.out.println();
            }
        }
    }
}