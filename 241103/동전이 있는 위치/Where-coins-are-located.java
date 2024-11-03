import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();

        int coins[][] = new int[n][n];

        for(int i=0; i<m; i++) {
            int r = sc.nextInt();
            int c = sc.nextInt();

            coins[r-1][c-1] = 1;
        }

        for(int coin[]: coins) {
            for(int result: coin){
                System.out.printf("%d ", result);
            }
            System.out.println();
        }
    }
}