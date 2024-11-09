import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int result = convertDecimal(N);
        convertBinary(result * 17);
    }

    static int convertDecimal(String binary) {
        int num=0;

        for(int i=0; i<binary.length(); i++) {
            num = num * 2 + (binary.charAt(i) - '0');
        }

        return num;
    }

    static void convertBinary(int decimal) {
        int[] binary = new int[20];
        int cnt = 0;

        while(true){
            if(decimal < 2) {
                binary[cnt++] = decimal;
                break;
            }

            binary[cnt++] = decimal % 2;
            decimal /= 2;
        }

        for(int i=cnt-1; i>=0; i--) {
            System.out.print(binary[i]);
        }
    }
}