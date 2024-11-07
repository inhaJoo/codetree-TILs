import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Person[] people = new Person[n];

        String name;
        int height;
        int weight;

        for(int i=0; i<people.length; i++) {
            name = sc.next();
            height = sc.nextInt();
            weight = sc.nextInt();

            people[i] = new Person(name, height, weight);
        }

        Arrays.sort(people);

        for(Person ps : people) {
            System.out.printf("%s %d %d\n", ps.name, ps.height, ps.weight);
        }

    }
}

class Person implements Comparable<Person> {
    String name;
    int height;
    int weight;

    public Person(String _name, int _height, int _weight) {
        name = _name;
        height = _height;
        weight = _weight;
    }

    @Override
    public int compareTo(Person person){
        return this.height - person.height;
    }
}