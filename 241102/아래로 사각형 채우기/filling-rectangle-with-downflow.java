import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt=1;

        int square[][] = new int[n][n];

        for(int i=0; i<square.length; i++) {
            for(int j=0; j<square[i].length; j++) {
                square[j][i]=cnt;
                cnt++;
            }
        }

        for(int one[]: square) {
            for(int num: one) {
                System.out.print(num +" ");
            }
            System.out.println();
        }
    }
}