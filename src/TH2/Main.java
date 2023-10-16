package TH2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Tuan", 23, "Hà Nội");
        Student st2 = new Student("Mạnh", 21, "Hải Phòng");
        Student st3 = new Student("Nam", 19, "Thanh Hóa");
        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, st1);
        studentMap.put(2, st2);
        studentMap.put(3, st3);
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println(entry.toString());
        }
        System.out.println("......................................");
        Set<Student> students = new HashSet<Student>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        for (Student student : students) {
            System.out.println(student.toString());
        }

    }
}
