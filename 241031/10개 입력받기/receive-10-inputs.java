import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];
        int sum=0;
        double average = 0.0;

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();

            if(arr[i] == 0) 
                break;

            sum+=arr[i];
            int cnt = i+1;
            average=(double)sum/cnt;

        }

        System.out.printf("%d %.1f", sum, average);
    }
}