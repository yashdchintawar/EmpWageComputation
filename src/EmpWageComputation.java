import java.util.Random;

public class EmpWageComputation {
    public static void main(String[] args) {
        System.out.println("Welcome To Employee Wage Computation");
        int randomCheck = (int)Math.floor(Math.random()*2);

        if (randomCheck == 0){
            System.out.println("Employee Is Present");
        }
        else{
            System.out.println("Employee Is Absent");
        }
    }

}
