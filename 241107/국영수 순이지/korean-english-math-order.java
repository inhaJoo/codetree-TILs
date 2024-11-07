import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        String name;
        int kor, eng, math;

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for(int i=0; i<students.length; i++) {
            name = sc.next();
            kor = sc.nextInt();
            eng = sc.nextInt();
            math = sc.nextInt();

            students[i] = new Student(name, kor, eng, math);
        }

        Arrays.sort(students);

        for(Student st: students) {
            System.out.printf("%s %d %d %d\n", st.name, st.kor, st.eng, st.math);
        }
    }
}

class Student implements Comparable<Student> {
    String name;
    int kor;
    int eng;
    int math;

    public Student(String _name, int _kor, int _eng, int _math) {
        name = _name;
        kor = _kor;
        eng = _eng;
        math = _math;
    }

    @Override
    public int compareTo(Student student) {
        if(student.kor == this.kor) {
            if(student.eng == this.eng) {
                return student.math - this.math;
            }
            return student.eng - this.eng;
        }
        return student.kor - this.kor;
    }
}