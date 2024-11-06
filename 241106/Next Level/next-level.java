import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String id;
        int level;

        id = sc.next();
        level = sc.nextInt();

        User user1 = new User();
        User user2 = new User(id, level);
        System.out.printf("user %s lv %d\n", user1.id, user1.level);
        System.out.printf("user %s lv %d", user2.id, user2.level);
    }
}

class User {
    String id;
    int level;

    public User(){
        id = "codetree";
        level = 10;
    }

    public User(String _id, int _level){
        id = _id;
        level = _level;
    }
}