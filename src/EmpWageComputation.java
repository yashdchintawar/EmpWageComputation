import java.util.Random;

public class EmpWageComputation {
    static int Wage_Per_Hour = 20;
    static int Full_Day_Hour = 8;
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");

        int Emp_Full_Day_Wage = Wage_Per_Hour * Full_Day_Hour;
        System.out.println("Employee Full Day Wage Is: " + Emp_Full_Day_Wage);
    }

}
