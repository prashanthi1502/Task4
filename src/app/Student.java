package app;

// Custom exception for age not within range
class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(int age) {
        super("Age not within range (15-21): " + age);
    }
}

// Custom exception for name not valid
class NameNotValidException extends Exception {
    public NameNotValidException(String name) {
        super("Name contains invalid characters: " + name);
    }
}

// Student class
class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException(age);
        }

        if (!name.matches("[a-zA-Z]+")) {
            throw new NameNotValidException(name);
        }

        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    // Getters
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }

    // Main method for testing
    public static void main(String[] args) {
        try {
            Student student1 = new Student(1, "Anitha", 20, "Computer Science");
            System.out.println("Student 1 created successfully: " + student1.getName());
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }

        try {
            Student student2 = new Student(2, "Lakshmi", 19, "Mathematics");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }

        try {
            Student student3 = new Student(3, "Prasanthi", 22, "Fullstack");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }
    }
}

