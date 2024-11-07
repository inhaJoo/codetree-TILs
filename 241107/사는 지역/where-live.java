import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        String name;
        String addr;
        String city;
        
        Scanner sc =new Scanner(System.in);

        int n = sc.nextInt();

        Person[] people = new Person[n];

        for(int i=0; i<people.length; i++) {
            name = sc.next();
            addr = sc.next();
            city = sc.next();

            people[i] = new Person(name, addr, city);
        }

        int min=0;
        for(int i=1; i<people.length; i++){
            if(people[min].name.compareTo(people[i].name) < 0) {
                min = i;
            }
        }

        System.out.printf("name %s\naddr %s\ncity %s",people[min].name, people[min].addr, people[min].city);
     }
}

class Person {
    String name;
    String addr;
    String city;

    public Person(String _name, String _addr, String _city){
        name = _name;
        addr = _addr;
        city = _city;
    }
}