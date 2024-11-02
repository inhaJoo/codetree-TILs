import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int cnt=0;

        int rectangle[][] = new int[n][m];

        for(int i=1; i<=m; i++) {
            if(i%2 == 0) {
                for(int j=n; j>0; j--) {
                    rectangle[j-1][i-1]=cnt;
                    cnt++;
                }
            }else{
                for(int j=1; j<=n; j++) {
                
                    rectangle[j-1][i-1]=cnt;
                    cnt++;
                }
            }
        }

        for(int one[]: rectangle) {
            for(int num: one) {
                System.out.printf("%d ", num);
            }
            System.out.println();
        }

        
    }
}