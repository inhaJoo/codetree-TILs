import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int B = sc.nextInt();
        int cnt=0;

        int[] Numbers = new int[20];

        while(true){
            if(N < B) {
                Numbers[cnt++] = N;
                break;
            }

            Numbers[cnt++] = N % B;
            N /= B;
        }
        // System.out.println(cnt);
        for(int i=cnt-1; i>=0; i--) {
            System.out.print(Numbers[i]);
        } 
    }
}