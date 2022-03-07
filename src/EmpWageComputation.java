import java.util.Random;

public class EmpWageComputation {
    static int Wage_Per_Hour = 20;
    static int Full_Day_Hour = 8;
    static int Half_Day_Hour = 4;
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");

        int presntOrAbsent = (int)Math.floor(Math.random()*2);
        int isPartOrFullTime = (int)Math.floor(Math.random()*2);

        if (presntOrAbsent == 0){
            System.out.println("Employee is Present");
            if (isPartOrFullTime == 0){
                int Emp_Full_Day_Wage = Wage_Per_Hour * Full_Day_Hour;
                System.out.println("Employee Full Day Wage Is: " + Emp_Full_Day_Wage);
            }
            else{
                int Emp_Half_Day_Wage = Wage_Per_Hour * Half_Day_Hour;
                System.out.println("Employee Half Day Wage Is: " + Emp_Half_Day_Wage);
            }
        }
        else{
            System.out.println("Employee is Absent");
        }



    }

}
