import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String n = sc.next();
        int decimal = convertDecimal(a, n);
        convertBinary(b, decimal);
    }

    static int convertDecimal(int format, String n) {
        int num = 0;

        for(int i=0; i<n.length(); i++) {
            num = num * format + (n.charAt(i) - '0');
        }

        return num;
    }

    static void convertBinary(int format, int n) {
        int[] binary = new int[20];
        int cnt=0;

        while(true) {
            if(n<2) {
                binary[cnt++] = n;
                break;
            }


            binary[cnt++] = n % format;
            n/=format;
        }

        for(int i=cnt-1; i>=0; i--) {
            System.out.printf("%d",binary[i]);
        }
    }
}