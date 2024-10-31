public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int arr[][] = new int[5][5];
        
        for(int i=0; i< arr.length; i++) {
            for(int j=0; j< arr[i].length; j++) {
                if(i == 0 || j == 0) {
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i][j-1] + arr[i-1][j];
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}