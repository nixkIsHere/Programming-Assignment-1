import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "D:\\Year 2_2 2567\\ADT\\CSV\\class_roaster67.csv";

        // Check for command-line arguments
        if (args.length > 0) {
            if ("-f".equalsIgnoreCase(args[0]) && args.length > 1) {
                fileName = args[1];
            } else if ("-n".equalsIgnoreCase(args[0]) && args.length > 1) {
                fileName = args[1];
                // -n is not working
            } else if ("-l".equalsIgnoreCase(args[0]) && args.length > 1) {
                fileName = args[1];
                // - l is not working
            } else {
                System.out.println("Invalid command-line arguments");
                return;
            }
        }

        File f = new File(fileName);
        Scanner input = new Scanner(f, "UTF-8");
        // read the csv file

        Scanner forSort = new Scanner(System.in);

        for (int i = 0; i < 7 && input.hasNextLine(); i++) {
            input.nextLine();
            // #2Skip the unnecessary data line
        }

        Vector<Student> allStudent = new Vector<Student>();

        while (input.hasNextLine()) {

            String dataLine = input.nextLine();

            StringTokenizer token = new StringTokenizer(dataLine.trim(), ",");
            token.nextToken();

            if (token.hasMoreTokens()) {
                String firstName = "";
                String lastName = "";
                int SID;

                SID = Integer.parseInt(token.nextToken());
                if (token.hasMoreTokens()) {
                    firstName = token.nextToken();
                }
                if (token.hasMoreTokens()) {
                    lastName = token.nextToken();
                }
                allStudent.addElement(new Student(SID, firstName, lastName));
            }

        }

        // print data student

        System.out.println("\n\nTotal student :  " + allStudent.size());
        input.close();
        // close scanner from file
        Student sortStudent = new Student();
        boolean sortIsRun = true;

        while (sortIsRun) {
            System.out.println("Sort the student by student number(with argument -n)");
            System.out.println("Sort the student by first name(with argument -f)");
            System.out.println("Sort the student by last name(with argument -l)");
            System.out.println("Search the student by first name (with argument -s)");
            System.out.print("Exit program click Enter: ");

            String argument = forSort.nextLine();

            switch (argument.toLowerCase()) {
                case "n": {
                    System.out.println("Sort the student by student number\n\n");
                    sortStudent.sortBySID(allStudent);
                    break;

                }

                case "f": {
                    System.out.println("Sort the student by first name\n\n");
                    sortStudent.sortByFirstName(allStudent);
                    break;
                }

                case "l": {
                    System.out.println("Sort the student by last name\n\n");
                    sortStudent.sortByLastName(allStudent);
                    break;
                }
                case "s": {
                    System.out.println("Search for a student by first name:");
                    System.out.print("Enter the first name: ");
                    String searchName = forSort.nextLine();
                    Student.searchByFirstName(allStudent, searchName);
                    break;
                }            
                case "": {
                    sortIsRun = false;
                    break;
                }
                default:
                    System.out.println("\nType Incorrect\n");
                    break;
            }

        }

    }
}