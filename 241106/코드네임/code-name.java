import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char codeName;
        int score;

        Agent[] agents = new Agent[5];

        for(int i=0; i<5; i++){
            codeName = sc.next().charAt(0);
            score = sc.nextInt();
            agents[i] = new Agent(codeName, score);
        }

        int min=0;
        for(int i=1; i<agents.length; i++) {
            if(agents[min].score > agents[i].score){
                min = i;
            }
        }
        
        System.out.printf("%c %d", agents[min].codeName, agents[min].score);
    }
}

class Agent{
    char codeName;
    int score;

    public Agent(char _codeName, int _score) {
        codeName = _codeName;
        score = _score;
    }
}