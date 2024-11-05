import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[2*N];
        
        for(int i=0; i<arr.length;  i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int max = 0;
        for(int j=0; j<arr.length; j++){
            int groupSum = arr[j] + arr[2*N-1-j];

            if(groupSum > max) {
                max = groupSum;
            } 
        }
        System.out.printf("%d ", max);
        
    }
}