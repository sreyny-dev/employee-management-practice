import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<>();
        createEmployee(employeeList);
        printEmployee(employeeList);
        deleteEmplyee(employeeList);
        createEmployee(employeeList);
        printEmployee(employeeList);
    }
    //method to print employee
    public static void printEmployee(List<Employee> employeeList) {

        for(Employee emp:employeeList){
            System.out.print(
                    "id:" +emp.id+", "+
                            "Name: "+emp.name+", "+
                            "Age: "+emp.age+", "+
                            "Salary: "+emp.salary+"$, "+
                            "Position: "+emp.position+ ", "+
                            "isDeleted: "+emp.isDeleted
            );
            System.out.println();
        }

    }

    //method to creaet user
    public static List<Employee> createEmployee(List<Employee> employeeList){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Enter information of Employee"+" "+(i+1)+": ");
            System.out.print("Emplaoyee Name: ");
            String name=sc.nextLine();

            //validate employee
            boolean exist=false;
            if(employeeList!=null){
                for(Employee e: employeeList){
                    if(name.equals(e.name)){
                        exist=true;
                        break;
                    }
                }
            }


            System.out.print("Emplaoyee Age: ");
            int age=sc.nextInt();
            System.out.print("Employee salary: ");
            double salary=sc.nextDouble();
            sc.nextLine();
            System.out.print("Employee Position: ");
            String position=sc.nextLine();


            if(!exist){
                Employee emp=new Employee(i+1,name,age,salary,position,false);
                employeeList.add(emp);
            }else{
                System.out.println("-----------Employee "+name+" already exists-----------");
            }
        }

        return employeeList;
    }

    //delete employee
    public static List<Employee> deleteEmplyee(List<Employee> employeeList){
        System.out.print("Enter employee's id to delete: ");
        Scanner sc=new Scanner(System.in);
        int id=sc.nextInt();
        employeeList.remove(id-1);
        return employeeList;
    }


}