import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        String date;
        String day;
        String weather;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Weather[] weathers = new Weather[n];

        for(int i=0; i<weathers.length; i++) {
            date = sc.next();
            day = sc.next();
            weather = sc.next();
            weathers[i] = new Weather(date, day, weather);
        }

        int min=0;
        for(int i=0; i<weathers.length; i++) {
            if("Rain".equals(weathers[i].weather)) {
                if(min == 0) {
                    min = i;
                }else{
                    if(weathers[min].date.compareTo(weathers[i].date) > 0) {
                        min = i;
                    }
                }
            }
        }

        System.out.printf("%s %s %s", weathers[min].date, weathers[min].day, weathers[min].weather);

        

    }
}

class Weather {
    String date;
    String day;
    String weather;

    public Weather(String _date, String _day, String _weather){
        date = _date;
        day = _day;
        weather = _weather;
    }
}