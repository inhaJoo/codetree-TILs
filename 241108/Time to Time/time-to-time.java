import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int hour1, hour2, min1, min2, result;

        hour1 = sc.nextInt();
        min1 = sc.nextInt();
        hour2 = sc.nextInt();
        min2 = sc.nextInt();

        result = (hour2 * 60 + min2) - (hour1 * 60 + min1);

        System.out.print(result); 
    }
}