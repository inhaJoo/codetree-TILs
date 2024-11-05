import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arrA = new int[n];
        int[] arrB = new int[n];

        for(int i=0; i<arrA.length; i++){
            arrA[i] = sc.nextInt();
        }

        for(int j=0; j<arrB.length; j++) {
            arrB[j] = sc.nextInt();
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        if(Arrays.equals(arrA, arrB)) {
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}