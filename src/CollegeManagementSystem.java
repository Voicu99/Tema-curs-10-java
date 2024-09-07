import java.util.ArrayList;
import java.util.List;

// Class to represent a Student
class Student {
    private String firstName;
    private String lastName;
    private String sex;
    private int age;
    private String dateOfBirth;
    private String cnp;  // CNP - Personal Numeric Code
    private String address;

    public Student(String firstName, String lastName, String sex, int age, String dateOfBirth, String cnp, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.cnp = cnp;
        this.address = address;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student: " + firstName + " " + lastName + ", Sex: " + sex + ", Age: " + age +
                ", DOB: " + dateOfBirth + ", CNP: " + cnp + ", Address: " + address);
    }
}

// Class to represent a Professor
class Professor {
    public String firstName;
    public String lastName;
    private String sex;
    private int age;
    private String dateOfBirth;
    private String cnp;
    private String address;

    public Professor(String firstName, String lastName, String sex, int age, String dateOfBirth, String cnp, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.cnp = cnp;
        this.address = address;
    }

    // Method to display professor details
    public void displayProfessorDetails() {
        System.out.println("Professor: " + firstName + " " + lastName + ", Sex: " + sex + ", Age: " + age +
                ", DOB: " + dateOfBirth + ", CNP: " + cnp + ", Address: " + address);
    }
}

// Class to represent a Course
class Course {
    public String name;
    private String schedule;
    private String duration;
    private String description;
    private Professor assignedProfessor;

    public Course(String name, String schedule, String duration, String description) {
        this.name = name;
        this.schedule = schedule;
        this.duration = duration;
        this.description = description;
    }

    // Method to assign a professor to this course
    public void assignProfessor(Professor professor) {
        this.assignedProfessor = professor;
    }

    // Method to display course details along with assigned professor
    public void displayCourseDetails() {
        System.out.println("Course: " + name + ", Schedule: " + schedule + ", Duration: " + duration +
                ", Description: " + description);
        if (assignedProfessor != null) {
            System.out.print("Assigned Professor: ");
            assignedProfessor.displayProfessorDetails();
        } else {
            System.out.println("Assigned Professor: None");
        }
    }
}

// Class to represent the College
class College {
    private List<Student> students;
    private List<Professor> professors;
    private List<Course> courses;

