import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        Scanner sc = new Scanner(System.in);

        int m1, d1, m2, d2, result=0;

        m1 = sc.nextInt();
        d1 = sc.nextInt();
        m2 = sc.nextInt();
        d2 = sc.nextInt();

        for(int i=m1; i<=m2; i++) {
            if(m1 != m2) {
                if(i == m1)
                    result += num_of_days[i] - d1 + 1;
                else if(i == m2)
                    result += d2;
                else
                    result += num_of_days[i];
            }else{
                result = d2 - d1 + 1;
            }
           
        }

       System.out.print(result);
    }
}