import java.util.Scanner;

public class Main {
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
        
        int diff = diffDay(m1, d1, m2, d2);
        int idx = idxDay(day);
        int result = cntDay(diff, idx);

        System.out.print(result);

    }

    static int diffDay(int m1, int d1, int m2, int d2) {
        int[] num_of_date = new int[]{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int startDay = 0;
        int endDay = 0;
        int diff;

        for(int i=1; i<m1; i++) 
            startDay += num_of_date[i];

        for(int j=1; j<m2; j++)
            endDay += num_of_date[j];

        startDay += d1;
        endDay += d2;
        diff = endDay - startDay;

        return diff;
    }

    static int idxDay(String day) {
        String[] arr_days = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int idx=0;

        for(int i=0; i<arr_days.length; i++) {
            if(day.equals(arr_days[i])) {
               idx = i; 
            }
        }

        return idx;
    }

    static int cntDay(int diff, int idx) {
        int[] cnt_days = new int[7];
        int week, cnt=0, result;
        week = diff / 7;

        for(int i=0; i<week+1; i++) {
            cnt_days[idx] = ++cnt;
        }
        
        result = cnt_days[idx];
        // for(int day: cnt_days) {
        //     System.out.printf("%d ", day);
        // }

        return result;

        

        

    }

        

        
}