    public College() {
        this.students = new ArrayList<>();
        this.professors = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    // Add a new student
    public void addStudent(Student student) {
        students.add(student);
    }

    // Add a new professor
    public void addProfessor(Professor professor) {
        professors.add(professor);
    }

    // Add a new course
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Assign a professor to a course
    public void assignProfessorToCourse(String courseName, Professor professor) {
        for (Course course : courses) {
            if (courseName.equalsIgnoreCase(course.name)) {
                course.assignProfessor(professor);
                System.out.println("Assigned " + professor.firstName + " " + professor.lastName + " to " + courseName);
                return;
            }
        }
        System.out.println("Course not found.");
    }

    // Display details of all courses
    public void viewCourses() {
        for (Course course : courses) {
            course.displayCourseDetails();
        }
    }

    // Display details of all students
    public void viewStudents() {
        for (Student student : students) {
            student.displayStudentDetails();
        }
    }

    // Display details of all professors
    public void viewProfessors() {
        for (Professor professor : professors) {
            professor.displayProfessorDetails();
        }
    }
}

// Main class to run the program
public class CollegeManagementSystem {
    public static void main(String[] args) {
        // Create an instance of College
        College college = new College();

        // Create some students
        Student student1 = new Student("John", "Doe", "Male", 20, "2004-01-01", "1234567890123", "123 Main St.");
        Student student2 = new Student("Jane", "Smith", "Female", 22, "2002-02-02", "9876543210123", "456 Oak St.");
        Student student3 = new Student("Bob", "Johnson", "Male", 21, "2003-03-03", "4564564564567", "789 Elm St.");
        Student student4 = new Student("Alice", "Williams", "Female", 23, "2001-04-04", "6546546546543", "321 Pine St.");
        Student student5 = new Student("Charlie", "Brown", "Male", 19, "2005-05-05", "7897897897890", "963 Willow St.");
        Student student6 = new Student("Eve", "Davis", "Female", 20, "2004-06-06", "9879879879876", "852 Cedar St.");
        Student student7 = new Student("Tom", "Clark", "Male", 22, "2002-07-07", "3213213213210", "741 Maple St.");
        Student student8 = new Student("Lucy", "White", "Female", 21, "2003-08-08", "1231231231236", "159 Birch St.");

        // Add students to the college
        college.addStudent(student1);
        college.addStudent(student2);
        college.addStudent(student3);
        college.addStudent(student4);
        college.addStudent(student5);
        college.addStudent(student6);
        college.addStudent(student7);
        college.addStudent(student8);

        // Create some professors
        Professor professor1 = new Professor("Alan", "Turing", "Male", 45, "1979-03-03", "1231231231234", "789 Pine St.");
        Professor professor2 = new Professor("Ada", "Lovelace", "Female", 40, "1983-04-04", "3213213213214", "321 Cedar St.");
        Professor professor3 = new Professor("Marie", "Curie", "Female", 50, "1973-05-05", "4564564564567", "654 Oak St.");
        Professor professor4 = new Professor("Isaac", "Newton", "Male", 55, "1968-06-06", "7897897897890", "951 Elm St.");
        Professor professor5 = new Professor("Charles", "Darwin", "Male", 52, "1971-07-07", "9879879879871", "753 Willow St.");
        Professor professor6 = new Professor("Galileo", "Galilei", "Male", 48, "1976-08-08", "3213213213218", "357 Cedar St.");
        Professor professor7 = new Professor("Sigmund", "Freud", "Male", 60, "1963-09-09", "1231231231237", "159 Maple St.");
        Professor professor8 = new Professor("Jane", "Austen", "Female", 43, "1980-10-10", "9879879879879", "258 Birch St.");

        // Add professors to the college
        college.addProfessor(professor1);
        college.addProfessor(professor2);
        college.addProfessor(professor3);
        college.addProfessor(professor4);
        college.addProfessor(professor5);
        college.addProfessor(professor6);
        college.addProfessor(professor7);
        college.addProfessor(professor8);

        // Create some courses
        Course course1 = new Course("Math", "Mon/Wed/Fri 9-10am", "3 months", "Advanced Calculus");
        Course course2 = new Course("Computer Science", "Tue/Thu 2-4pm", "4 months", "Intro to Programming");
        Course course3 = new Course("Physics", "Mon/Wed/Fri 10-11am", "3 months", "Mechanics and Waves");
        Course course4 = new Course("Chemistry", "Tue/Thu 9-11am", "4 months", "Organic Chemistry");
        Course course5 = new Course("Biology", "Mon/Wed 1-2pm", "3 months", "Genetics and Evolution");
        Course course6 = new Course("Geography", "Tue/Thu 10-11:30am", "4 months", "Physical Geography");
        Course course7 = new Course("English", "Mon/Wed/Fri 11am-12pm", "3 months", "Shakespearean Literature");
        Course course8 = new Course("History", "Tue/Thu 1-3pm", "4 months", "World History");

        // Add courses to the college
        college.addCourse(course1);
        college.addCourse(course2);
        college.addCourse(course3);
        college.addCourse(course4);
        college.addCourse(course5);
        college.addCourse(course6);
        college.addCourse(course7);
        college.addCourse(course8);

        // Assign professors to courses
        college.assignProfessorToCourse("Math", professor1);
        college.assignProfessorToCourse("Computer Science", professor2);
        college.assignProfessorToCourse("Physics", professor3);
        college.assignProfessorToCourse("Chemistry", professor4);
        college.assignProfessorToCourse("Biology", professor5);
        college.assignProfessorToCourse("Geography", professor6);
        college.assignProfessorToCourse("English", professor7);
        college.assignProfessorToCourse("History", professor8);

        // Display all courses
        System.out.println("\n--- Courses Offered ---");
        college.viewCourses();

        // Display all students
        System.out.println("\n--- Student List ---");
        college.viewStudents();

        // Display all professors
        System.out.println("\n--- Professor List ---");
        college.viewProfessors();
    }
}
