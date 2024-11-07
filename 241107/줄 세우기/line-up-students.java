import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int height;
        int weight;
        int number;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Student[] students = new Student[n];

        for(int i=0; i<students.length; i++) {
            height = sc.nextInt();
            weight = sc.nextInt();
            number = i+1;

            students[i] = new Student(height, weight, number);
        }

        Arrays.sort(students);

        for(Student st: students) {
            System.out.printf("%d %d %d\n", st.height, st.weight, st.number);
        }
    }
}

class Student implements Comparable<Student> {
    int height, weight, number;

    public Student(int _height, int _weight, int _number) {
        height = _height;
        weight = _weight;
        number = _number;
    }

    @Override
    public int compareTo(Student student) {
        if(student.height == this.height) {
            if(student.weight == this.weight) {
                return this.number - student.number;
            }
            return student.weight - this.weight;
        }
        return student.height - this.height;
    }
}