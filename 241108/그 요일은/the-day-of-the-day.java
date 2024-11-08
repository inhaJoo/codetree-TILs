import java.util.Scanner;

public class Main {
    static int calculator(int m1, int d1, int m2, int d2, String day) {
        int[] num_of_date = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] str_of_days = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int startDay = 0;
        int endDay = 0;
        int diff;
        int week;
        int days;

        for(int i=1; i<m1; i++) 
            startDay += num_of_date[i];

        startDay += d1;

        for(int j=1; j<m2; j++)
            endDay += num_of_date[j];

        endDay += d2;
        diff = endDay - startDay;
        week = diff / 7;
        days = diff % 7;

        for(int i=0; i<str_of_days.length; i++) {
            if(day.equals(str_of_days[i])) {
                if(days == 0) {
                    return week + 1;
                }else{
                    return 
                }
            }
        }



        return endDay - startDay;
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

        // calculator(m1, d1, m2, d2);

        System.out.print(2 / 7);

    }
}