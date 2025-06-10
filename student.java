class Student {
    String name;
    String rollNo;
    String dept;

    // Constructor to initialize student details
    public Student(String name, String rollNo, String dept) {
        this.name = name;
        this.rollNo = rollNo;
        this.dept = dept;
    }

    // Method to print student details
    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Department: " + dept);
    }

    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student("John Doe", "12345", "Computer Science");
        Student student2 = new Student("Jane Smith", "67890", "Electrical Engineering");

        // Print student details
        student1.printDetails();
        student2.printDetails();
    }
}

