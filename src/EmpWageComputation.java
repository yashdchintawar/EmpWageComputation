import java.util.Random;
import java.util.Scanner;

public class EmpWageComputation{
    final static int FULL_DAY = 8;
    final static int HALF_DAY = 4;


    public static void empwagecalculation(String empCompanyName, int empWagePerHour, int empMaxNumberOfHours, int empMaxNumberOfDays) {

        System.out.println("Welcome To Employee Wage Computation"); //welcome message

        int empCalculationMonthly = 0;
        int empDaysCount = 1;
        int empHoursCount = 0;

        while(empDaysCount<empMaxNumberOfDays && empHoursCount < empMaxNumberOfHours ) {

            int presntOrAbsent = (int) Math.floor(Math.random() * 2);
            int isPartOrFullTime = (int) Math.floor(Math.random() * 2);

            if (presntOrAbsent == 0) {
//                System.out.println("Employee is Present");
                if (empHoursCount < 92) {
                    if (isPartOrFullTime == 0) {
                        int Emp_Full_Day_Wage = empWagePerHour * FULL_DAY;
//                        System.out.println("Employee Full Day Wage Is: " + Emp_Full_Day_Wage);
                        empCalculationMonthly += Emp_Full_Day_Wage;
                        empHoursCount += 8;
                    }
                }
                else {
                    int Emp_Half_Day_Wage = empWagePerHour * HALF_DAY;
//                    System.out.println("Employee Half Day Wage Is: " + Emp_Half_Day_Wage);
                    empCalculationMonthly += Emp_Half_Day_Wage;
                    empHoursCount += 4;
                }

                empDaysCount++;
            }
                else{
//                    System.out.println("Employee is Absent");
            }
            }
        System.out.println("Employee Company Is: " + empCompanyName);
        System.out.println("Total Monthly Employee Wage is: " + empCalculationMonthly);
        System.out.println("Total Days Employee Wage is: " + empDaysCount);
        System.out.println("Total Hours Employee Wage is: " + empHoursCount);
        }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How Many Number Of Companies Do You Want To Calculate");
        int companyNumber = in.nextInt();

        for (int i = 0; i<companyNumber ; i++) {
            System.out.println("Enter Company Name");
            String companyName = in.next();

            System.out.println("Enter Wage Per Hour");
            int wagePerHour = in.nextInt();

            System.out.println("Enter Maximum Number Of Hours");
            int maxNumberOfHours = in.nextInt();

            System.out.println("Enter Maximum Number Of Days");
            int maxNumberOfDays = in.nextInt();

            empwagecalculation(companyName, wagePerHour, maxNumberOfHours, maxNumberOfDays);
        }
    }
    }
