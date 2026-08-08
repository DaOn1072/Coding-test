import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[] n = new int[10];
        int t_cnt = 0, f_cnt = 0;

        for(int i = 0; i < 10; i++){
            n[i] = sc.nextInt();
            
            if(n[i] % 3 == 0){
                t_cnt++;
            }
            if(n[i] % 5 == 0){
                f_cnt++;
            }
        }

        System.out.printf("%d %d", t_cnt, f_cnt);
    }
}