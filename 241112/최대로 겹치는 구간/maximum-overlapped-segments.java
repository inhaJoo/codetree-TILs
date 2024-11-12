import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x1 = new int[n];
        int[] x2 = new int[n];
        int[] result = new int[101];

        for(int i=0; i<n; i++) {
            x1[i] = sc.nextInt();
            x2[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++) {
            for(int j=x1[i]; j<=x2[i]-1; j++) {
                result[j] += 1; 
            }
        }

        int max=0;
        for(int i=1; i<result.length; i++) {
            if(result[max] < result[i]) {
                max = result[i];
            }
        }

        System.out.print(max);
    }
}