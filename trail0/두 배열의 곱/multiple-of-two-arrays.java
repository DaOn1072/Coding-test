import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int[][] matrix_1 = new int[3][3], matrix_2 = new int[3][3];
        int[][] answer = new int[3][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrix_1[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int x = 0; x < 3; x++){
                matrix_2[i][x] = sc.nextInt();
            }
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                answer[i][j] = matrix_1[i][j] * matrix_2[i][j];
                System.out.print(answer[i][j] + " ");
            }
            System.out.println();
        }

    }
}