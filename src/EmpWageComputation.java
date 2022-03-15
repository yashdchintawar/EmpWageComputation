import java.util.Random;

public class EmpWageComputation{
    static int Wage_Per_Hour = 20;
    static int Full_Day_Hour = 8;
    static int Half_Day_Hour = 4;
    public static void empwagecalculation() {

        System.out.println("Welcome To Employee Wage Computation");

        int empCalculationMonthly = 0;
        int empDaysCount = 1;
        int empHoursCount = 0;

        while(empDaysCount<20 && empHoursCount < 100 ) {

            int presntOrAbsent = (int) Math.floor(Math.random() * 2);
            int isPartOrFullTime = (int) Math.floor(Math.random() * 2);

            if (presntOrAbsent == 0) {
                System.out.println("Employee is Present");
                if (empHoursCount < 92) {
                    if (isPartOrFullTime == 0) {
                        int Emp_Full_Day_Wage = Wage_Per_Hour * Full_Day_Hour;
                        System.out.println("Employee Full Day Wage Is: " + Emp_Full_Day_Wage);
                        empCalculationMonthly += Emp_Full_Day_Wage;
                        empHoursCount += 8;
                    }
                }
                else {
                    int Emp_Half_Day_Wage = Wage_Per_Hour * Half_Day_Hour;
                    System.out.println("Employee Half Day Wage Is: " + Emp_Half_Day_Wage);
                    empCalculationMonthly += Emp_Half_Day_Wage;
                    empHoursCount += 4;
                }

                empDaysCount++;
            }
                else{
                    System.out.println("Employee is Absent");
            }
            }
        System.out.println("Total Monthly Employee Wage is: " + empCalculationMonthly);
        System.out.println("Total Days Employee Wage is: " + empDaysCount);
        System.out.println("Total Hours Employee Wage is: " + empHoursCount);
        }

    public static void main(String[] args) {
        empwagecalculation();
    }
    }
