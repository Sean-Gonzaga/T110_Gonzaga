import java.util.Scanner;

public class Mi2Act1 {
    public static void main(String[] args) {

                double taxed_sal, taxed_sala, tax;//declaration of variables

                //asking for user input
                Scanner scan = new Scanner(System.in);
                System.out.print("\nInput Employee #1 Name: ");
                String emp1_name = scan.next();
                System.out.print("Input Employee #1 ID#: ");
                int emp1_id = scan.nextInt();
                System.out.print("Input Employee #1 Salary: ");
                double emp1_sal = scan.nextDouble();

                //calculations
                tax = emp1_sal * .10;
                taxed_sal = emp1_sal - tax;

                //asking for user input
                System.out.print("\nInput Employee #2 Name: ");
                String emp2_name = scan.next();
                System.out.print("Input Employee #2 ID#: ");
                int emp2_id = scan.nextInt();
                System.out.print("Input Employee #2 Salary: ");
                double emp2_sal = scan.nextDouble();

                //calculations
                tax = emp2_sal * .10;
                taxed_sala = emp2_sal - tax;

                employee obj1 = new employee(emp1_name, emp1_id, taxed_sal);//creating an object of first employee
                
                //Printing values of the objects 
                System.out.print("\nName: " + obj1.name);//accessing employee through reference variable
                System.out.print(" ; ID#: " + obj1.id);
                System.out.print(" ; Salary: " + obj1.salary);

                employee obj2 = new employee(emp2_name, emp2_id, taxed_sala);//creating an object of second employee

                //Printing values of the objects 
                System.out.print("\nName: " + obj2.name);//accessing employee through reference variable
                System.out.print(" ; ID#: " + obj2.id);
                System.out.print(" ; Salary: " + obj2.salary);

                scan.close();
             
    }
}