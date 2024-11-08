import java.util.Scanner;

public class Main {
    static int calculator(int a, int b, int c) {
        int startDateTime = (11 * 24 * 60) + (11 * 60) + 11;
        int endDatetime = (a * 24 * 60) + (b * 60) + c;

        if(startDateTime > endDatetime) {
            return -1;
        }
        return endDatetime - startDateTime;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a,b,c,result;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        result = calculator(a,b,c);

        System.out.print(result);
    }
}