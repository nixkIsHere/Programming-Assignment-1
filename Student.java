import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;
import java.util.Arrays;

public class Student {
    private Integer UID;
    private String firstname;
    private String lastname;

    public Student(int u, String f, String l) {
        this.UID = u;
        this.firstname = f;
        this.lastname = l;
    }

    public Student() {

    }

    public int getSID() {
        return UID;
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String showResult() {
        return this.UID + " " + this.firstname + " " + this.lastname;
    }

    public static void sortBySID(Vector<Student> allStudent) {
        boolean swaped = true;
        while (swaped) {
            swaped = false;
            for (int i = 0; i < allStudent.size() - 1; i++) {
                if (allStudent.elementAt(i).getSID() > allStudent.elementAt(i + 1).getSID()) {
                    swaped = true;
                    Student temp = allStudent.elementAt(i);
                    allStudent.set(i, allStudent.elementAt(i + 1));
                    allStudent.set(i + 1, temp);
                }
            }
        }
        for (Student student : allStudent) {
            System.out.println(student.showResult());
        }
    }

    public static void sortByFirstName(Vector<Student> allStudent) {
        Comparator<Student> firstNameComparator = Comparator.comparing(Student::getFirstName);

        Collections.sort(allStudent, firstNameComparator);

        for (Student student : allStudent) {
            System.out.println(student.showResult());
        }
    }

    public static void sortByLastName(Vector<Student> allStudent) {
        Comparator<Student> lastNameComparator = Comparator.comparing(Student::getLastName);

        Collections.sort(allStudent, lastNameComparator);

        for (Student student : allStudent) {
            System.out.println(student.showResult());
        }
    }

    public static void searchByFirstName(Vector<Student> allStudent, String firstName) {
        boolean found = false;
    
        for (int i = 0; i < allStudent.size(); i++) {
            if (allStudent.elementAt(i).getFirstName().trim().equalsIgnoreCase(firstName.trim())) {
                System.out.println("Found at index " + i + ": " + allStudent.elementAt(i).showResult());
                found = true;
            }
        }
    
        if (!found) {
            System.out.println("Not found");
        }
    }    
}
