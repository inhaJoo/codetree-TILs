import java.util.Scanner;

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

        System.out.printf("%c %d", agents[0].codeName, agents[0].score);
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