import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        

        int[] blocks = new int[N+1];

        for(int i=1; i<=K; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            
            for(int j=A; j<=B; j++) {
                blocks[j] += 1; 
            }
        }

        int max=0;
        for(int k=0; k<blocks.length; k++) {
            if(max < blocks[k]) {
                max = blocks[k];
            }
        }

        System.out.printf("%d ", max);
    }
}