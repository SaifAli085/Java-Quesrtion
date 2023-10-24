import java.util.*;

 class PayoutBoundsException extends Exception{
     PayoutBoundsException(String msg){
        System.out.println("Payout of Bounds Exception: " + msg);

    }
}
public class Payout {
    public static void main(String[] args) throws PayoutBoundsException{
        System.out.print("Enter Employee Salary: ");
        Scanner sc = new Scanner( System.in);
        int pay = sc.nextInt();
        if (pay<10000 || pay>50000) {
            throw new PayoutBoundsException("Salary is not valid range");
        }
        else{
            System.out.println("Employee eligible for 30% hike");
        }
    }
}
