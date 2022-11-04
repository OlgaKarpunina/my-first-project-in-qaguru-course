import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithList {
    @Test
    public void createAndWorkWithList() {
        Student valera = new Student ();
        valera.setFirstName("Valera");
        valera.setLastName("The Tester");
        valera.setEmail("valera@valera.com");
        valera.setPhone("+37126760874");

        Student liga = new Student("Līga", "Ivanova", "liga@test.lv", "+37126760874");
        Student olga = new Student("Olga", "Karpunina", "olga@olga.lv", "+371256985");
        Student artis = new Student("Artis", "Smartis", null, "5454687");

        List<Student> students = new ArrayList<>();
        students.add(valera);
        students.add(liga);
        students.add(olga);
        students.add(artis);

        //---------------FOR-----------------------
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getFirstName());
        }

        //------------FOREACH----------------------------
        for (Student s : students) {
            System.out.println(s.getFirstName() + " " + s.getLastName());
            System.out.println(s.getFullName());

        }

        //------------------Foreach with IF--------------
        System.out.println("Printing students with phone nr starting with +371");
        for (Student s : students) {
            if (s.getPhone().startsWith("+371")){
                System.out.println(s.getFullName());
            }
        }

    }
}
