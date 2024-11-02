import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int num=1;

        int arr[][] = new int[n][m];

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = num;
                num+=1;
            }
        }

        for(int one[]: arr) {
            for(int result: one) {
                System.out.print(result + " ");
            }
            System.out.println();
        }
    }
}