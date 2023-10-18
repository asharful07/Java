

// print the Details of Employee by creating an object

package Oops;
class Employee{
    int id;
    int salary;
    String name;

    public void PrintDetails(){
        System.out.println("Employee Id is: "+id);
        System.out.println("Employee name is: "+name);
        System.out.println("Employee salary is : "+salary);
    }
}
public class Question_01 {
    public static void main(String[] args) {
    Employee obj= new Employee();
    obj.id = 12;
    obj.salary=30000;
    obj.name="Shukla";
    obj.PrintDetails();
    }
}
