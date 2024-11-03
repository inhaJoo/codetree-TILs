import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int first = sc.nextInt();
        int second = sc.nextInt();

        int arr[] = new int[10];

        arr[0] = first;
        arr[1] = second;

        for(int i=2; i<arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > 100) {
                int num = arr[i] % 100;
                arr[i] = num % 10;
            }else if(arr[i] > 10) {
                arr[i] = arr[i] % 10;
            }
            System.out.printf("%d ", arr[i]);
        }
    }
}