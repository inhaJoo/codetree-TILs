import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        String secretCode = sc.next();
        secretCode.toLowerCase();
        String meetingPlace = sc.next();
        meetingPlace.toUpperCase();
        int time=0;

        do{
            time = sc.nextInt();
            if(time >=1 && time <=24) {
                break;
            }
        }while(time < 1 && time > 24);
        
        ZZS zzs = new ZZS(secretCode, meetingPlace, time);
        
        System.out.println("secret code : "+zzs.secretCode);
        System.out.println("meeting point : "+zzs.meetingPlace);
        System.out.println("time : "+zzs.time);
    }

    
}

class ZZS {
    String secretCode;
    String meetingPlace;
    int time;

    public ZZS(String secretCode, String meetingPlace, int time) {
        this.secretCode = secretCode;
        this.meetingPlace = meetingPlace;
        this.time = time;
    }
}