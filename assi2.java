package Lab.lab4;
//2. Write program to create array of employee object, and print all employee
//information
public class assi2 {
        private String name;
        private int age;
        private double salary;
    
        // Constructor
        public assi2(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }
    
        // Getter methods
        public String getName() {
            return name;
        }
    
        public int getAge() {
            return age;
        }
    
        public double getSalary() {
            return salary;
        }
    
        // Method to print employee information
        public void printInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: $" + salary);
            System.out.println("--------------------");
        }
        public static void main(String[] args) {
            // Creating an array of Employee objects
            assi2[] employees = new assi2[3];
            
            // Initializing Employee objects and adding them to the array
            employees[0] = new assi2("John Doe", 30, 50000.0);
            employees[1] = new assi2("Jane Smith", 35, 60000.0);
            employees[2] = new assi2("David Lee", 28, 45000.0);
    
            // Printing information for each employee
            for (assi2 employee : employees) {
                employee.printInfo();
            }
        }
    }
    
