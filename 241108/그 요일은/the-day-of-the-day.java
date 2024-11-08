import java.util.Scanner;

public class Main {
    static int calculator(int m1, int d1, int m2, int d2, String day) {
        int[] num_of_date = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days_arr = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        int[] counts = new int[7];

        int startDay = 0;
        int endDay = 0;
        int diff;
        int idx=0;
        int week;
        int cnt=1;
        int result=0;

        for(int i=1; i<m1; i++) 
            startDay += num_of_date[i];

        startDay += d1;

        for(int j=1; j<m2; j++)
            endDay += num_of_date[j];

        endDay += d2;
        diff = endDay - startDay;
        week = diff / 7;

        for(int i=0; i<days_arr.length; i++) {
            if(day.equals(days_arr[i])) {
                idx=i;
            }
        }

        for(int j=0; j<=week; j++) {
            counts[idx] = cnt;
            cnt++;
        }

        result = counts[idx];

        return result;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m1, d1, m2, d2;
        String day;

        m1 = sc.nextInt();
        d1 = sc.nextInt();
        m2 = sc.nextInt();
        d2 = sc.nextInt();
        day = sc.next();

        int result = calculator(m1, d1, m2, d2, day);

        System.out.print(result);

    }
}