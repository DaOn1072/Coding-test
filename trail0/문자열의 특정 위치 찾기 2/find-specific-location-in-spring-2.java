import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] words = {"apple", "banana", "grape", "blueberry", "orange"};
        char s = sc.next().charAt(0);
        int cnt = 0;

        for(int i = 0; i < 5; i++){
            if(words[i].charAt(2) == s || words[i].charAt(3) == s){
               System.out.println(words[i]);
               cnt++; 
            }
        }

        System.out.println(cnt);
    }
}