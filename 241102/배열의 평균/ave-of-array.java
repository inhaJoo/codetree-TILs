import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][4];
        int rowSum = 0;
        int colSum = 0;
        int sum = 0;
        double rowAverage = 0.0;
        double colAverage = 0.0;
        double average = 0.0;

        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
                rowSum += arr[i][j];
            }
            sum+=rowSum;
            rowAverage = (double)rowSum / 4;
            rowSum=0;
            System.out.printf("%.1f ",rowAverage);
        }
        System.out.println();

        for(int i=0; i<4; i++) {
            for(int j=0; j<2; j++) {
                colSum+=arr[j][i];
            }
            colAverage = colSum / 2;
            colSum=0;
            System.out.printf("%.1f ",colAverage);
        }

        average = (double)sum / 8;
        System.out.printf("\n%.1f", average);
    }
}