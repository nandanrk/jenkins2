

class Student {
    // Fields (Attributes)
     String name;
     int id;
     double[] marks;

    // Constructor
    public Student(String name, int id, double[] marks) {
        this.name = name;
        this.id = id;
        this.marks = marks;
    }

    // Method to calculate average marks
    public double getAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    // Method to display student details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.print("Marks: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage: " + getAverage());
    }

    // Main.java
    public static void main(String[] args) {
        double[] marks = {85.5, 90.0, 78.5};

        Student student1 = new Student("Alice", 101, marks);
        student1.displayInfo();
    }
}


