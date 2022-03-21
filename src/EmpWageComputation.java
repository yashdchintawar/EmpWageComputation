import java.util.Random;
import java.util.Scanner;

public class EmpWageComputation{
    final static int FULL_DAY = 8;
    final static int HALF_DAY = 4;

    private final String empCompanyName;
    private final int empWagePerHour;
    private final int empMaxNumberOfHours;
    private final int empMaxNumberOfDays;
    private int empCalculationMonthly;
    private int empHoursCount;
    private int empDaysCount;

    public EmpWageComputation(String empCompanyName, int empWagePerHour, int empMaxNumberOfHours, int empMaxNumberOfDays){
        this.empCompanyName = empCompanyName;
        this.empWagePerHour = empWagePerHour;
        this.empMaxNumberOfHours = empMaxNumberOfHours;
        this.empMaxNumberOfDays = empMaxNumberOfDays;

    }


    public void empwagecalculation() {

        System.out.println("Welcome To Employee Wage Computation"); //welcome message

        while (empDaysCount < empMaxNumberOfDays && empHoursCount < empMaxNumberOfHours) {

            int presentOrAbsent = (int) Math.floor(Math.random() * 2);
            int isPartOrFullTime = (int) Math.floor(Math.random() * 2);

            if (presentOrAbsent == 0) {
//                System.out.println("Employee is Present");
                if (empHoursCount < (empMaxNumberOfHours - 8)) {
                    if (isPartOrFullTime == 0) {
                        int Emp_Full_Day_Wage = empWagePerHour * FULL_DAY;
//                        System.out.println("Employee Full Day Wage Is: " + Emp_Full_Day_Wage);
                        empCalculationMonthly += Emp_Full_Day_Wage;
                        empHoursCount += 8;
                    }
                } else {
                    int Emp_Half_Day_Wage = empWagePerHour * HALF_DAY;
//                    System.out.println("Employee Half Day Wage Is: " + Emp_Half_Day_Wage);
                    empCalculationMonthly += Emp_Half_Day_Wage;
                    empHoursCount += 4;
                }

                empDaysCount++;
            } else {
//                    System.out.println("Employee is Absent");
            }
        }
    }
        @Override
        public String toString () {
            return '\n' + "EmpWageComputation Is " + '\n' +
                    "employee Company Name Is = " + " " + empCompanyName + '\n' +
                    "employee Wage Per Hour Is = " + " " + empWagePerHour + '\n' +
                    "employee Maximum Number Of Hours Is = " + " " + empMaxNumberOfHours + '\n' +
                    "employee Maximum Number Of Days Is = " + " " + empMaxNumberOfDays + '\n' +
                    "employee Total Worked Hours In Month Is = " + " " + empHoursCount + '\n' +
                    "employee Total Worked Days In Month Is = " + " " + empDaysCount + '\n' +
                    "employee Total Wage monthly Calculation Is = " + " " + empCalculationMonthly + '\n';
        }

    public static void main(String[] args) {
        EmpWageComputation company1 = new EmpWageComputation("dmart", 35,120, 25);
        EmpWageComputation company2 = new EmpWageComputation("Infy", 30,110, 22);

        company1.empwagecalculation();
        System.out.println(company1);

        company2.empwagecalculation();
        System.out.println(company2);

        }
    }
