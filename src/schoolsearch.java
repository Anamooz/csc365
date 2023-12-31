
import java.io.FileReader;
import java.util.Scanner;

public class schoolsearch {
    public static String prompt() {
        System.out.println("Type out an option,");
        System.out.println("Student: <last name> Bus");
        System.out.println("Teacher: <last name>");
        System.out.println("Bus: <number>");
        System.out.println("Grade: <number> High | Low");
        System.out.println("Average: <number>");
        System.out.println("Info");
        System.out.println("Quit");

        Scanner keyboard = new Scanner(System.in);
        String input = keyboard.nextLine(); //user input from scanner
        input = input.toUpperCase(); //capitalizes user input bc text file is all uppercase
        return input;
    }

    public static void main(String[] args) {
        Students student = new Students();

        String input = prompt();

        if (input.equals("QUIT")) {
            System.exit(0);
        }

        double highestGPA = 0.0;
        double lowestGPA = 4.0;
        int count = 0;
        double total = 0;

        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        int threeCount = 0;
        int fourCount = 0;
        int fiveCount = 0;
        int sixCount = 0;


        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileReader("students.txt"));
        } catch (Exception e) {
            System.out.println("This not a valid file, exiting...");
            System.exit(0);
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] split = line.split(",");
            student.setStLastName(split[0]);
            student.setStFirstName(split[1]);
            student.setGrade(Integer.parseInt(split[2]));
            student.setClassroom(Integer.parseInt(split[3]));
            student.setBus(Integer.parseInt(split[4]));
            student.setGpa(Double.parseDouble(split[5]));
            student.setTLastName(split[6]);
            student.setTFirstName(split[7]);

            student.studentKeyWord(input);
            student.teacherKeyWord(input);
            student.busKeyWord(input);

            if (input.contains("GRADE") && input.contains("HIGH") && input.contains(String.valueOf(student.getGrade()))) {
                highestGPA = Math.max(student.getGpa(), highestGPA);
            } else if (input.contains("GRADE") && input.contains("LOW") && input.contains(String.valueOf(student.getGrade()))) {
                lowestGPA = Math.min(student.getGpa(), lowestGPA);
            } else if (input.contains("GRADE") && input.contains(String.valueOf(student.getGrade()))) {
                System.out.println("Student's last name: " + student.getStLastName() + ", Student's first name: " + student.getStFirstName());
            }

            if (input.contains("AVERAGE") && input.contains(String.valueOf(student.getGrade()))) {
                total += student.getGpa();
                count++;
            }

            if (input.contains("INFO") && student.getGrade() == 0) {
                zeroCount++;
            } else if (student.getGrade() == 1) {
                oneCount++;
            } else if (student.getGrade() == 2) {
                twoCount++;
            } else if (student.getGrade() == 3) {
                threeCount++;
            } else if (student.getGrade() == 4) {
                fourCount++;
            } else if (student.getGrade() == 5) {
                fiveCount++;
            } else {
                sixCount++;
            }
        }

        if (input.contains("GRADE") && input.contains("HIGH")) {
            System.out.printf("Student GPA: %.2f \n", highestGPA);
        }

        if (input.contains("GRADE") && input.contains("LOW")) {
            System.out.printf("Student GPA: %.2f \n", lowestGPA);
        }

        if (input.contains("AVERAGE")) {
            double average = total / count;
            input = input.toLowerCase();
            System.out.printf("GPA " + input + "th grade: %.2f \n", average);
        }

        if (input.contains("INFO")) {
            System.out.println("Grade 0 student count: " + zeroCount);
            System.out.println("Grade 1 student count: " + oneCount);
            System.out.println("Grade 2 student count: " + twoCount);
            System.out.println("Grade 3 student count: " + threeCount);
            System.out.println("Grade 4 student count: " + fourCount);
            System.out.println("Grade 5 student count: " + fiveCount);
            System.out.println("Grade 6 student count: " + sixCount);
        }

        while (!input.equals("QUIT")){

            input = prompt();

            if (input.equals("QUIT")){
                System.exit(0);
            }

            try {
                scanner = new Scanner(new FileReader("students.txt"));
            } catch (Exception e) {
                System.out.println("This not a valid file, exiting...");
                System.exit(0);
            }

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] split = line.split(",");
                student.setStLastName(split[0]);
                student.setStFirstName(split[1]);
                student.setGrade(Integer.parseInt(split[2]));
                student.setClassroom(Integer.parseInt(split[3]));
                student.setBus(Integer.parseInt(split[4]));
                student.setGpa(Double.parseDouble(split[5]));
                student.setTLastName(split[6]);
                student.setTFirstName(split[7]);

                student.studentKeyWord(input);
                student.teacherKeyWord(input);
                student.busKeyWord(input);

                if (input.contains("GRADE") && input.contains("HIGH") && input.contains(String.valueOf(student.getGrade()))) {
                    highestGPA = Math.max(student.getGpa(), highestGPA);
                } else if (input.contains("GRADE") && input.contains("LOW") && input.contains(String.valueOf(student.getGrade()))) {
                    lowestGPA = Math.min(student.getGpa(), lowestGPA);
                } else if (input.contains("GRADE") && input.contains(String.valueOf(student.getGrade()))) {
                    System.out.println("Student's last name: " + student.getStLastName() + ", Student's first name: " + student.getStFirstName());
                }

                if (input.contains("AVERAGE") && input.contains(String.valueOf(student.getGrade()))) {
                    total += student.getGpa();
                    count++;
                }

                if (input.contains("INFO") && student.getGrade() == 0) {
                    zeroCount++;
                } else if (student.getGrade() == 1) {
                    oneCount++;
                } else if (student.getGrade() == 2) {
                    twoCount++;
                } else if (student.getGrade() == 3) {
                    threeCount++;
                } else if (student.getGrade() == 4) {
                    fourCount++;
                } else if (student.getGrade() == 5) {
                    fiveCount++;
                } else {
                    sixCount++;
                }
            }

            if (input.contains("GRADE") && input.contains("HIGH")) {
                System.out.printf("Student GPA: %.2f \n", highestGPA);
            }

            if (input.contains("GRADE") && input.contains("LOW")) {
                System.out.printf("Student GPA: %.2f \n", lowestGPA);
            }

            if (input.contains("AVERAGE")) {
                double average = total / count;
                input = input.toLowerCase();
                System.out.printf("GPA " + input + "th grade: %.2f", average);
                System.out.println();
            }

            if (input.contains("INFO")) {
                System.out.println("Grade 0 student count: " + zeroCount);
                System.out.println("Grade 1 student count: " + oneCount);
                System.out.println("Grade 2 student count: " + twoCount);
                System.out.println("Grade 3 student count: " + threeCount);
                System.out.println("Grade 4 student count: " + fourCount);
                System.out.println("Grade 5 student count: " + fiveCount);
                System.out.println("Grade 6 student count: " + sixCount);
            }
        }
    }
}
